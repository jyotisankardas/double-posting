import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Show_Even {

	public static void main(String[] args) {

		List<Integer> l =new ArrayList<Integer>();
		
		for(int i=0;i<=20;i++) {
			l.add(i);
		}
		System.out.println(l);
		
		
		
		/*for(Integer l1:l) {
			if(l1%2==0)
				System.out.println(l1);
		}*/
		
		//l.forEach(i->System.out.println(i));
		//l.forEach(System.out::println);
		List l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		
		
		
	}

	
}
