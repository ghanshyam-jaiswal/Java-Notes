package com.java;

import java.util.Scanner;

public class StudentManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			
			System.out.println("1 add student");
			System.out.println("2 find student by id");
			System.out.println("3 find all student");
			System.out.println("4 delete student");
			System.out.println("5 enter the choice");
			System.out.println("6 exit");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:System.out.println("added");
			break;
			case 2:System.out.println();
			break;
			case 3:System.out.println();
			break;
			case 4:System.out.println();
			break;
			case 5:System.out.println();
			break;
			case 6: System.out.println("Thank You");
			//System.exit(0);
			return;
			}
		}
		
				
		
		
	}

}