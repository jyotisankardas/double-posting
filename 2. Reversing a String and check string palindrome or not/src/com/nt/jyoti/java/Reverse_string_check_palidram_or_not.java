package com.nt.jyoti.java;

public class Reverse_string_check_palidram_or_not {
	
	public static String reverse_string_check_palidram_or_not(String word) {
		
		String reverse_String="";
		for(int i=word.length()-1;i>=0;i--) {
			reverse_String=reverse_String+word.charAt(i);
		}
		System.out.println("Normal String is :- "+word);
		System.out.println("Reverse  String is :- "+reverse_String);
		
		if(word.equals(reverse_String))
			return "Yes ,this String is a palidram ";
		else 
			return "No ,this String is not a palidram ";
		
		
	}

}
