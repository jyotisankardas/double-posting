/**
 * WRITE A PROGRAM TO COUNT NUMBER OF WORDS IN THE STRING
 */

package com.nit.countString;

import java.util.Scanner;

public class CountStringTest {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String for count character");
		String msg=scn.nextLine();
		int count=0;
		for(int i=0;i<msg.length();i++) {
			count++;
		}
		System.out.println("Total Character in the String is "+count);
	}

}
