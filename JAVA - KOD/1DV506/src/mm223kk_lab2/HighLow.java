/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */


package mm223kk_lab2;

import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
// Generera siffra mellan 1 - 100
				int random =  (int)(1+(Math.random() *100));
				
				
// Väntar på gissning och antal gissningar räknare.
				
				System.out.print("Please guess a number between 0 and 100: ");
				
				
				int guess = input.nextInt();
				
				
				int time = 0;
				
// Om gissning är fel, håller sig inom denna loopen		
				
				while(guess != random) {
					
// Om gissning för låg
					
				if(guess < random) {
				
				time ++;
					
				System.out.println("Guess "+time +": " +guess);
				System.out.print("Hint: Higher" +"\n");

				guess = input.nextInt();
				
				}
				
// Om gissning för låg
				
				else if (guess > random) {
				
				time ++;
				System.out.println("Guess "+time +": " +guess);
				System.out.print("Hint: Lower " +"\n");
				guess = input.nextInt();
				
				}
				
				
// Avbryter programmet efter 10 gissningar.
				 
				if(time >= 9) {
					
				System.out.println("Too many guesses, please restart :(");
				
				System.exit(0);
					
				}
				
				
				}
				
// Om gissnig är lika med genererade siffra och stäng Scanner.

				
				System.out.print( "Congratulations you guessed correct after " +time +" tries" );
				
				input. close();
				
				
		}
				
		
			
}