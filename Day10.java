import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		long m = n;
		int maxCount = 0;
		int count = 0;
		long prev = -1;
		while(m != 0) {
			
			long current = m & 1;
			if(current == 1 && current == prev) {
				count++;
			}else {
				count = 1;
			}
			if(count > maxCount){
				maxCount = count;
			}
			prev = current;
			m = m >> 1;
		}
		
		     
		System.out.println(maxCount);
		in.close();
		

	}

}
