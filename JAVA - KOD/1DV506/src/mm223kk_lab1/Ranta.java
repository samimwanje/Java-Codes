/* Tillägg hantering av namn som Bo ahl med if-satser. Ex...
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */



package mm223kk_lab1;


// Hitta Scanner i java.utill... for lasning av keyboard.
import java.util.Scanner;

public class Ranta {

	public static void main(String[] args) {
		
		// Aktivera lasning fran keyboard.
		
		Scanner input = new Scanner(System.in);
		
		
		// Eko hur mycket vill du satta in.
		
		System.out.print("Ange hur manga kr du tanker sätta in: ");

		double startAmount = input.nextDouble();

		
		// Eko ange ranta
		
		System.out.print("\nAnge Ranta i procent: ");
		
		double ranta = input.nextDouble();
		
		// Formel s = c * x^t
		
		double x = ( ranta / 100 + 1.0);
		
		//  Vi hojer upp x med 5, efter som det ar fem år. Avrundar. 
		
		double amount = Math.round((startAmount* Math.pow( x , 5)));
		
		// Skriv ut vardet efter fem ar
		
		System.out.println("\nVardet på besparingarna after fem ar är: " +(int)amount +" kr.");

		// Stang lasning fran keyboard.
		
		input. close();
		
	}

}
