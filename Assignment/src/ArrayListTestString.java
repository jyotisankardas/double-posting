import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListTestString {
	
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("a");
		l.add("bb");
		l.add("ccc");
		l.add("dddd");
		l.add("acb");
		l.add("efg");
		
		
//		Comparator<String> c=(i1,i2)->{
//			int len1=i1.length();
//			int len2=i2.length();
//			if(len1<len2)
//				return -1;
//			else if (len1>len2) 
//				return 1;
//			else 
//				return i1.compareTo(i2);
//		};
		
		
		
		
		
		//List<String> msg=l.stream().sorted(c).collect(Collectors.toList());
		
		
		List<String> msg=l.stream().sorted((i1,i2)->{
			int len1=i1.length();
			int len2=i2.length();
			if(len1<len2)
				return -1;
			else if (len1>len2) 
				return 1;
			else 
				return i1.compareTo(i2);
		}).collect(Collectors.toList());
		System.out.println(msg);
		}
			
		
	}


