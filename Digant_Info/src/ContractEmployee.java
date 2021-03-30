import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContractEmployee{
	
	public static void main(String[] args)throws Exception{
		Pattern pa=Pattern.compile("M+",5);
		Matcher ma=pa.matcher("M Merit Match MM m mM");
		while(ma.find())
			System.out.print(ma.group()+" ");
	}

}
