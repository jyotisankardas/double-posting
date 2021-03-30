import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListTest {
	
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(2);
		l.add(4);
		l.add(5);
		l.add(9);
		l.add(4);
		l.add(2);
		l.add(1);
		l.add(8);
		l.add(10);
		
		Set<Integer> h=l.stream().filter(i->i%2==0).map(i->i+2).collect(Collectors.toSet());
		//h.forEach(i->System.out.println(i));
		
		List<Integer> collect = l.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println(collect);
	}

}
