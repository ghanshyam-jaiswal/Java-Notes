package com.java.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.java.pojo.Pancard;

@Configuration
 @ComponentScan (basePackages = "com.java") 
public class Config {
	
		@Bean	// instead of using @component we use it and directly we'll get object of pancard.
		public Pancard createPancad() {
			return new Pancard();
		}
}
