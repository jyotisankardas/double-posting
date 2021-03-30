package com.nit.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		
	
	List<Integer> l=new ArrayList<>();
	
	for(int i=0;i<=10;i++) {
		if(i/2==0) {
		l.add(i);
		}
	}
	System.out.println(l);
	System.out.println(l.get(6));
	System.out.println(l.size());
	}
	
}
