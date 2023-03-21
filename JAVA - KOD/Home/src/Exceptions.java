import java.util.Scanner;


public class Exceptions {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	
	int n1 = input.nextInt();
	
	System.out.print("\nEnter second number: ");
	
	int s = 0;
	
	int n2 = input.nextInt();
	
	
	// Try this
	
	do {
		
	try{
	int sum = n1/n2;
	s = 1;
	System.out.println(sum);
	
	}
	
	// If error do this
	catch(Exception e) {
		
	System.out.println("\nYou can't do that.");
	
	System.out.print("\nEnter a new second number: ");
	
	n2 = input.nextInt();
	
	}
	
	}
	while(s == 0);
		
		
	}
		
		
		
}

