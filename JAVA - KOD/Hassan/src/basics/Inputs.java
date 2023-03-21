package basics;

import java.util.Scanner;	// Bilioteket för Scanner.


public class Inputs {
	
	
	public static void main(String args[]) {
		
		
		Scanner input = new Scanner(System.in);					// Hämta hjälpmedel för inläsning av tangentbord.
		System.out.println("How old are you: ");				// Skriv ut en fråga om ålder.
		String age = input.nextLine(); 							// Vänta på inmatning.
		System.out.println("You are " +age +" years old.");		// Print ut age inmatningen.
		
		
		
		System.out.println("Hur snabb är du: ");				// Skriv ut en fråga om ålder.
		int snabb  = input.nextInt(); 							// Vänta på inmatning.
		
		System.out.println("Du springer " +snabb +" km/h.");		// Print ut age inmatningen.
		
		
		System.out.println("Your first name: ");					// Print ut age inmatningen.
		String firstName = input.nextLine(); 							// Vänta på inmatning.
		
		System.out.println("Your last name: ");					// Print ut age inmatningen.
		String aftername = input.nextLine(); 							// Vänta på inmatning.
		
		System.out.println("Welcome to this program " +firstName +" " +aftername);		// Print ut age inmatningen.
		
		
		
	}
	
	
	
	
	
	

}
