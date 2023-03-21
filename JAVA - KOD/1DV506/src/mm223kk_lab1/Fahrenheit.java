/* Tillägg hantering av namn som Bo ahl med if-satser. Ex...
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */

package mm223kk_lab1;

import java.util.Scanner; // Scanner finns i java.util package.

public class Fahrenheit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Vi skapar en scannerobjekt kopplad till keyboard.
			
		System.out.print("Ange temperaturen i Fahrenheit: ");
		
		double FAR = input.nextDouble();  // Sparar angivet varde till FAR.
		
		System.out.println( "\nTemperaturen i Celcius ar = " +(5*FAR-160)/9); // Anger nya vardet med ekvationen (5*FAR-160)/9.

		input. close(); // Stang scanner.
		
	}

}
