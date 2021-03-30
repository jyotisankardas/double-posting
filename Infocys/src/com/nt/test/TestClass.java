package com.nt.test;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class TestClass {
	
	public static void main(String[] args) {
	
		Map<Integer, String>m=new TreeMap<>();
		m.put(2, "A");
		m.put(1, "B");
		m.put(3, "c");
		m.put(null, "E");
		m.put(4, null);
		m.put(1, "D");
		Collection<String> values = m.values();
		for(String element:values) {
			System.out.println(element);
		}
	}
}
