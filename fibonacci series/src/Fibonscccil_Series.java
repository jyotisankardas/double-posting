import java.util.Scanner;

public class Fibonscccil_Series {

	public static int get_fib_num(Integer num) {
		int f1 = 0;
		int f2 = 1;
		int fib = 0;
		for (int i = 1; i <= num; i++) {
			fib = f1 + f2;
			f1 = f2;
			f2 = fib;
			System.out.println("fib number " + fib);

		}
		return fib;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("give a number ");
		int num = scn.nextInt();
		get_fib_num(num);
		
	}

}
