package com.java;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Samsung implements Mobile {

	@Override
	public void add() {
		System.out.println("samsung is calling....");
		
	}

}
