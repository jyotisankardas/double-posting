import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Map_Test {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "j");
		m.put(6, "jdwwd");
		m.put(8, "jsccscsdcs");
		m.put(3, "jnkn");
		m.put(9, "jjnc,m;l");
		m.put(22, "jkmkmdkkmckm");
		
		Map<Integer, String> s=new Hashtable<>(m);
		s.forEach((c,d)->System.out.println(c+d));
		

	//	System.out.println(m);

		/*
		 * Set<Map.Entry<Integer, String>> s=m.entrySet(); for (Map.Entry<Integer,
		 * String> i :s) { System.out.println(i.getKey()+"  "+i.getValue());
		 * 
		 * }
		 */

		/*
		 * m.entrySet().forEach(i->System.out.println(i.getKey()+"  "+i.getValue()));
		 */
		
		//m.forEach((k,v)->System.out.println(k+"  "+v));

	}

}
