import java.util.Scanner;


public class IFnumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please insert the first number: ");
		
		double number1 = input.nextDouble();
		
		System.out.print("\nPlease insert the second number: ");

		double number2 = input.nextDouble();
		
		System.out.print("\nPlease type your sum of the numbers: ");
		
		double sum = input.nextDouble();
		

		System.out.print( (number1 + number2 == sum) );
		
		input.close();


	}

}
