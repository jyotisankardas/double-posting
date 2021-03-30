/**
 * Write a java program to check whether two given strings are anagram.
 *  If two strings contain same set of characters but in different order then the two strings are called anagram.
 */

package com.nit.anagram_String;

import java.util.Arrays;
import java.util.Scanner;

public class anagram_String_Test {
	public static String check() {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a String --> ");
		String s1 = scn.nextLine();
		System.out.println("enter a another String --> ");
		String s2 = scn.nextLine();
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		boolean equals = Arrays.equals(charArray1, charArray2);
		return equals ? "Two String are anagram " : "Two String are not anagram ";

	}

	public static void main(String[] args) {

		System.out.println(check());

	}

}