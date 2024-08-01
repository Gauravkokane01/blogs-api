package com.core.app.blogs_api.role.dtos;

import com.core.app.blogs_api.role.RoleType;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateRoleRequestDTO {
	
	@NotNull
	private RoleType roles;
	
	
	
	  public CreateRoleRequestDTO() {
	  
	  }
	  
	  
	  public RoleType getRoles() { return roles; }
	  
	  
	  public void setRoles(RoleType roles) { this.roles = roles; }
	  
	  
	  @Override public String toString() { return "CreateRoleRequestDTO [roles=" +
	  roles + "]"; }
	 
	

}
