package com.example.game.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.game.dto.UserData;

@CrossOrigin("*")
@RestController
public class GameController {

	@PostMapping("/api/post")
	public String post(@RequestBody UserData userData) {
		System.out.println("가위바위보 post 요청.....");
		System.out.println("userData : " + userData);
		
		return "good bye~";
	}
}
