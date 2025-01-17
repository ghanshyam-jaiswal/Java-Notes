package com.jsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Question {
	
	public static void main(String[] args) {
		
		/* input [1,2,5,3,4,3,6]
		 target=6
		output=(1,5),(2,4),(3,3)
		 Description: Find the pairs in the array/list,whose sum is equal to the target.Print only the unique pairs.
		 NOTE: nested loops are not allowed,nested loops are not allowed
		*/
		
		List<Integer> nums= List.of(1,2,5,3,4,3,6);
		int target =6;
		
		Set<Integer> s1=new HashSet<>();
		List<List<Integer>>result =new ArrayList<>();

		for(int num :nums) {
			int c1 = target-num;
		 if(s1.contains(c1)) {
				List<Integer> p1 = List.of(num, c1);
				result.add(p1);
				
			}
		 s1.add(num);
		}
		System.out.println("number sum is equal to " + target + ";");
		for(List<Integer> p1:result) {
			System.out.println(p1);
		}
		
		
	}

}

