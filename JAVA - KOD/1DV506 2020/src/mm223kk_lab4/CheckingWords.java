/* 

		Elevmail: mmm223kk@student.lnu.se

		Namn: Sami Mwanje.                     */
package mm223kk_lab4;
import java.io.File;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class CheckingWords {

	public static void main(String[] args) {
	

				int words = 0;				// Word counter.
				@SuppressWarnings("unused")
				String current = null;				// String to save current word.
				Scanner input = null;		// Create scanner object.
				Scanner wordScanner = null;
				
				ArrayList<String> wordHolder = new ArrayList<String>();
		
				// Try to read file...
			
				
				System.out.println("Reading Lovecraft works...");
				
				try {
				input = new Scanner( new File("D:\\Dropbox\\Skola\\Universitet\\DATATEKNIK\\JAVA - KOD\\1DV506 2020\\src\\mm223kk_lab4\\lovecraft.txt") ); 
				}
				catch(Exception e){
					System.out.println("File does not exist");			// If file does not exist.
				}
				
				
				while(input.hasNext()) {
					
					   wordScanner = new Scanner(input.nextLine());			// Scanner "grabs" the sentence.
					  
				        while (wordScanner.hasNext()) {
				        															// As long there are words in current sentence do...       		
				        	current = wordScanner.next();
				        	
				        	// Check if current sentence is a number.
							boolean numeric = true;
							try {
							@SuppressWarnings("unused")
							Double number = Double. parseDouble(current);
							} catch (NumberFormatException e) {
							numeric = false;
							}
		
				        	
				        	if(numeric == false) {
				             wordHolder.add(current);							// Add current word to sentence          	
				             words++;
				        	}     
				             
				        }
					
					}
				System.out.println("Done!");
				input.close();
				wordScanner.close();
				
				ArrayList<Integer> wordCount = new ArrayList<Integer>(); 
				int count = 0;
				System.out.println("Analysing text...");
				int a = 0, b = 0, c = 0;
				
				for(int x = 0; x < wordHolder.size(); x++) {
					
					System.out.println("Now at: " +x);
					
					for(int i = 0; i < wordHolder.size(); i++) {
						
						if( wordHolder.get(x).contains(wordHolder.get(i) ) && x != i) {
								count++;
						}		
					}
					
					wordCount.add( wordHolder.indexOf(wordHolder.get(x)), count);
						count = 0;
					
					// Words is lab exercise.
					
					if(wordHolder.get(x).matches("Cthulhu"))
					a++;
					
					
					if(wordHolder.get(x).matches("Azathoth"))
					b++;
					
					if(wordHolder.get(x).matches("Necronomicon"))
					c++;		
					
				}
				
				String mostCommon = "Most common word: " +wordHolder.get(wordCount.indexOf(Collections.max(wordCount))) +" with " +Collections.max(wordCount) +" occurrences";

				
				System.out.print("\n");	
				System.out.println("\n" +mostCommon +".");	
				System.out.println("Number of words: " +(words));			// Removing the page numbers and displaying counted words.
				System.out.println("Occurrences of ”Cthulhu”: " +a);
				System.out.println("Occurrences of ”Azathoth”: " +b);
				System.out.println("Occurrences of  ”Necronomicon”: " +c);
				
	}

}