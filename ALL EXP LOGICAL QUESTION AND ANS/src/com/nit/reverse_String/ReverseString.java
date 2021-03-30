/**
 * REVERSE A STRING IN JAVA WITH-OUT USING REVERSE()
 */

package com.nit.reverse_String;

public class ReverseString {
	
	public static String reverseString(String msg) {
		String reverse="";
		for(int i=msg.length()-1;i>=0;i--) {
			reverse=reverse+msg.charAt(i);
		}
		return reverse;
	}

}
