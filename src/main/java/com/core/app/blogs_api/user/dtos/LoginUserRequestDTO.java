package com.core.app.blogs_api.user.dtos;

public class LoginUserRequestDTO {
	
	private String email;
	private String password;
	public LoginUserRequestDTO(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginUserRequestDTO [email=" + email + ", password=" + password + "]";
	}
	
	
	

}
