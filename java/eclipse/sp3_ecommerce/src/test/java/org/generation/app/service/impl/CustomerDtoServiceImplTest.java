package org.generation.app.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.generation.app.dto.UserDto;
import org.generation.app.entity.User;
import org.generation.app.repository.UserRepository;
import org.generation.app.service.UserDtoService;
import org.generation.app.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/*
 *  Mockito es una biblioteca de pruebas unitarias
 *  que se utiliza para simular objetos y comportamiento
 *  de pruebas unitarias.
 *  
 *  Proporciona una forma sencilla y flexible de crear objetos
 *  simulados(mocks) que se utilizan como sustitutos de los objetos
 *  reales en las pruebas.
 *  
 *  En este ejercicio se simulará el objeto userRepository
 *  Para que entregue el valor que necesita el servicio de getUserById
 *  de las clase UserService.
 */

// Lo siguiente inicializará automáticamente los objetos mock y
// las anotaciones de Mockito en la clase prueba
@ExtendWith(MockitoExtension.class)
public class CustomerDtoServiceImplTest {
	
	// Inyectar automáticamente los objetos mocks en la clase bajo prueba.
	@InjectMocks
	private UserServiceImpl userService;
	
	// Crea un objeto mock de una clase o interfaz determinada.
	// Este objeto mock puede ser utilizado para simular el
	// comportamiento de la clase o interfaz durante
	// la ejecución de la prueba unitaria.
	@Mock
	private UserRepository userRepository;
	
	User userMock;
	
	// El método debe ejecutarse antes de cada prueba unitaria.
	@BeforeEach
	public void setUp() {
//		userMock = new User();
//		userMock.setFirstName("Christofer");
//		userMock.setLastName("Robin");
		
		userMock = User.builder()
				.id(100L)
				.firstName("Christofer")
				.lastName("Robin")
				.email("robin@disney.com")
				.password("tigger")
				.active(true)
				.build();
	}
	
	@Test
	void getUserByIdTest() {
		// Definir el comportamiento esperado de un mock
		// ¿Qué va a realizar el objeto simulado?
		Mockito.when(  userRepository.findById(100L) ).thenReturn(  Optional.of( userMock) );
		
		// Invicamos el método a probar
		User existingUser = userService.getUserById(100L);
		
		// realizar comparaciones
		assertEquals( 100L, existingUser.getId() , "Verificando el Id"  );
		assertEquals( "robin@disney.com", existingUser.getEmail() , "Verificando el email"  );
		assertEquals( "Robin", existingUser.getLastName() , "Verificando el apellido"  );
	}

}
