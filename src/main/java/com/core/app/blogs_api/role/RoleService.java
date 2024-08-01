package com.core.app.blogs_api.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
	
	private final IRoleRepository roleRepository;
	

	public RoleService(@Autowired IRoleRepository roleRepository) {
		super();
		this.roleRepository = roleRepository;
	}


	public RoleModel createRole(RoleType rolename) {
		RoleModel role=new RoleModel();
		role.setRole(rolename);
		
		return roleRepository.save(role);
	}

}
