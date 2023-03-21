/* Tillägg hantering av namn som Bo ahl med if-satser. Ex...
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */



package mm223kk_lab1;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		
		// Vardet på PI.
		
		final double PI = Math.PI;
		
		System.out.print("Ange cirkelns radie: ");
		
	
		double radius = input.nextDouble();
		
		// Avrundar. Gör först 10x större, avrundar till heltal och sedan 10x mindre.
		
		double result = Math.round(radius*radius*PI *10)/10.0;
	
	   // Skriv ut area.
		
		System.out.println("\nArean ar: " +result);

		input. close();
	}

}
