package com.nit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;

public class Fail_First_Test {

	public static void main(String[] args) {

		CopyOnWriteArrayList<Object> c = new CopyOnWriteArrayList<>();
		// ArrayList<Object> c=new ArrayList<>();
		c.add("jyoti");
		c.add("hk");
		c.add(1);
		c.add('c');

		System.out.println(c);

		for (Object v : c) {

		System.out.println(v);

		}
		System.out.println(c);

		// c.stream().forEach(i->System.out.println(i));
		c.forEach(i -> System.out.println(i));
		
		Map<Integer,String> m=new HashMap();
		m.put(1,"h");
		m.put(5,"hb");
		m.put(7,"kjmsh");
		m.put(9,"kjmksjkijdskjh");
		//Set<Map.Entry<Integer, String>> g=m.entrySet();
		for(Map.Entry<Integer,String> b:m.entrySet()) {
			System.out.println(b.getKey()+"           "+b.getValue());
		}

	}
}
