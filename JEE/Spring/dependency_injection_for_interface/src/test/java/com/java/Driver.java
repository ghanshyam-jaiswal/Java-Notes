package com.java;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Driver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=	new AnnotationConfigApplicationContext(Config.class);
		User user=(User) context.getBean("user");
		System.out.println(user);
		user.getMobile();
		user.getMobile().add();;
		
	}
}
