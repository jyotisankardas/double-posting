package com.nt.jyoti.java;

public class Reverse_Number {
	
	public static int revers_a_number(int no) {
		
		int reverse=0;
		while(no>0) {
			reverse=reverse*10+no%10;
			no=no/10;
		}
		return reverse;
	}
	

}
