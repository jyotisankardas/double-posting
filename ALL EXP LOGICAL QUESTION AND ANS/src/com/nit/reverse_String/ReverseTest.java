package com.nit.reverse_String;

import java.util.Scanner;

public class ReverseTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a msg-- ");
		String msg=scn.nextLine();
		System.out.println("Reverse a msg is-- "+ReverseString.reverseString(msg));
	}

}
