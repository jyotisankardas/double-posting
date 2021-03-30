package com.nt.test;

import java.util.Scanner;

import com.nt.digant.java.Remove_white_space;

public class Remove_White_space_Test {
	
	public static void main(String[] args) {
		Scanner scn=null;
		String word=null;
		//Create Scanner class object
		scn=new Scanner(System.in);
		System.out.println("give a sentence");
		word=scn.nextLine();
		System.out.println("orginal sentenance ::- "+word);
		System.out.println("remove space sentenance ::- "+Remove_white_space.replace(word));
		
	}

}
