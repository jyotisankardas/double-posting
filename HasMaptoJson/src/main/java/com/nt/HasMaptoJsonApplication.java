package com.nt;

import java.util.HashMap;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HasMaptoJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(HasMaptoJsonApplication.class, args);
		
		
		/*
		 * HashMap<String, Integer>map=new HashMap<String, Integer>(); map.put("rama",
		 * 4); map.put("bia ra ", 43); map.put("chuua", 5); map.put("pela", 99);
		 * JSONObject json = new JSONObject(); Object wrap = json.wrap(map);
		 * System.out.printf( "JSON: %s",wrap );
		 */
		String s="dog is one";
		String[] b=s.split(" ");
		String rev="";
		
		for(int i=0;i<b.length;i++) {
			String word=b[i];
			for(int j=word.length()-1;j>=0;j--) {
				rev=rev+word.charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println(s);
		System.out.println(rev);
		
		/*
		 * String v=s.substring(0, 3); String rev=""; for(int i=v.length()-1;i>=0;i--) {
		 * rev=rev+v.charAt(i); } String replace = s.replace("dog", rev);
		 * 
		 * 
		 * System.out.println(replace);
		 */
	}

}
