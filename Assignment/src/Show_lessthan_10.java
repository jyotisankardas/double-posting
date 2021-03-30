import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Show_lessthan_10 {
	
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		
		for(int i=0;i<20;i++) {
			l.add(i);
		}
		
		//l.forEach(i->System.out.println(i));
		//l.forEach(System.out::println);
		
		/*System.out.println(l.stream().filter(i->i<=10).collect(Collectors.toList()));
		long l2=l.stream().filter(i->i<=10).count();
		System.out.println(l2);*/
		
		//System.out.println(l.stream().map(i->i+2).collect(Collectors.toList()));
		//System.out.println(l.stream().sorted().collect(Collectors.toList()));
		int k=l.stream().filter(i->i%2==0).mapToInt(i->i+2).sum();
		System.out.println(k);
		
	}

}
