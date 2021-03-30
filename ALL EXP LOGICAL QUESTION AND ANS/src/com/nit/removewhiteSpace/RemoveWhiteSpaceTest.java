/**
 * WRITE A PROGRAM TO REMOVE WHITE SPACE OF A STRING
 */

package com.nit.removewhiteSpace;

import java.util.Scanner;

public class RemoveWhiteSpaceTest {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a String for remove white space");
		String msg=scn.nextLine();
		System.out.println("Normal String is "+"'"+msg+"'");
		System.out.println("remove White space String is "+"'"+msg.replace(" ", "")+"'");
	}

}
