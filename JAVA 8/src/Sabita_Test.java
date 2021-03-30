import java.util.Scanner;

public class Sabita_Test {
	
	public static String getString(String msg) {
		
		String[] splitMsg=msg.split(" ");
		String rev="";
		
		for(int i=0;i<splitMsg.length;i++) {
			String word=splitMsg[i];
			for (int j = word.length()-1;j>=0;j--) {
				rev=rev+word.charAt(j);
				
			}
			rev=rev+" ";
			
		}
		
		
		
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Give a String msg");
		
		System.out.println(Sabita_Test.getString(scn.nextLine()));
		/*
		 * Map<Integer, Character> m=new HashMap<Integer, Character>(); m.put(1, 'g');
		 * m.put(7, 'f'); m.put(2, 'b'); m.put(8, 'c'); m.put(0, 'a'); m.put(2, 'x');
		 * m.forEach((i,j)->System.out.println(i+""+j)); Set<Integer> s=new
		 * HashSet<Integer>(); s.add(2); s.add(2); System.out.println(s.size());
		 */
		
	}

}
