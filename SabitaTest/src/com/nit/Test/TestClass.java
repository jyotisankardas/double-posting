package com.nit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.nit.Exception.ExceptionTest;

public class TestClass {

	public static void m1() throws ExceptionTest {

		throw new ExceptionTest("mala manish");

	}

	public static void main(String[] args) {

		/*
		 * try { //TestClass.m1(); } catch (ExceptionTest e) { e.printStackTrace(); }
		 * finally { System.out.println("rama is good "); }
		 */
		List<Integer>l=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		//l.forEach(i->System.out.println(i));
		List<Integer> collect2 = l.stream().filter(i->i%2!=0).collect(Collectors.toList());
		List<Integer> collect = l.stream().map(i->i+2).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println(collect2);
		l.forEach(i->System.out.println(i));
		List l2=new ArrayList();
		List l3=new ArrayList();
		String s="java";
		String s2=new String("java");
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s.equals(s2));
		System.out.println(s==s2);
	/*	String s="java";
char[] charArray = s.toCharArray();
		for(int i=0;i<=charArray.length-1;i++) {
			System.out.println(charArray[i]);*/
		/*
		 * Map<Integer, String> hm=new HashMap<Integer, String>(); hm.put(110,"Ravi");
		 * hm.put(120,"Prateek"); hm.put(130, "Davesh"); hm.put(140, "Kamal");
		 * hm.put(150, "Pawan"); Iterator<Integer>i=hm.keySet().iterator();
		 */
		/*
		 * while(i.hasNext()) { int r=(int)i.next(); System.out.println(r+hm.get(r));
		 * 
		 * }
		 */
		/* hm.forEach((v,c)->System.out.println(v+c)); */
	}

}
