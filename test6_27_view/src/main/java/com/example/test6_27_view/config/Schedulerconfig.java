package com.example.test6_27_view.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class Schedulerconfig  {
	//스프링부트에서 쓸때 어노테이션 붙여주면 간단
	@Scheduled(fixedRate = 10000)	//시간 간격
	public void performScheduledTask() {
		System.out.println("스케줄러 작동.....");
	}

}
