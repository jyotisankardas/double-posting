/**
 * WRITE A PROGRAM FOR THE ARMSTRONG NUMBER
 */

package com.nit.Armstrong;

import java.util.Scanner;

public class ArmstrongTest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number check for Armstrong or not ?");
		int number = scn.nextInt();
		int temp = 0, a = 0, c = 0;
		temp = number;
		while (number > 0) {
			a = number % 10;
			number = number / 10;
			c = c + (a * a * a);

		}
		if (c == temp)
			System.out.println("this number is a Armstrong");
		else
			System.out.println("this number is not a Armstrong");
	}
}
