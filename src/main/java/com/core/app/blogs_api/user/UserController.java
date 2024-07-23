package com.core.app.blogs_api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.app.blogs_api.user.dtos.CreateRequestDTO;
import com.core.app.blogs_api.user.dtos.UserResponseDTO;

@RestController
@RequestMapping("/api/users")

public class UserController {

	
	private final UserService userService;
	
	 public UserController(@Autowired UserService userService) {
		 
		this.userService = userService;
		 
	 }
	
	
	@PostMapping("/signUp")
	 
	public ResponseEntity<UserResponseDTO> createUser(@RequestBody CreateRequestDTO requestDTO) {
		
		UserModel savedUser = userService.createUser(requestDTO.getEmail(), requestDTO.getPassword());
	    
		UserResponseDTO userResponseDTO= new UserResponseDTO();
		userResponseDTO.setId(savedUser.getId());
		userResponseDTO.setEmail(savedUser.getEmail());
		userResponseDTO.setCreatedAt(savedUser.getCreatedAt());
		userResponseDTO.setBio(savedUser.getBio());
		userResponseDTO.setName(savedUser.getName());
		userResponseDTO.setUpdatedAt(savedUser.getUpdatedAt());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(userResponseDTO);

		
		
		 
		
		
		
	}
}
