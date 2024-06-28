package com.example.test6_27.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.test6_27.filtter.FirstInterceptor;

@Configuration
public class AppConfig implements WebMvcConfigurer {

	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(firstInterceptor())
		.addPathPatterns("/api/test1")
		.excludePathPatterns("/login","/signup"); //인터셉터를 제외할 경로 패턴
	}
	
	@Bean
	public FirstInterceptor firstInterceptor() {
		System.out.println("appconfig....firstInterceptor");
		return new FirstInterceptor();
	}
}
