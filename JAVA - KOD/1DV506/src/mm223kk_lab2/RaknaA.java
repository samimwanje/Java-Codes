/* 
		
jag			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */



package mm223kk_lab2;

import java.util.Scanner;


public class RaknaA {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
// Begär en rad text
		
		
		System.out.print("Please type a textline: ");
		
		String line = input.nextLine();
		
// Skapar en variabel för A och en för a.
		
		int A = 0;
		
		int a = 0;	
		
// Går igenom textraden bokstav för bokstav 
		
		for( int i = 0; i < line.length(); i++) {
	
		
		char letter = line.charAt(i);
			
		
// Om bokstaven A uppstår A + 1.
		
		if( letter == 'A' ) {
			
		A++;					
			}
			
			
// Om bokstaven a uppstår a + 1.

		
		else if( letter == 'a' ) {
			
		a++;
		
			}
		
		}
		
		
// Ange antalet och stäng Scanner.
		
		System.out.println( "Antal  A: "+A  +"\nAntal  a: "+a );

		input. close();
		
	}
		
	
}
		
