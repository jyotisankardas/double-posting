package com.nit;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Jsonutil {

	private static ObjectMapper mapper=null;
	static {
		 mapper=new ObjectMapper();
	}
	public static String convertobjtoJson(Object obj) throws JsonGenerationException, JsonMappingException, IOException {
		
		return mapper.writeValueAsString(obj);
				
	}

}

