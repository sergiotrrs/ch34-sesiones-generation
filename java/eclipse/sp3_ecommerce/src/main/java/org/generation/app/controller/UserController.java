package org.generation.app.controller;

import java.util.List;

import org.generation.app.entity.User;
import org.generation.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("api/v1/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping
	List<User> getAllUsers(){
		List<User> users = userService.getAllUsers();
		return users;
	}
	
	@GetMapping("{id}")
	User getUserById(@PathVariable("id") Long id) {
		log.info("Se solicita los datos del id:" + id);
		//User user = userService.getUserById(id);
		User user= new User();
		return user;
	}
	
	@PostMapping
	User setUser(@RequestBody User user) {	
		log.info("Se está creando un nuevo usuario");
		log.info(user);
		User newUser = userService.createUser(user);
		return newUser;
	}
	
}
