package com.jsp;

public class MainClass extends Parent {
public static void main(String[] args) {

	new MainClass().m1();
}
}

class Parent{
	public void m1(){
		System.out.println("parent class");
	}
}
