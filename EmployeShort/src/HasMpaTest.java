import java.util.HashMap;

public class HasMpaTest {
	
	public static void main(String[] args) {
		HashMap< Integer, String> m=new HashMap<>();
		m.put(1, "A");
		m.put(2, "B");
		m.put(3, "C");
		System.out.println(m.put(6, "f"));
	}

}
