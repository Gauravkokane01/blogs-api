package com.core.app.blogs_api.user;

import java.util.Set;

import org.springframework.context.annotation.Lazy;

import com.core.app.blogs_api.common.BaseModel;
import com.core.app.blogs_api.common.constants.GenericConst;
import com.core.app.blogs_api.role.RoleModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.NonNull;

@Entity(name = "users")

public class User extends BaseModel {
	//@NotNull
	@Email(regexp = GenericConst.EMAIL_VALIDATION_PATTERN, message = "Invalid email id!!!")
	@Column(name = "email", nullable = false, unique = true, length = 30)
	private String email;

	//@NotNull
	@Column(name = "password", nullable = false)
	private String password;

	@Column
	private String name;
	@Column
	private String bio;

	// role
	@ManyToMany
//   @LazyCollection(value = LazyCollectionOption.FALSE)
	@Lazy(value = false)
	private Set<RoleModel> roles;

	@Column(name = "is_deleted", nullable = false)
	private boolean isDeleted;

	public User(
			@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", message = "Invalid email id!!!") String email,
			 String password, String name, String bio, Set<RoleModel> roles, boolean isDeleted) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.bio = bio;
		this.roles = roles;
		this.isDeleted = isDeleted;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Set<RoleModel> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleModel> roles) {
		this.roles = roles;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", name=" + name + ", bio=" + bio + ", roles="
				+ roles + ", isDeleted=" + isDeleted + "]";
	}
	
	

	
}
