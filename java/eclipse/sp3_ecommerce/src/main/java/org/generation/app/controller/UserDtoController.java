package org.generation.app.controller;

import java.util.List;

import org.generation.app.dto.UserDto;
import org.generation.app.entity.User;
import org.generation.app.service.UserDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


// @Log4j2
// @CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v2/users")
public class UserDtoController {

	@Autowired
	UserDtoService userDtoService;
	
	@GetMapping
	ResponseEntity< List<UserDto> > getAllUsers(){
		List<UserDto> usersDto = userDtoService.getAllUsers();
		return new ResponseEntity<>(usersDto, HttpStatus.OK );
	}
	
	@GetMapping("{id}")
	ResponseEntity<UserDto> getUserById(@PathVariable("id") Long id) {
		UserDto userDto = userDtoService.getUserById(id);
		return new ResponseEntity<>(userDto, HttpStatus.OK );
	}
	
	@PostMapping
	ResponseEntity<UserDto> setUser(@Validated @RequestBody User user) {	
		UserDto newUserDto = userDtoService.createUser(user);
		return new ResponseEntity<>(newUserDto, HttpStatus.CREATED );
	}
	
	@GetMapping("query") 
	ResponseEntity<UserDto> getUserByEmail(@RequestParam(name="email") String email) {
		UserDto userDto = userDtoService.getUserByEmail(email);
		return new ResponseEntity<>(userDto, HttpStatus.OK );
	}
	
	@PutMapping("{id}")
	ResponseEntity<UserDto> updateUser(@RequestBody User user, @PathVariable("id") Long id) {
		UserDto userDto = userDtoService.updateUser(user, id);
		return new ResponseEntity<>(userDto, HttpStatus.OK );
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteUser(@PathVariable("id") Long id ) {
		userDtoService.deleteUser(id);
		return new ResponseEntity<>("User id " + id + " successfully deleted", HttpStatus.OK );
	}
}
