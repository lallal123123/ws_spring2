package com.example.secTokenTest.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.secTokenTest.controller.dto.Student;
import com.example.secTokenTest.controller.dto.Teacher;

@Configuration
public class MyConfig {

	@Bean
    public List<Teacher> teacherList() {
		
		List<Teacher> teachers = new ArrayList<>();
		Teacher t= new Teacher("teacher1","1234");
		teachers.add(t);
		System.out.println(teachers);
        return teachers;
    }
	
	@Bean
    public List<Student> studentList() {
		
		List<Student> students = new ArrayList<>();
		Student s = new Student(1,"홍길동",100);
		students.add(s);
		s = new Student(2,"임꺽정",80);
		students.add(s);
		
		
        return students;
    }
}
