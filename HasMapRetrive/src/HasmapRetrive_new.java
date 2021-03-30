import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HasmapRetrive_new {
	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("jhf", 1);
		m.put("jnnf", 3);
		m.put("jnjhxdxnf", 7);
		m.put("jjnskjmnnf", 9);
		m.put("jkjxnnf", 32);
		for(String s:m.keySet()) {
			System.out.println(m.get(s));
		}
		for(Integer s:m.values()) {
			System.out.println(s);
		}
		/*
		 * System.out.println(m); Set<Entry<String, Integer>> entrySet = m.entrySet();
		 * for (Entry<String, Integer> b : entrySet) { System.out.println(b.getKey() +
		 * "" + b.getValue()); } m.forEach((k, v) -> System.out.println(k + " " + v));
		 */
		/*
		 * String s="jyoti"; String r=""; for(int i=s.length()-1;i>=0;i--) {
		 * r=r+s.charAt(i); } System.out.println(r);
		 */
		/*
		 * int i=1234; int r=0; int c=0; while(i>0) { r=i%10; c=c*10+r; i=i/10; }
		 * System.out.println(c);
		 */

	}

}
