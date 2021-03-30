// Java program to sort hashmap by values 

public class GFG {
	public static int getSecondhighest(int a[],int total) {
		/*int temp=0;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
							
				}
			}
		}
		for(int i:a) {
			System.out.println(i);
		}
		return a[total-2];*/
	

	}
	 
	public static void main(String[] args) {
		/*
		 * String s1="hello"; String concat = s1.concat("raja"); String upperCase =
		 * concat.toUpperCase(); System.out.println(upperCase);
		 * 
		 * Integer num1 = 150; Integer num2 = 150;
		 * 
		 * if(num1==num2){ System.out.println(num1 == num2); } else{
		 * System.out.println("num1 != num2"); }
		 * 
		 * System.out.println(num2);
		 * 
		 */
		int i[]= {4,6,8,9,3,5};
		
		System.out.println("dfg"+GFG.getSecondhighest(i, 6));
		
	}
		
}
