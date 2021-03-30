import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasMap_Retrive {
	
	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(1,"rama");
		m.put(5,"sita");
		m.put(7,"hari");
		m.put(9,"raja");
		m.put(4,"prakash");
		
		//System.out.println(m);
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		System.out.println(m.entrySet());
		Set<Map.Entry<Integer, String>> s1=m.entrySet();
		
		for(Map.Entry<Integer,String> m2:s1) {
			System.out.println(m2.getKey()+"------"+m2.getValue());
			//System.out.println(m2.getValue());
		}
	}

}
