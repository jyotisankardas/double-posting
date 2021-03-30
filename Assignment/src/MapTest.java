import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	
	public static void main(String[] args) {
		Map<String, Integer> m=new HashMap<String, Integer>();
		m.put("ajj", 1);
		m.put("ajnhjj", 6);
		m.put("hbnd", 7);
		m.put("mjnd", 35);
		m.put("kdjkjm", 89);
		//System.out.println(m);
		for(Map.Entry<String, Integer> n:m.entrySet()) {
			System.out.println(n);
		}
	}

}
