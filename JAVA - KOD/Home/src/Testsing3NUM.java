
import java.util.Scanner;

public class Testsing3NUM {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please give me three numbers");
		
		
		// Number 1
		
		System.out.print("\nNumber 1: ");
		
		double N1 = input.nextDouble();
		
		
		// Number 2
		
		System.out.print("\nNumber 2: ");


		double N2 = input.nextDouble();

		
		// Number 3
		
		System.out.print("\nNumber 3: ");


		double N3 = input.nextDouble();
		
		System.out.print("The Sum of these three numbers is: " +(N3+N2+N1));
		
		System.out.print("\nThe average of these three numbers is: " +(N3+N2+N1)/3);
		
		
		input. close();

	}

}
