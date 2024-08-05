package com.example.secTokenTest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.secTokenTest.controller.dto.Student;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class RestController1 {

	
   
    
	@GetMapping("/api/login")
	public String login(@RequestParam("id") String id, @RequestParam("pw") String pw,HttpServletResponse response) {
		String result = "로그인 실패";
			if(id.equals("teacher1") && pw.equals("1234")) {
				response.addHeader("Authorization", "token");
				response.addHeader("id", id);
				response.addHeader("Access-Control-Expose-Headers", "Authorization,id");
				result = "로그인 성공";
			}	
		return result;
	}
	
	@GetMapping("/api/student/{sno}")
	public String student(@PathVariable("sno")int sno,@RequestHeader(value ="Authorization", required =false) String authorizationHeader) {
		List<Student> students = new ArrayList<>();
		Student s1 = new Student(1,"홍길동",100);
		Student s2 = new Student(2,"임꺽정",80);
		students.add(s1);
		students.add(s2);
		String result= "접근권한없음";
		
		if(authorizationHeader.equals("token") ) {

			for(Student s : students) {
				if(s.getSno() == sno) {
					result = s.toString();
				}
			}
		}
		
		return result;

	}
}
