package com.core.app.blogs_api.role;

import com.core.app.blogs_api.common.BaseModel;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "roles")
public class RoleModel extends BaseModel{
	
    @Nonnull
    @Column(name = "role", nullable = false, unique = true)
    @Enumerated(value = EnumType.STRING)
    private RoleType role;
    
    public RoleModel() {
    	
    }

	public RoleModel( RoleType role) {
		super();
		this.role = role;
	}

	public RoleType getRole() {
		return role;
	}

	public void setRole(RoleType role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "RoleModel [role=" + role + "]";
	}
    
    

}
