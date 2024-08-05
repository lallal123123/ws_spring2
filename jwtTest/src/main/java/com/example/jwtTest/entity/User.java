package com.example.jwtTest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

	@Id
	String username;
	
	String password;
	String role;
}
