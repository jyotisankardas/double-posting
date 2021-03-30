package com.nt.test;

import java.util.Scanner;

import com.nt.jyoti.java.Reverse_string_check_palidram_or_not;

public class Reverse_string_check_palidram_or_not_TEST {

	public static void main(String[] args) {
		Scanner scn = null;
		String give_input = null;

		// Create Scnanner Class object for give input
		scn = new Scanner(System.in);
		// take input
		System.out.println("give a String and check for palidram");
		give_input = scn.next();
		// invoke the methods for test
		System.out.println(Reverse_string_check_palidram_or_not.reverse_string_check_palidram_or_not(give_input));

	}

}
