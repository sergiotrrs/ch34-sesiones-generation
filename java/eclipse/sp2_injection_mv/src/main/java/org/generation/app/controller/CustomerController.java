package org.generation.app.controller;

import org.generation.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
	

	@Autowired
	@Qualifier("userVip")
	User user;
	
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
