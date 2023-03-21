import java.util.Scanner;


public class CircleTest2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		final double PI = 3.14159;
		
		System.out.print("Please enter the radius of a circle in m: ");
		
		double radius = input.nextDouble();
		
		System.out.print("\nThe area of the Circle is: " +(radius*radius*PI) +" m^2\n");

		System.out.println(0.26 % 8);
		input. close();
		
	}

}
