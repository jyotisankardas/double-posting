package com.nit.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class HasSetTest {
	public static void main(String[] args) {
		
	 TreeSet<Object>s=new TreeSet<>();
	//s.add("A");
	//s.add("a");
	s.add(1);
	s.add(2);
	//s.add(null);
	s.add(2);
	s.add(7);
	s.add(3);
	s.add(5);
	s.add(9);
	s.add(10);
	s.add("h");

	//s.add("C");
	System.out.println(s);
	
	}
	
}
