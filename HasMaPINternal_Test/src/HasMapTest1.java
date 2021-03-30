import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapTest1 {
	
	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(1, "A");
		m.put(2, "B");
		m.put(3, "C");
		m.put(4, "D");
		m.put(5, "E");
		m.put(6, "F");
		m.put(6,"h");
		System.out.println(m);
		System.out.println(m.keySet());
		Set<Integer> s=m.keySet();
		System.out.println(s);
		System.out.println(m.values());
		Collection<String> s1=m.values();
		System.out.println(s1);
		
		Set<Map.Entry<Integer, String>> t=m.entrySet();
		System.out.println(t);
		for(Map.Entry<Integer, String> s5 :t) {
			System.out.println(s5.getKey()+"------"+s5.getValue());
			
		}
	}

}
