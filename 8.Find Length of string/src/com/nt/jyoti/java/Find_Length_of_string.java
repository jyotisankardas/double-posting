package com.nt.jyoti.java;

import java.util.ArrayList;

public class Find_Length_of_string {
	
	public static int find_Length(String str) {
		
		int length=0;
		char[] chr=str.toCharArray();
		for(char c :chr) {
			length++;
		}
		return length;
	}

}
