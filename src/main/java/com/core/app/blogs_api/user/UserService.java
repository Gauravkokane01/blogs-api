package com.core.app.blogs_api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private final IUserRepository userRepository;

	public UserService(@Autowired IUserRepository userRepository) {
		this.userRepository = userRepository;

	}

	public UserModel createUser(String email, String password) {
		UserModel userModel = new UserModel();
		userModel.setEmail(email);
		userModel.setPassword(password);

		// populate roles
		return userRepository.save(userModel);
	}

}
