package com.example.test6_27_view.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class MainController {

	private final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
	
	@GetMapping("/p1")
	public String p1() {
		LOGGER.info("P1 메서드가 호출되었습니다.");
		
		return "view/p1";
	}
}
