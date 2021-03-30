import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArraylistTest {
	
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> l=new CopyOnWriteArrayList<>();
		l.add("fff");
		l.add("kjed");
		l.add("jkndknd");
		//System.out.println(l.get(1));
		//l.get(2);
	
	
	/*Iterator<String> itr=l.iterator();
	while(itr.hasNext()) {
		l.add("jhjhjhjnjhjdhd");
		System.out.println(itr.next());
	}*/
		for(String n:l) {
	System.out.println(n);
		}
	}
}
