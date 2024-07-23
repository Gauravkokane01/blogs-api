package com.core.app.blogs_api.user.dtos;

import java.util.Date;

public class UserResponseDTO {

	private String id;
	private String email;
	private String name;
	private String bio;
	// private Set<String> roles;
	private Date createdAt;
	private Date updatedAt;

	public UserResponseDTO() {
		super();
	}

	public UserResponseDTO(String id, String email, String name, String bio, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.bio = bio;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "UserResponseDTO [id=" + id + ", email=" + email + ", name=" + name + ", bio=" + bio + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
