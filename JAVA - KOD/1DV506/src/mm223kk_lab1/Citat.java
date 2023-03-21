/* Tillägg hantering av namn som Bo ahl med if-satser. Ex...
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */


package mm223kk_lab1;


import java.util.Scanner; // Scanner finns i java.util package.

public class Citat {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Vi skapar en scannerobjekt kopplad till keyboard.
		
		
		System.out.print("Skriv in en text: "); // Visar texten i consolen.
		

		String text = input.nextLine(); // Vantar på text fran keyboard.
		

		System.out.println("\nCitat: " +text); // Anger angiven text i Conolsen med Citat:
		

		input. close (); // Avslutar Scannner.

	}

}
