package com.nit.list;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class IteratorListTest {
	public static void main(String[] args) {
		
	
	Vector<Integer> l=new Vector<>();
	l.add(1);
	l.add(4);
	l.add(44);
	l.add(444);
	l.add(78);
	Enumeration<Integer> e=Collections.enumeration(l);
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
		try {
			 throw ArithmeticException
		}
	catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	}
	
}
