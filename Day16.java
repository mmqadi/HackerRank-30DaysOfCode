import java.util.*;
public class Day16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		try {
			int a = Integer.parseInt(s);
			System.out.print(a);
		}
		catch(NumberFormatException ex) {
			System.out.print("Bad String");
		}
		in.close();
	}

}
