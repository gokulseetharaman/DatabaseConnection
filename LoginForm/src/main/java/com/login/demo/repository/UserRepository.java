package com.login.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.login.demo.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
@Query("SELECT u FROM UserEntity u WHERE u.email = ?1")
	UserEntity findByEmail(String email); 
}
