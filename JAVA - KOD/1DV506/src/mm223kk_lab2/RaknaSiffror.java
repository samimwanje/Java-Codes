/*
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */


package mm223kk_lab2;

import java.util.Scanner;

public class RaknaSiffror {

	public static void main(String[] args) {
		
		
		// Ber om inmatning av heltal
		
		Scanner input = new Scanner(System.in);
		
		System.out.print( "Mata in ett heltal: " );
		
		
		int HELTAL = input.nextInt();
		
		// Omvandlar heltalet till en sträng.

		String talstring = Long.toString(HELTAL);	
		
		// För beräkning av udda, jämna och nollor.
	
		int noll = 0; 
		int udda = 0;
		int jamn = 0;	
		
		// Kontrollerar att det är ett positivt heltal som är instoppat. Om inte, så stoppas programmet. (0 = heltal...).
		
		System.out.println(HELTAL);

		
		if(HELTAL >= 0) {
			
			
		// Går igenom heltalssträngen och omvandlar "tal" för "tal" till int-typ.
		
		for(int i = 0; i < talstring.length(); i++) {
			
		char bokstav = talstring.charAt(i);
		
		int siffra = Character.getNumericValue(bokstav);
	
		// För analys av talet om det är udda, jämnt eller en nolla.
		
		if( siffra == 0 )	
		noll++; 
	
		
		if( siffra % 2 == 0 && siffra != 0 )	
		jamn++;
		
		if(siffra % 2 != 0)	
		udda++;

	
			}
	
		}
		
		else {
		System.out.println( "Felaktigt tal, starta om." );
		System.exit(0);	
		
		}
		
		
			
		// Skriver ut resultatet och stänger Scanner.
		
		System.out.println( "\nNollor: " +noll +"\nUdda: " +udda +"\nJamna: " +jamn );
		
		input.close();
		
		}
			
}
		