package reverse_Number;

public class Reverse_number {

	public static int getvalue(Integer i) {

		int rev = 0;
		while(i>0) {
			rev=rev*10+i%10;     //1234
			i=i/10;
		}
		return rev;
	} 

	public static void main(String[] args) {
System.out.println(getvalue(1234));
	}

}
