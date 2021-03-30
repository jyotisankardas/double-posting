
public class Bike {

	private int gearnumber;

	public void setGearnumber(int gearnumber) throws Exception {
		if (gearnumber < 0 || gearnumber > 5) {
			throw new Exception("invalid Gear number");
		}
		this.gearnumber = gearnumber;
	}

	public int getGearnumber() {
		if (gearnumber == 0)
			System.out.println("netural gear");
		else if (gearnumber == 1)
			System.out.println("1 number gear");
		else if (gearnumber == 0)
			System.out.println("2 number gea");
		else if (gearnumber == 0)
			System.out.println("3 number gea");
		else if (gearnumber == 0)
			System.out.println("4 number gea");
		else if (gearnumber == 0)
			System.out.println("5 number gea");
		return gearnumber;
	}
	
	public static void main(String[] args) throws Exception {
		Bike b=new Bike();
		b.setGearnumber(-1);
		b.getGearnumber();
	}

}
