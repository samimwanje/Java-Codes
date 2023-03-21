import java.util.Scanner;


public class GuessNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
// Generera siffra mellan 1 - 100
		int random = (int)(Math.random() *101) ;
		
		
// Väntar på gissning 
		
		System.out.print("Please guess a number between 0 and 100: ");
		
		
		int guess = input.nextInt();
		
		
// Om gissning är fel, håller sig inom denna loopen		
		
		while(guess != random) {
			
// Om gissning för låg
			
		if(guess < random) {
			
		System.out.print("Your number is too low please try again: ");
		guess = input.nextInt();
		
		}
		
// Om gissning för låg
		
		else if (guess > random) {
			
		System.out.print("Your number is too high please try again: ");	
		guess = input.nextInt();
		
		}
		 
		
		}
		
// Om gissnig är lika med genererade siffra.
		
		System.out.print("Your guess is correct " +"the number is: " +random);
		
		input. close();
	
	}
}