package com.core.app.blogs_api.user;

import java.util.Optional;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepository extends JpaRepository<UserModel, UUID> {

	@SuppressWarnings("unchecked")
	UserModel save(UserModel userModel);
	Optional<UserModel> findByName(String name);
}
