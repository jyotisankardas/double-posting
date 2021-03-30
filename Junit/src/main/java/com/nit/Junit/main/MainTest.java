package com.nit.Junit.main;

import com.nit.service.CalService;

public class MainTest {
	
	public int totaladd(int a,int b) {
	
	 CalService cal=new CalService();
	 return cal.add(a, b);
	}
	
	

}
