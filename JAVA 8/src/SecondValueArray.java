import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SecondValueArray {
	
	
	
	
	public static int seconValue(int a[],int total) {
		int temp=0;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		return a[total-2];
	}
	public static void main(String[] args) {
		//int i[]= {4,7,2,9,3,5};
		
		//System.out.println(seconValue(i, 6));
		List<Object>b=new ArrayList<Object>();
		Set<Object> t=new TreeSet<Object>();
		t.add("b");
		t.add(9);
		t.add('c');
		
		
		/*
		 * for(int c=1;c<=100;c++) { b.add("c"); }
		 */
		//System.out.println(b.size());
		/*
		 * Integer max = Collections.max(b); b.remove(b.indexOf(max));
		 * System.out.println(Collections.max(b));
		 */
		 List<Integer> collect = b.stream().map(i->i+2).collect(Collectors.toList());
		System.out.println(collect);
	}
	
	
	

}
