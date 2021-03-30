import java.util.Arrays;

/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
Example
arr = [1,3,5,7,9]
The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=24. 
The function prints
16 24
*/
public class Example {
	
	public static void main(String[] args) {
		int i[]= {1,3,5,7,9,8,438,98};
		int totalminSum=0;
		int totalmaxSum=0;
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		
		
		for(int j=0;j<i.length;j++) {
			if(i[j]!=9) {
				totalminSum=totalminSum+i[j];
		}
		}
			for(int v=0;v<i.length;v++) {
				if(i[v]!=1) {
					totalmaxSum=totalmaxSum+i[v];
			}
			}
		System.out.println(totalminSum);
		System.out.println(totalmaxSum);
		
		
	}




//public interface EmplyeRepo extends CrudRepo<>
}




