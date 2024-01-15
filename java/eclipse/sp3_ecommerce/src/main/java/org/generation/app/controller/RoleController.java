package org.generation.app.controller;

import java.util.List;

import org.generation.app.entity.Role;
import org.generation.app.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Log4j2
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/roles")
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@PostMapping
	ResponseEntity<Role> setRole(@RequestBody Role role){
		Role newRole = roleService.createRole(role);
		return new ResponseEntity<>( newRole, HttpStatus.CREATED);
	}
	
	@GetMapping
	ResponseEntity< List<Role> > getAllRoles(){
		List<Role> roles = roleService.getAllRoles();
		return new ResponseEntity<>( roles, HttpStatus.OK);
	}

}
