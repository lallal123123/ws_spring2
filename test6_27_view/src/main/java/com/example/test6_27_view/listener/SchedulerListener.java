package com.example.test6_27_view.listener;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

//@WebListener
public class SchedulerListener  implements ServletContextListener{
	//스프링부트 어노테이션 사용 안하고 
	private ScheduledExecutorService scheduler;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {

		sce = (ServletContextEvent)	Executors.newSingleThreadExecutor();
		scheduler.scheduleAtFixedRate(() -> {
			System.out.println("Scheduled Task is running........");
		}, 0, 1, TimeUnit.HOURS);		//scheduleAtFixedRate(수행할함수,0이면 바로 시작,시간간격,시간간격의 단위)
	}

	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		scheduler.shutdown();
	}
}
