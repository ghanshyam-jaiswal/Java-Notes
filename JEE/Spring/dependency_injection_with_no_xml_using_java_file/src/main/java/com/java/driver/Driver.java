package com.java.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.config.Config;
import com.java.pojo.Pancard;
import com.java.pojo.Person;

public class Driver {
	public static void main(String[] args) {
		
	ConfigurableApplicationContext context=	new AnnotationConfigApplicationContext(Config.class);
	Person person=context.getBean(Person.class);
	Person person1=context.getBean(Person.class);
	Pancard pancard =context.getBean(Pancard.class);
	System.out.println(person);
	System.out.println(person1);
	System.out.println(person.getName());
	System.out.println(person.getPhone());
	System.out.println(person.getAge());
//	System.out.println(person.getPancard().getId());
	System.out.println(pancard);
	
	}
}
