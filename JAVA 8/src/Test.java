import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	
	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(1,2,3,4,5);
		List<Integer>l2=Stream.of(1,4).collect(Collectors.toList());
		List<Integer> collect = l.stream().filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println(collect);
		List<Integer> collect2 = l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
System.out.println("jnj"+collect2);
	}

}
