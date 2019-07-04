import java.util.Scanner;
public class Day26 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] returnedDate = new int[3];
		
		returnedDate[0] = in.nextInt();
		returnedDate[1] = in.nextInt();
		returnedDate[2] = in.nextInt();
		
		int[] expectedDate = new int[3];
		expectedDate[0] = in.nextInt();
		expectedDate[1] = in.nextInt();
		expectedDate[2] = in.nextInt();
		
		in.close();
		int charge = 0;
		
		if(returnedDate[0] > expectedDate[0] && returnedDate[1] == expectedDate[1] && returnedDate[2] == expectedDate[2])
			charge = 15 * (returnedDate[0] - expectedDate[0]);
		else if(returnedDate[1] > expectedDate[1] && returnedDate[2] == expectedDate[2])
			charge = 500 * (returnedDate[1] - expectedDate[1]);
		else if(returnedDate[2] > expectedDate[2])
			charge = 10000;
		
		System.out.println(charge);
	}

}
