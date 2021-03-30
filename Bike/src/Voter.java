import java.util.Scanner;

public class Voter {

	private int voter_age;

	public void setVoter_age(int voter_age) throws Exception {
		if (voter_age < 18 || voter_age > 120) {
			if (voter_age < 18)
				System.out.println("you r tiny age wait for votting for " + (18 - voter_age) + " years");
			else
				System.out.println("yor r very old person ");

			throw new Exception("age must be between 18 and 120");
		} else {
			this.voter_age = voter_age;
			System.out.println("You r eligibule for votting and your age is " + voter_age);
		}
	}

	public int getVoter_age() {
		return voter_age;
	}

	public static void main(String[] args) throws Exception {
		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter voter age :- ");
			Voter v = new Voter();
			v.setVoter_age(scn.nextInt());
			System.out.println(v.getVoter_age());
		}
	}

}
