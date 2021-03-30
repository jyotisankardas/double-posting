package javaaaa;

import java.util.Scanner;

public class reverseString_palidram {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		while(true) {
		System.out.println("give String");
		String org = scn.nextLine();
		String rev = "";
		for (int i = org.length() - 1; i >= 0; i--) {
			rev = rev + org.charAt(i);

		}

		if (!org.equals(rev)) {
			System.out.println("not a palidram");

		}

		else {
			System.out.println(" a palidram");

		}

	}
	}

}
