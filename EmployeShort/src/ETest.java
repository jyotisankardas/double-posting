import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ETest {

	public static void main(String[] args) {

		Employee e=new Employee("raja", 566727, 2);
		Employee e1=new Employee("hari", 62727, 3);
		Employee e2=new Employee("jyoti", 56627, 5);
		Employee e3=new Employee("dev", 772828, 4);
		Employee e4=new Employee("pickel", 672727282, 1);
		
		List<Employee> l=new ArrayList<>();
		l.add(e);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		
		System.out.println(l);
		
		Collections.sort(l,new Mycomparator());
		System.out.println(l);
		
	}

};

class Mycomparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		/*String n1=e1.name;
		String n2=e2.name;
		return -n1.compareTo(n2);*/
		int n1=e1.exp;
		int n2=e2.exp;
		if(n1<n2) 
			return -1;
		else
			return 1;
		
		
	}

	
	
}
