import java.util.HashMap;

public class Test {
	
	public static void main(String[] args) {
		
		String msg="rama is a good boy";
		
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i<msg.length();i++) {
			Character c=msg.charAt(i);
			if(map.containsKey(c)) {
				int count=map.get(c);
				map.put(c, count+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
