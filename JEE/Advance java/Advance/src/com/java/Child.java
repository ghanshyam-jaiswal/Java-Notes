package com.java;

public class Child extends Parent {

	Child(int id, String name) {
		super(id, name);
		
	}

	public static void main(String[] args) {

		Child c=new Child(5,"gk");
//		System.out.println(c.setId(10));
		c.setName(10,"mk");;
	}

}
