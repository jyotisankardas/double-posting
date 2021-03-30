package com.nit;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class Test {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Employee e=new Employee();
		e.setEmpno(101);
		e.setName("jyoti");
		e.setAddrs("jhnf");
	
		
		String convertobjtoJson = Jsonutil.convertobjtoJson(e);
		System.out.println(convertobjtoJson);
	}
}
