package com.java;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String name=sc.nextLine();
//		char c[]=name.toCharArray();
		
		String store="";
		for(int i=name.length()-1;i>=0;i--) {
			store=store+name.charAt(i);
		}
		if(name.equals(store)) {
			
			System.out.println("palindrome");
		}
		else {
			
			System.out.println("not");
		}
//		System.out.println("spaces: "+store);
		
	}
}
