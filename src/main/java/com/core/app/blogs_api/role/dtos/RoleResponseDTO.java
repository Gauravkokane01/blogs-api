package com.core.app.blogs_api.role.dtos;

import com.core.app.blogs_api.role.RoleType;

import jakarta.validation.constraints.NotNull;

public class RoleResponseDTO {
	
	@NotNull
	private RoleType roles;
	
	public RoleResponseDTO() {
		
	}

	public RoleType getRoles() {
		return roles;
	}

	public void setRoles(RoleType roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "RoleResponseDTO [roles=" + roles + "]";
	}
	
	

}
