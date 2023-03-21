/*
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */

package mm223kk_lab2;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		// Ber om en rad text.

		Scanner input = new Scanner(System.in);
		
		System.out.print("Pleanse insert a textline: ");
		
		String textline = input.nextLine();
		
			
		
		// Omvandlar till små bokstäver.
		
		textline = textline.toLowerCase();
		
		char backwards[] = new char [textline.length()];
		
	
		// Skapar en ny sträng som är omvänd den inmattade.

		for(int i = textline.length()-1, j = 0; j < textline.length() && i >= 0; i--, j++) {
			
		
		backwards[j] = textline.charAt(i);
				
		}
				
		String backwards2 = new String(backwards);
		
		
		
		// Bortser från allt som inte är bokstäver.
		
		 textline = textline.replaceAll("[^a-zA]", "");
		 backwards2 = backwards2.replaceAll("[^a-zA]", "");
		 	
	
		// Kontroller om texten är identisk bakifrån. (palindrom).
		
		int match = 0;
		
		
		for(int i = 0; i < textline.length(); i++) {
			
			
		if( backwards2.charAt(i) == textline.charAt(i) ) {
			
		match++;
	
		
		}
		
	
	}
		
		// Kontroller om text matchar sig själv bakifrån. (palindrom).
		
		if(match == textline.length() ){
			
		System.out.println( "Detta ÄR ETT palindrom..." );
					
		}
		else 
			System.out.println( "Detta är INTE ett palindrom..." );

		input.close();
		
	}
		
}
