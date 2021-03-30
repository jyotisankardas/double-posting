package hodibady;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Test {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(3, "jyoti");
		m.put(1, "ff");
		m.put(2, "ffmmmmmmmmmmm");
		
		Set<Map.Entry<Integer, String>> set=m.entrySet();
		
		for(Map.Entry<Integer, String> n:set) {
			//System.out.println(n.getKey()+"         "+n.getValue());
		}
		
		m.entrySet().forEach(i->System.out.println(i.getKey()+"   "+i.getValue()));
		//m.forEach((k,v)->System.out.println(k+"     "+v));
			
	}

}
