package org.generation.app.service;

import java.util.List;

import org.generation.app.entity.User;

public interface UserService {
	
	User getUserById(Long id);
	User getUserByEmail(String email);
	User createUser(User user);
	List<User> getAllUsers();
	User updateUser(User user, Long id);
	void deleteUser(Long id);

}
