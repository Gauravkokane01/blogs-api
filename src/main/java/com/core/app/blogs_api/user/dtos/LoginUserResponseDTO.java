package com.core.app.blogs_api.user.dtos;

public class LoginUserResponseDTO {
	
  private String message;

public LoginUserResponseDTO(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
  

}
