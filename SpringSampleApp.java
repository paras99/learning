package com.start.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSampleApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach abc= context.getBean("abc",Coach.class);
		
		System.out.println(abc.getDaily());
		
		System.out.println(abc.getDailyFortune());
		context.close();
		
		 
	}

}
