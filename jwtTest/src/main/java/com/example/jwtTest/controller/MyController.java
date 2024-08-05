package com.example.jwtTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwtTest.entity.User;
import com.example.jwtTest.repository.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MyController {

	@Autowired
	UserRepository ur;
	
	@Autowired
	BCryptPasswordEncoder bc;
	
	@GetMapping("/test")
	public String test() {
		return "접속성공";
	}
	
	@PostMapping("/join")
	public String join(@RequestBody User user ) {
		user.setPassword(bc.encode(user.getPassword()));
		System.out.println(user);
		ur.save(user);
		return "sdfsdf";
	}
	
}
