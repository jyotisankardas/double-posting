package com.nt.test;

import java.util.Scanner;

import com.nt.jyoti.java.Find_Length_of_string;

public class Find_Length_of_string_Test {
	
	public static void main(String[] args) {
		Scanner scn=null;
		String value=null;
		//Create Scanner class object
		scn=new Scanner(System.in);
		System.out.println("Give a sentenance ");
		value=scn.nextLine();
		
		//invoke the methods
		System.out.println("Total length of senteance is - "
		+Find_Length_of_string.find_Length(value));
	}

}
