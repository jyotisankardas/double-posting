package com.nt.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Reverse_Number_Test {

	public static void main(String[] args) {
		/*
		 * Scanner scn=null; int no=0; //Create Scanner class object scn=new
		 * Scanner(System.in); //takes input to end user
		 * System.out.println("give a Integer type value"); no=scn.nextInt();
		 * 
		 * //invoke the methods System.out.println("normal integer value is :- "
		 * +no+" . And Reverse value integer value is :- "+Reverse_Number.
		 * revers_a_number(no));
		 * 
		 */

		/*
		 * String msg="my name is bla bla"; String cv=msg+"nice joke ram";
		 * //System.out.println(cv);
		 */

		List<Integer>l=Arrays.asList(4,7,8,4);
		
		for(Integer i:l) {
			if(i%2==0)
				System.out.println(i);
			
		}
		/*
		 * List<Integer> collect = l.stream().map(i->i+2).collect(Collectors.toList());
		 * System.out.println(collect);
		 */
		

	}

}
