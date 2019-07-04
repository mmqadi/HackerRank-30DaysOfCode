import java.util.*;
public class Day29 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = in.nextInt();
			int k = in.nextInt();
			
			long max = -1;
			for(int a = 1; a <= n; a++) {
				for(int b = a+1; b <=n; b++) {
					long temp = a & b;
					
					if(temp > max && temp < k)
						max = temp;
				}
			}
			
			System.out.println(max);
			
		}
		in.close();
	}

}
