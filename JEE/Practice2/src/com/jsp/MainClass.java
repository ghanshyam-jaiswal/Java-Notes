package com.jsp;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		
//		System.out.println("enter num");
//		int org=new Scanner(System.in).nextInt();
		
		int num1=0;
		int num2=1;
		int num3=num1+num2;
		int count=0;
		for(int i=1;;i++) {
			if(num1%2!=0) {
				System.out.println(num1);
				count++;
				if(count==10) {
					break;
				}
			}
			num1=num2;
			num2=num3;
			num3=num1+num2;
		}
		
		
	}
}
