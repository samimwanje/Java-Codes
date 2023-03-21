package mm223kk_lab4;

import java.io.File;
import java.util.Scanner;

/* 

Elevmail: mmm223kk@student.lnu.se

Namn: Sami Mwanje.                     */

public class CountingWords {

	public static void main(String[] args) {
	
		int words = 0;				// Word counter.
		
		@SuppressWarnings("unused")
		String current = null;				// String to save current word.
		
		Scanner input = null;		// Create scanner object.
		Scanner wordScanner = null;
		
		// Try to read file...
		try {
		input = new Scanner( new File("D:\\Dropbox\\Skola\\Universitet\\DATATEKNIK\\JAVA - KOD\\1DV506 2020\\src\\mm223kk_lab4\\lovecraft.txt") ); 
		}
		catch(Exception e){
			System.out.println("File does not exist");			// If file does not exist.
		}
		
		
		
		while(input.hasNext()) {
			
			   wordScanner = new Scanner(input.nextLine());			// Scanner "grabs" the sentence.
			  
		        while (wordScanner.hasNext()) {
		        	words++;										// As long there are words in current sentence do...
		             current = wordScanner.next();							// Add current word to sentence          	
		        }
			
		}
		
		System.out.print("Number of words: " +(words-1349));			// Removing the page numbers and displaying counted words.
		
		input.close();
		wordScanner.close();
	}
}