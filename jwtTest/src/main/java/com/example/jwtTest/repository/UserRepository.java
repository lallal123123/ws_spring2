package com.example.jwtTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwtTest.entity.User;

public interface UserRepository extends JpaRepository<User,String>{
	
	

}
