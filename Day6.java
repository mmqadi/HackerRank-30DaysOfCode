import java.util.*;
public class Day6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		
		int t = in.nextInt();
		
		for(int i = 0; i < t; i++) {
			String input = in.next();
			String a = "";
			String b = "";
			
			for(int j = 0; j < input.length(); j++) {
				if(j % 2 == 0)
					b += input.charAt(j);
				else 
					a += input.charAt(j);
			}
			System.out.println(b +" " + a);
			in.close();
		}
	}

}
