import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

class A{
	
	static {
		try{
			System.out.println(10/0);
		}catch (ExceptionInInitializerError | Exception e) {
			// TODO: handle exception
		}
	}
	public  static  void m11(StringBuffer o) {
		System.out.println("jjjjjjjjjjjjjjjjjjjjjjj");
		
	}
	public  static  void m11(String s) {
		System.out.println("jjjjjjjjjjjjjjj333333333jjjjjjjj");
		
	}
	 
	public static void main(String[] args) {
		
	try {
		System.out.println(10/0);
     } 
     catch (ArithmeticException | ArrayIndexOutOfBoundsException e) 
     { 
        // System.out.println("Exception encountered " + e); 
    	 System.out.println(e.getMessage());
     } 
	A a=new A();
	//m11(null);
	//m11("j");
	}

	
 }