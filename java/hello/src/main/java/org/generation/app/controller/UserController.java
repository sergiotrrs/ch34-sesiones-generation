package org.generation.app.controller;

import java.util.List;

import org.generation.app.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

	
	@GetMapping("api/v1/users/1")
	User getUserById() {
		return User.createTony();
	}
	
	@GetMapping("api/v1/users")
	List<User> getUsers(){
		return User.usersMock();
	}
	

}
