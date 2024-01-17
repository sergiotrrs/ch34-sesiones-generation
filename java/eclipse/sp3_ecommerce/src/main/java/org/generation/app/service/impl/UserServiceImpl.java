package org.generation.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.generation.app.entity.User;
import org.generation.app.repository.UserRepository;
import org.generation.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public User getUserById(Long id) {
		Optional<User> userOptional = userRepository.findById(id);
		
		if( userOptional.isPresent()) return userOptional.get();
		else throw new IllegalStateException("User does not exist with id " + id);
	}

	@Override
	public User getUserByEmail(String email) {
		Optional<User> existingUser = userRepository.findByEmail(email);
		if( existingUser.isPresent()) return existingUser.get();
		else throw new IllegalStateException("User does not exist with email " + email);
	}

	@Override
	public User createUser(User user) {
		user.setId(null);
		user.setActive(true);
		user.setPassword( passwordEncoder.encode( user.getPassword() ));
		// TODO Verificar que no exista el email.
		if ( userRepository.existsByEmail(user.getEmail()) ) {
			throw new IllegalStateException("User exist with email " + user.getEmail());
		}
		User newUser = userRepository.save( user );
		return newUser;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = (List<User>) userRepository.findAllByActive(true);
		return users;
	}

	@Override
	public User updateUser(User user, Long id) {
		User existingUser = getUserById(id);
		existingUser.setFirstName( user.getFirstName());
		existingUser.setLastName( user.getLastName());
		existingUser.setBirthdate( user.getBirthdate());
		// Si modificamos el email, se debe verificar que no exista.
		return userRepository.save(existingUser);
	}

	@Override
	public void deleteUser(Long id) {
		User existingUser = getUserById(id);
		// userRepository.delete(existingUser);
		existingUser.setActive(false);
		userRepository.save(existingUser);
	}

}
