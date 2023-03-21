/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */
package mm223kk_lab4;

import java.util.Scanner;
import java.io.*;

public class LoveCraftMain {
	
	public static void main(String[] args) {
		
		
		String text = "";						// String for current sentence.
		int spaceCount = 0;						// Flag for counting pages.
		int lines = 0;							// Variable to count lines.
		int space = 0;							// Flag for counting spaces
		int pages = -1;							// Variable to count pages with numbers.
		Scanner input = null;					// Scanner.
		
		try {
		// Scanner reading document location.
		input = new Scanner(new File("D:\\Dropbox\\Skola\\Universitet\\DATATEKNIK\\JAVA - KOD\\1DV506 2020\\src\\mm223kk_lab4\\lovecraft.txt") );
		
		// While there is textlines in the text file do this...
		while(input.hasNextLine()) {
			lines++;			// Increase for each line.
			text = input.nextLine(); // Save the sentence on text.
			
				if(false  == text.contains(" ")) { // If the sentence is a " "-space. Then increase space. Also increase previous.
					spaceCount++;
					space++;
					}
				
				
				// Check if current sentence is a number.
				boolean numeric = true;
				try {
				@SuppressWarnings("unused")
				Double number = Double. parseDouble(text);
				} catch (NumberFormatException e) {
				numeric = false;
				}
				
				// If current sentence is a number, and we have had more then 3 empty lines, it must be a page-number.
				if(numeric == true && spaceCount >= 3) {
				// Increase pages.
					pages++;
					spaceCount = 0;		// Reset space-counter.
					}
				// Print current sentence.
				System.out.println(text);
		}
		
		}
		// If error occurs.
		catch(Exception e ){	
	    System.out.println("The file could not be found");	
		}
		
			
		// Display stats.
		System.out.println("\nLovecraft statistics: ");
		System.out.println("Toatal Lines: " +lines);
		System.out.println("Empty Lines: " +space);
		System.out.println("Lines with text: " +(lines-space-pages));
		System.out.println("Lines with page number: " +pages);
		input.close();
			
	}
	
}
	
