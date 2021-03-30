package com.nit.info;

public class Person {
	 String name;
	 public Person( String name) {
		 this.name=name;
	}
	 public boolean equals(Object obj) {
		 return ((Person)obj).name=this.name;
	 }
	 public int hasCode() {
		 return name.length();
	 }
	 
	}