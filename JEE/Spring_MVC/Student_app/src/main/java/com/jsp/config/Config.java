package com.jsp.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // it is not required automatically it will take this annotation.
@ComponentScan(basePackages = "com")
public class Config {
	
	@Bean(value = "entityManagerFactory")
	public EntityManagerFactory getEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("java");
	}

}
