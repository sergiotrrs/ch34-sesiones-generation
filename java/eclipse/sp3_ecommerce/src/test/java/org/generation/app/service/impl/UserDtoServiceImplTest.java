package org.generation.app.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.generation.app.dto.UserDto;
import org.generation.app.entity.Role;
import org.generation.app.entity.User;
import org.generation.app.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserDtoServiceImplTest {
	
	@InjectMocks
	private UserDtoServiceImpl userDtoService;
	
	@Mock
	private UserService userService;
	
	User userMock;
	
	@BeforeEach
	public void setUp() {
		userMock = User.builder()
				.id(100L)
				.firstName("Christofer")
				.lastName("Robin")
				.email("robin@disney.com")
				.password("t1gg3r")
				.active(true)
				.role( new Role(2L,"CUSTOMER", "Cliente" ) )
				.build();
	}
	
	@Test
	void createCustomerTest() {
		User postUser = User.builder()
				.id(null)
				.firstName("Christofer")
				.lastName("Robin")
				.email("robin@disney.com")
				.password("tigger")
				.active(false)
				.build();
		Mockito.when(  userService.createUser(postUser) ).thenReturn(  userMock );
		
		UserDto registeredUserDto = userDtoService.createCustomer(postUser);
		
		assertEquals( "Christofer" , registeredUserDto.getFirstName(), "Verificando el nombre" );
		assertEquals( "robin@disney.com" , registeredUserDto.getEmail(), "Verificando el email" );
		
	}

}
