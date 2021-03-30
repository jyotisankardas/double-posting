import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcorentTest {
	
	public static void main(String[] args) {

		List<String> mob=new CopyOnWriteArrayList<String>();
				mob.add("mi");
				mob.add("samsung");
				mob.add("relami");
				mob.add("nokia");

		//System.out.println("hi");
		for(String s:mob) {
			if(s.equals("mi")) {
				mob.remove("mi");
				System.out.println(mob);
			}
		}
	}
}


