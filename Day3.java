import java.util.*;
public class Day3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		if((n % 2 == 0) && (n >= 6 && n <= 20) || n % 2 == 1)
			System.out.print("Weird");
		else
			System.out.print("Not Weird");
		in.close();

	}

}
