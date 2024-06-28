package com.example.test6_27.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

	
	@GetMapping("/test1")
	public String test1() {
		return "Hello World!";
	}
	@GetMapping("/test2")
	public ResponseEntity<?> test2() {
		
		return ResponseEntity.status(HttpStatus.OK).body("Hello Green!");
	}
}
