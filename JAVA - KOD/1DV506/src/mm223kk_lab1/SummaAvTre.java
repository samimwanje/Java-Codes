/* Tillägg hantering av namn som Bo ahl med if-satser. Ex...
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */




package mm223kk_lab1;
import java.util.Scanner;
public class SummaAvTre {

	public static void main(String[] args) {
		
		
		
		
		Scanner input = new Scanner(System.in);
		
		// Eko ange ett tresiffrigt heltal.
		System.out.print("Ange ett tresiffrigt heltal: ");
		
		int number = input.nextInt();
		
		// Dividerar med 10-tal och anger resten.
		int a = number % 10, b = (number/10) % 10 , c = (number/100) % 10;
		
        // resultat + summan av a b c => ex 1 2 3... 
		System.out.println("Summan av siffrorna i heltalet ar: " +(a+b+c));

		input. close();

	}

}
