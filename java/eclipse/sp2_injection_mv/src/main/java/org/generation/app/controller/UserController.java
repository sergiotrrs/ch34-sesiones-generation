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
	
	@GetMapping("1") // localhost:8080/api/v1/users/1
	User getUserById() {
		user.setFirstname("Livi");
		user.setLastname("Riv");
		
		return user;		
	}
	
	@GetMapping("message")
	String getMessage() {
		return user.greeting();
	}

}
