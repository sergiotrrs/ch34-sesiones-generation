package org.generation.app.controller;

import java.util.Map;

import org.generation.app.model.User;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/users")
public class UserController {
	
	User user;

	@GetMapping // localhost:8080/api/v1/users
	Map<Integer, User> getAllUser(){
		return User.usersMock();
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
