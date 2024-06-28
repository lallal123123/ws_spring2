package com.example.test6_27;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Test627Application {

	public static void main(String[] args) {
		SpringApplication.run(Test627Application.class, args);
	}

}
