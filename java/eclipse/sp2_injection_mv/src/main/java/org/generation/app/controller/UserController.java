package org.generation.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.generation.app.model.User;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/users")
public class UserController {
	
	User user;

	/*
	 *  Request Param
	 *  Vincula los parámetros de una solicitud HTTP con los
	 *  parámetros del método.
	 *  Permite extraer los valores de los parámetros de 
	 *  la consulta (query parameters).
	 *  Si no se proporciona los valores, se genera la excepción
	 *  MissingServletRequestParametersException
	 *  
	 */
	@GetMapping // localhost:8080/api/v1/users?count=4
	Map<Integer, User> getAllUser( 
			@RequestParam(name="count", required=false, defaultValue="0") int count
			){
		
		if (count == 0) return User.usersMock(); 
		
		Map<Integer, User> filterUsers = new HashMap<>(); 
		List<Integer> usersKey = new ArrayList<>();
		
		for (int clave : User.usersMock().keySet() ) {
			usersKey.add( clave );
		}
		
		for (int i = 0; i < count; i++) {
			int userKey = usersKey.get(i);
			filterUsers.put(  userKey , User.usersMock().get(userKey) );
		}
				
		return filterUsers;
	}
	
	/*
	 *  @GetMapping con Path Variable
	 *  Path Variable vincula un valor de una variable URL
	 *  a un parámetro del método.
	 *  Permite capturar datos dinámicos presentes en la URL 
	 */
	@GetMapping("{id}") // localhost:8080/api/v1/users/100
	User getUserById(@PathVariable("id") int userId ) {             		
		return User.usersMock().get(userId);		
	}
	
	@GetMapping("message")
	String getMessage() {
		return user.greeting();
	}

}
