/* Tillägg hantering av namn som Bo ahl med if-satser. Ex...
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */



package mm223kk_lab1;

import java.util.Scanner;

public class Avstand {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		
		
		// Begär x1.
		
		System.out.print( "Ange ditt x1 : ");
		
		double x1 = input.nextDouble();
		
		
		
		
		// Begär y1.

		System.out.print( "Ange ditt y1: " );

		double y1 = input.nextDouble();
		
		
		
		
		// Begär x2.
	
		System.out.print( "Ange ditt x2 : " );
		
		double x2 = input.nextDouble();
		
		
		
		// Begär y2.
		
		System.out.print( "Ange ditt y2 : " );
		
		double y2 = input.nextDouble();
		
		
		// Beraknar avstand.
		
		double avstand = Math.sqrt( Math.pow( (x1-x2 ), 2) + Math.pow( (y1-y2 ), 2) );
			
		
		// Avrundar och anger avstandet.
		
		System.out.println("Avastandet mellan x och y ar: " +Math.round(avstand*100)/100.0);


		// Stang Scanner
		input. close();
		
		
	}

}
