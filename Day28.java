import java.util.*;
public class Day28 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		List<String> names = new ArrayList<String>();
		
		for(int i = 0; i < n; i++) {
			String name = in.next();
			String email = in.next();
			
			if(email.matches("[a-z.]*@gmail.com")) {
				names.add(name);
			}
			
			
		}
		
		Collections.sort(names);
		for(String nam: names) {
			System.out.println(nam);
		}
	}

}
