import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleOne {
	public static void main(String[] args) {
		int j[]= {4,9,2,5};
		Arrays.sort(j);
		System.out.println(Arrays.toString(j));
		
		
		//System.out.println(secondHigest(j, 4));
	}
	/*
	 * public static int secondHigest(int a[],int total) { int temp; for(int
	 * i=0;i<total;i++) { for(int k=i+1;k<total;k++) { if(a[i]>a[k]) { temp=a[i];
	 * a[k]=a[i]; a[i]=temp;
	 * 
	 * } }
	 * 
	 * } return a[total-2]; }
	 */
		// List<Integer>l=Arrays.asList(1,3,5,3,4,2);
		/*
		 * Set<Integer>s=new HashSet<Integer>(); for(Integer c:l) { if(!s.add(c)) {
		 * 
		 * System.out.println(c); } }
		 */
		// Arrays.sort(j);
		/*
		 * for(int i=0;i<=j.length-1;i++) { for(int k=i+1;k<=j.length-1;k++) {
		 * if(j[i]==j[k]) { System.out.println(j[i]); } } }
		 */

		/*
		 * int c=98739; int b=0;int rev=0; while(c>0) { b=c % 10; rev=rev*10+b; c=c/10;
		 */

		/*
		 * } System.out.println(rev);
		 */

	/*
	 * ArrayList<Integer> al=new ArrayList<Integer>(); al.add(1); al.add(2);
	 * al.add(3); al.add(4); Integer max = Collections.max(al);
	 * al.remove(al.indexOf(max)); System.out.println(Collections.max(al));
	 */
		
		

		/*
		 * ArrayList<Integer> al = new ArrayList<Integer>(); al.add(1); al.add(2);
		 * al.add(3); al.add(4); System.out.println(al);
		 * 
		 * int j = Collections.max(al);
		 * 
		 * System.out.println("Max in the array is " + j); al.remove(al.indexOf(j)); int
		 * max2 = Collections.max(al); System.out.println(max2);
		 */

	}


