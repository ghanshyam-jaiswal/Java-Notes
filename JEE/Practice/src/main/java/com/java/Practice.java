package com.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;

class Practice{
	
	 public static void main(String args[]) {
		 String str = "radar";
		 String reversed = new StringBuilder(str).reverse().toString();
		 
		 if(str.equals(reversed)) {
			  System.out.println(str+ " is a palindrome");
		 }
		 else {
			  System.out.println(str + " is not a paliundrome");
		 }
	 }
}
	

