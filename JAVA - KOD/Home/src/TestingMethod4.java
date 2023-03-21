
import java.util.Scanner;

public class TestingMethod4 {
	
	
	
	
	
	
	
	
	// f(x) = x * x
	
	
	static int square(int x) {
		
		return x * x;
		
		
	}

	
	
	

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		
		int result = square(input.nextInt());
		
		System.out.print(result);
		
	
input.close();
	}
	


}
