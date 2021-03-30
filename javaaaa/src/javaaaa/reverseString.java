package javaaaa;

import java.util.Scanner;

public class reverseString {
	
	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		 System.out.println("give String");
		 String org=scn.nextLine();
		 String rev="";
		 for(int i=org.length()-1;i>=0;i--) {
			 rev=rev+org.charAt(i);
		 }
		 System.out.println(rev);
	}

}
