import java.util.Scanner;


public class NumberIF {

	public static void main(String[] args) {
		
		
Scanner input = new Scanner(System.in);


	int number1 = (int) (Math.random() * 10);
	int number2 = (int) (Math.random()* 10);

	System.out.println("Number 1: " +number1 );

	System.out.println("Number 2: " +number2 );


	
	if( number1 < number2) {
		
		
	System.out.print("\nWhat is : " +number2 +" - " +number1 +" = ");

	int studentanswer = input.nextInt();
	
	System.out.print("\nThe answer is: " +(number2 - number1));
	
	System.out.println("Your answer is: "  +(studentanswer == number2 - number1));
	
	}
	else {
		
	System.out.print("\nWhat is : " +number1 +" - " +number2 +" = ");

	int studentanswer = input.nextInt();
		
	System.out.print("\nThe answer is: " +(number1 - number2));
	
	System.out.println("\nYour answer is: "  +(studentanswer == number1 - number2));
	
	
	}
	
	
	
	

    input.close();
    
    
    
	}

}
