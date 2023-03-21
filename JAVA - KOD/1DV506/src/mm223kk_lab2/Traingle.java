/*
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */

package mm223kk_lab2;

import java.util.Scanner;

	public class Traingle {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		// Variabel för mellanrum.
		
		int n = 0;
		
		
		System.out.print("Mata in ett udda heltal: ");
		
		int bas = input.nextInt();
		

	
		//Om inmatat tal är ett positiv heltal.
		
		if( bas % 2 != 0 && bas > 0) {
			

			
			
		// Rätvinklig triangel	
			
		System.out.println("Rätvinklig triangel: ");

		
		for(int x = bas; x > 0; x--) {
			
			
		// Skriv ut x st "*". X går ifrån inmattade tal till 1.
				
			
		for(int i = 0; i < x; i++) {
		
		System.out.print("*");
			
		}
		
		// radhopp och "n"-mellanrum.
			
		System.out.println();

		for(int w = 0; w <= n; w++) {

		System.out.print(" ");

		}
		
		// n ökar alltså ökar mellanrummet innan "*".
		
		n++;
		
		}


		// Likbent triangel	
		
		System.out.println("Likbent triangel: ");
		
		for(int i = 0; i < bas-3; i++) {
			
			
		for(int x = 0; x < bas-4; x++) {
			
		System.out.print(" ");

			
			
		}
		
		}
		
		
		
		for(int i = 0; i <= bas; i++) {
			
			
		// Mellanrum antal antal gånger som behövs.	
	
		for(int y = 1; y <= bas-i; y++) {
			
		System.out.print(" ");
		
		}
		
		
		// Printar "*" + mellanrum, för att få likbent.
		
		for(int j = 1; j <= i; j++) {
	
		System.out.print("* ");

		}
		
		// Radhopp och börjar om. Med fler "* ".
		
		System.out.println();	
		}
		

		
		
		// Annars avbryt
		}
		else {
		System.out.print("Felaktigt tal");
			
		System.exit(0);
			
		}
		input.close();
	
	}
	
	
	
}
	


