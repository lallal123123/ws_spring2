package com.example.test6_27.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.test6_27.filtter.FirstFilter;
import com.example.test6_27.filtter.SecondFilter;
import com.example.test6_27.filtter.ThirdFilter;

@Configuration
public class FilterConfig {

	   @Bean
	   FilterRegistrationBean<FirstFilter> firstFilter(){
	      FilterRegistrationBean<FirstFilter> registrationBean = new FilterRegistrationBean<>();
	      
	      registrationBean.setFilter(new FirstFilter());
	      registrationBean.addUrlPatterns("/api/test1");
	      registrationBean.setOrder(1); //우선순위 지정, 숫자가 작을수록 높은 우선순위
	      
	      return registrationBean;
	   }
	   
	   @Bean
	   FilterRegistrationBean<SecondFilter> secondFilter(){
	      FilterRegistrationBean<SecondFilter> registrationBean = new FilterRegistrationBean<>();
	      
	      registrationBean.setFilter(new SecondFilter());
	      registrationBean.addUrlPatterns("/api/test1");
	      registrationBean.setOrder(2); //우선순위 지정, 숫자가 작을수록 높은 우선순위
	      
	      return registrationBean;
	   }
	   
	   @Bean
	   FilterRegistrationBean<ThirdFilter>	thirdFilter(){
		   FilterRegistrationBean<ThirdFilter> registrationBean = new FilterRegistrationBean<>();
		      
		      registrationBean.setFilter(new ThirdFilter());
		      registrationBean.addUrlPatterns("/api/test1");
		      registrationBean.setOrder(3); //우선순위 지정, 숫자가 작을수록 높은 우선순위
		      
		      return registrationBean;
	   }
	}

