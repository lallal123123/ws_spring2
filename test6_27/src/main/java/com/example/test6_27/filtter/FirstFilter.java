package com.example.test6_27.filtter;

import java.io.IOException;

import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

//@Component
public class FirstFilter  implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		Filter.super.init(filterConfig);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		long startTime = System.currentTimeMillis();
		System.out.println("FirstFilter 요청 들어옴");
		
		chain.doFilter(request,response);
		
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("FirstFilter 응답 들어옴");
		System.out.println("FirstFilter 처리시간 은" + duration + "ms(1)\n");
	}

	
	
}
