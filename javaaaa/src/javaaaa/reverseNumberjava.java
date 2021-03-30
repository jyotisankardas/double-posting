package javaaaa;

import java.util.Scanner;

public class reverseNumberjava {

	public static void main(String[] args) {
while(true) {
		Scanner scn = new Scanner(System.in);
		System.out.println("give no");
		int org = scn.nextInt();
		int rev=re(org);
		if(org==rev)
			System.out.println("palidram");
		else
			System.out.println("not palidram");
	}
	}
		public static  int re(int n1) {
		while(true) {
		int rev = 0;
		while (n1>0) {
			rev=rev*10+n1%10;
			n1=n1/10;
			
		}
return rev;

	}
	}

}
