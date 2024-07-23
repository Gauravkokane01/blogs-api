package com.core.app.blogs_api.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, UUID> {

	UserModel save(UserModel userModel);

}
