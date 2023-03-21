import java.util.Scanner;

public class ThreeValuesSum {

	public static void main(String[] args) {
				
Scanner input = new Scanner(System.in);

System.out.print("Please enter 3 values and I will sum them." );

System.out.print("\nValue 1 = " );


double v1 = input.nextDouble();

System.out.print("\nValue 2 = " );


double v2 = input.nextDouble();

System.out.print("\nValue 3 = " );


double v3 = input.nextDouble();

double sum = v1+v2+v3;

System.out.print( "\nThe sum si " +(sum) );

System.out.print("\nThe average numer of t he three values is = " +(sum/3) );


input. close();

	}

}
