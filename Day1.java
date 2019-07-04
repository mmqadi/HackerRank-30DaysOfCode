import java.util.*;
public class Day1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        int a = in.nextInt();
        double b = in.nextDouble();
        String c = in.nextLine() + in.nextLine();
        
        System.out.println((i + a));
        System.out.println((d + b));
        System.out.println((s + c));
        in.close();
	}

}
