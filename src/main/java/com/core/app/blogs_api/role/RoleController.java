package com.core.app.blogs_api.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.app.blogs_api.role.dtos.CreateRoleRequestDTO;
import com.core.app.blogs_api.role.dtos.RoleResponseDTO;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
	private final RoleService roleService;
	
	
	
	public RoleController(@Autowired RoleService roleService) {
		super();
		this.roleService = roleService;
	}



	@PostMapping
	public ResponseEntity<RoleResponseDTO> createRole(@RequestBody CreateRoleRequestDTO requestDTO) {
		RoleModel savedrole=roleService.createRole(requestDTO.getRoles());
		
		  RoleResponseDTO responseDTO = new RoleResponseDTO();
		  responseDTO.setRoles(savedrole.getRole());
		
		return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
		
	}
	

}
