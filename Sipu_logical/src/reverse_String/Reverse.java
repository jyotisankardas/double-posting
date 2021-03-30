package reverse_String;

import java.util.Scanner;

public class Reverse {
	
	public static String getvalue(String msg) {
		String rev="";
		for(int i=msg.length()-1;i>=0;i--) {
			rev=rev+msg.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("give a String");
		String msg=scn.next();
		StringBuffer v=new StringBuffer(msg);
		
		System.out.println("reverse msg is "+getvalue(msg));
		System.out.println(v.reverse());
	}
}
