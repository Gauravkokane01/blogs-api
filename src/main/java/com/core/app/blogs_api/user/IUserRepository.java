package com.core.app.blogs_api.user;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.core.app.blogs_api.user.dtos.UserResponseDTO;


@Repository
public interface IUserRepository extends JpaRepository<UserModel, UUID> {

	@SuppressWarnings("unchecked")
	UserModel save(UserModel userModel);
	Optional<UserModel> findByName(String name);
	

}
