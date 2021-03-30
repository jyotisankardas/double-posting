import java.util.HashMap;

class Employe {

	int id;

	public Employe(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}

public class HasMapTest {

	public static void main(String[] args) {
		Employe e1 = new Employe(1);
		Employe e2 = new Employe(9);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

		HashMap<Employe, String> map = new HashMap<>();
		map.put(e1, "raja");
		map.put(e2, "raja");

		System.out.println(map);
		System.out.println(map.size());

	}

}
