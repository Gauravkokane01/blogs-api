package com.core.app.blogs_api.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

	private final IUserRepository userRepository;

	public UserService(@Autowired IUserRepository userRepository) {
		this.userRepository = userRepository;

	}

	public UserModel createUser(String email, String password,String name) {
		UserModel userModel = new UserModel();
		userModel.setEmail(email);
		userModel.setPassword(password);
		userModel.setName(name);
		
		// populate roles
		return userRepository.save(userModel);
	}

	/*
	 * public List<UserResponseDTO> getAllUsers() { List<UserResponseDTO>
	 * users=(List<UserResponseDTO>) new UserResponseDTO(); return
	 * userRepository.findAll();
	 * 
	 * }
	 */

	public UserModel getUserByName(String name) {
		Optional<UserModel> user= userRepository.findByName(name);
		return user.get();
	}

	/*
	 * public UserModel loginUser(String email, String password) {
	 * Optional<UserModel>
	 * user=userRepository.findByEmailandPassword(email,password);
	 * if(!user.isPresent()) { return null; } return user.get(); }
	 */


}
