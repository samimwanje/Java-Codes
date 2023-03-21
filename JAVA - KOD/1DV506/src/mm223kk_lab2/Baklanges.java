/*
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */

package mm223kk_lab2;

import java.util.Scanner;


public class Baklanges {

	public static void main(String[] args) {
		
		
		

	Scanner input = new Scanner(System.in);
	
	// Ber om textrad.
	
	System.out.print("Please insert a textline: ");
	
	String textrad = input.nextLine();
	
	System.out.print("Backwards: ");
	
	
	// Läser in information från textraden baklänges och anger dessa. 
	
	for(int i = textrad.length()-1; i > -1; i--) {
		
	char bokstav = textrad.charAt(i);
	
	System.out.print(bokstav);
	
		}
	
		
	input. close();
	
	}
				
	
		
		
		
}


