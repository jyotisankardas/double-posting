package com.nit.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

public class TreeSetTest1 {
	public static void main(String[] args) {

		TreeSet<StringBuffer> t = new TreeSet<>(new My1Comparator());
		t.add (new StringBuffer("jyoti"));
		t.add (new StringBuffer("hari"));
		t.add (new StringBuffer("raja"));
		t.add (new StringBuffer("rakhi"));
		t.add (new StringBuffer("prakash"));
		t.add (new StringBuffer("hari"));

		System.out.println(t);

	
	}
};

 class My1Comparator implements Comparator<Object>{
	@Override
	public int compare(Object o1, Object o2) {
		String i1 = (String) o1.toString();
		String i2 = (String) o2.toString();
		return i2.compareTo(i1);
		
	}
}
