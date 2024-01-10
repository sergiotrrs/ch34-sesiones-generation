package org.generation.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.generation.app.entity.User;
import org.generation.app.repository.UserRepository;
import org.generation.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User getUserById(Long id) {
		Optional<User> userOptional = userRepository.findById(id);
		
		if( userOptional.isPresent()) return userOptional.get();
		else throw new IllegalStateException("User does not exist");
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(User user) {
		User newUser = userRepository.save( user );
		return newUser;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = (List<User>) userRepository.findAll();
		return users;
	}

}
