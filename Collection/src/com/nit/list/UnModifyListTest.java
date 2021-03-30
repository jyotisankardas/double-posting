package com.nit.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class UnModifyListTest {
	public static void main(String[] args) {
		
	
	Set<Integer> l=new LinkedHashSet<>();
	
	l.add(1);
	l.add(3);
	l.add(45);
	l.add(33);
	l.add(1);
	l=Collections.unmodifiableSet(l);
	//l.add(678);
	System.out.println(l);
	}
	
}
