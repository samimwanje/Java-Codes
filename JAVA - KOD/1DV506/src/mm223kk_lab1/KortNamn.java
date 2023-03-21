/* Tillägg hantering av namn som Bo ahl med if-satser. Ex...
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */




package mm223kk_lab1;

import java.util.Scanner;

public class KortNamn {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
				
		System.out.print("Ange förnamn: ");
		
// Förnamn ange.
		
		String firstname = input.nextLine();
		
		
// Eternamn ange.
		
		System.out.print("\nAnge efternamn: ");
		
		String lastname = input.nextLine();
		
// Skapar kort med första på förnamn och fyra första på efternamn.
		
		char cardfirst = firstname.charAt(0);
		
			
		String cardlast  = lastname.substring(0, 4);
	
// Printar ut för och efternamn samt kortnamn.

				
		System.out.print("Fornamn: "+firstname +"\nEfternman: "+lastname);

		System.out.println("\nKortnamn: " +cardfirst+". "+cardlast );

		input. close();
	
		
		/* Tillägg hantering av namn som Bo ahl med if-satser. Ex...
		
				int controll = lastname.length();
				
				String cardlast;
				
				if(controll <= 3) {
					
					
				cardlast  = lastname.substring(0, 3);	
				}
				
				
				else {
					
				cardlast  = lastname.substring(0, 4);
				}   . */
		
		
		
		
	}

}
