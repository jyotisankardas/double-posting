
//pattern

/*	*   *  *  *  *

 	*   *   *  *  

 	*   *  *  

 	*   *   

 	* 
*/


package com.nit.Pattern2;

public class Pattern2 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" x ");
			}
			System.out.println(" ");
		}
		
	}
	

}
