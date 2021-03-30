package com.nt.jyoti.java;

public class Reverse_String {

	public static String custom_reverse(String word) {
		
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		return reverse;
	}
		
	}
	

}
