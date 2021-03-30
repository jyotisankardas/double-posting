import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistTest {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("C");
		l.add("B");
		l.add("A");
		l.add("G");
		l.add("b");
		l.add("v");
		l.add("y");
		System.out.println(l);
		Collections.unmodifiableList(l);
		l.add("jnjd");
		System.out.println(l);
		
		
	}
}
