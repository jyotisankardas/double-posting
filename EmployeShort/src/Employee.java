
public class Employee {
	
	 String name;
	 int eid;
	 int exp;
	
	public Employee(String name, int eid, int exp) {
		this.name = name;
		this.eid = eid;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", exp=" + exp + "]";
	}
	
	
	
}
