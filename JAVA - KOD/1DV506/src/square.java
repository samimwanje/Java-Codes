import java.util.Scanner;


public class square {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("Please insert a number greater than 3: ");
	
	int num = input.nextInt();
	
	
	
	while(num < 3) {
		
	System.out.print("\n Error false number.");

	System.out.print("Please insert a number greater than 3: ");
	
	 num = input.nextInt();
	
	}
	
	
	
	
	// 1. 
	
	for(int i = 0; i < num; i++) {
		
	System.out.print("*");
		
	}
	

	
	
	
	//2.
	
	for(int i = 0; i < num-2; i++) {
	
	System.out.println();
	
	System.out.print("*");

		
	
	for(int y = 0; y < num-2; y++) {
			
	System.out.print(" ");
		
	}
	
	System.out.print("*");
			
	}
	
	System.out.println();
	
	
	for(int i = 0; i < num; i++) {
		
	System.out.print("*");
			
	}
	
	input.close();
	
	}

}

	