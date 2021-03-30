import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TEST {
	
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(2,5,7,8,3);
		l.stream().forEach(i-> System.out.println(i));
		List<Integer> collect = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(collect);
		String s="jnjnjn";
		char[] charArray = s.toCharArray();
		for(char c:charArray) {
			System.out.println(c);
		}
		Map<Integer, String> m=new HashMap<Integer, String>(){{
			put(1,"rama");
			put(3,"hari");
			put(6,"sima");
			String put = put(1,"rima");
			System.out.println(put);
			
		}};
		m.entrySet().forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
	}

}
