import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class AllTest {

	public static void main(String[] args) {
		/*
		 * List<String> l=new ArrayList<String>(); l.add("v"); l.add("c"); l.add("a");
		 * l.add("n"); //System.out.println(l);
		 * 
		 * for(String f :l) { System.out.println(f); }
		 * 
		 * //l.stream().forEach(i->System.out.println(i)); List<Integer>
		 * l2=Arrays.asList(2,34,43,22); //System.out.println(l2); List<Integer> collect
		 * = l2.stream().filter(i->i%2==0).collect(Collectors.toList());
		 * System.out.println(collect);
		 */
		/*
		 * Map<Integer, String>m=new HashMap<Integer, String>(); m.put(1, "k"); m.put(5,
		 * "s"); m.put(3, "j"); m.put(7, "w"); m.put(9, "n");
		 * //m.entrySet().forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
		 * Set<Entry<Integer, String>> entrySet = m.entrySet(); for(Entry<Integer,
		 * String> x:entrySet) { System.out.println(x);
		 * 
		 * }
		 */
		/*
		 * List<Integer> c=new ArrayList<Integer>() {{ add(4); }};
		 * if(System.out.printf("hello")==null) {
		 * 
		 * }
		 */
		Integer i[]= {3,6,2,7,44,8,47};
	Arrays.sort(i);
	System.out.println(Arrays.toString(i));
		Arrays.sort(i,Collections.reverseOrder());
		System.out.println(Arrays.toString(i));
		List<Integer> no=new ArrayList<Integer>() {{add(3);add(34);add(354);add(43);add(93);}};
		List<Integer> collect = no.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
	System.out.println(collect);
	}

}
