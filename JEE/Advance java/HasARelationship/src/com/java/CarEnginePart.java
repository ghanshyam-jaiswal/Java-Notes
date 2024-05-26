package com.java;

public class CarEnginePart {

	public static void main(String[] args) {

		Engine e=new Engine(01,1000);
		Car c=new Car(50000,"suzuki");
		c.e=e;
		System.out.println(c.e.cc);
	}

}
