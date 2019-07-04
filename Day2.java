import java.util.*;
public class Day2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double mealCost = in.nextDouble();
		int tipPercentage = in.nextInt();
		int taxPercentage = in.nextInt();
		
		double total = mealCost * (1 + tipPercentage / 100.0 + taxPercentage / 100.0);
		
		int Tcost = (int)Math.round(total);
		System.out.print(Tcost);
		in.close();
		
	}

}
