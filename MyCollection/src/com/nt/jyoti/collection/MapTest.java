package com.nt.jyoti.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapTest {
	/*static {
		System.out.println(10/0);
	}*/

	public static void main(String[] args) {

		Map<Integer, String> m=new HashMap<>();
		m.put(1, "jyoti");
		m.put(2, "hari");
		m.put(5, "sita");
		m.put(8, "jumka");
		m.put(19, "raja");
		Set<Integer>l =new CopyOnWriteArraySet<>();
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(4);
		l.add(67);
		l.add(88);
		l.add(8);
		l.add(10);
		System.out.println(l);
		for(Integer x:l) {
			l.add(89839);
			System.out.println(x);
		}
	System.out.println(l);
		/*m.forEach((k,v)->System.out.println(k+"          "+v));
		Set<Map.Entry<Integer, String>>m8=m.entrySet();
		for(Map.Entry<Integer, String> b:m8) {
			System.out.println(b.getKey()+"    "+b.getValue());
		}*/
		
		/*Set<Integer> h=l.stream().filter(i->i%2==0).collect(Collectors.toSet());
		System.out.println(h);
		m.entrySet().stream().forEach(i->System.out.println(i.getKey()+"======"+i.getValue()));
		Collection<Integer> c=new ArrayList<>();
		c=Collections.unmodifiableCollection(c);
		c.add(2);
		*/
	}

}
