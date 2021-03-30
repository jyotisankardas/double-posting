import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1[]=new  Integer[11];
		i1[0]=1;
		i1[1]=2;
		i1[2]=3;
		i1[3]=5;
		i1[4]=4;
		i1[5]=6;
		i1[6]=7;
		i1[7]=8;
		i1[8]=9;
		i1[9]=10;
		i1[10]=11;
List<Integer>l=Arrays.asList(i1);
System.out.println(l);

//2 4 6 8 10      //4 8 12 16 20 
Optional<Integer> l8=l.stream().filter(i->i%2==0).filter(i->i<3).map(i->i*2).findFirst();
	System.out.println(l8);
	}

}
