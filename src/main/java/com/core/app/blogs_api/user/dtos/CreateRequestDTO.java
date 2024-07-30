package com.core.app.blogs_api.user.dtos;


public class CreateRequestDTO {
	
	private String email;
	private String password;
	private String name;
	public CreateRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateRequestDTO(String email, String password,String name) {
		super();
		this.email = email;
		this.password = password;
		this.name=name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
