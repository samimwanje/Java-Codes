import java.util.Scanner;

public class CircleScanner {

	public static void main(String[] args) {
		
		
Scanner input = new Scanner(System.in);

double pi = 3.14159;

System.out.print("Please enter the radius m, to get the distance and the area around the circle: ");
double radius = input.nextDouble();

System.out.print("The distance around the circle is: " + (2 * pi * radius)+ " m");

System.out.print("\nThe area of the circle is: " +(radius * radius * pi)+" m");

input. close();
	
	}

}
