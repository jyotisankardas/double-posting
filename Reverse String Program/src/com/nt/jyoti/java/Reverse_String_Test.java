package com.nt.jyoti.java;

import java.util.Scanner;

public class Reverse_String_Test {

	public static void main(String[] args) {

		Scanner scn = null;
		String given_word = null;
		// create Scanner class object for give input
		scn = new Scanner(System.in);
		System.out.println("give any string for reverse");
		given_word = scn.next();

		// invoke the reverse method
		System.out.println("normal string is - " + given_word + " . And Reverse String is - "
				+ Reverse_String.custom_reverse(given_word)+" .");

	}

}
