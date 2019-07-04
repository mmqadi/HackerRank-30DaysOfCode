import java.util.Arrays;
import java.util.Scanner;

public class Day14 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Difference(int[] el){
        elements = el;
        Arrays.sort(elements);
    }

    public void computeDifference(){
        maximumDifference = Math.abs(elements[0] - elements[elements.length - 1]);
    }

    public int maximumDifference(){
        return maximumDifference;
    }

}