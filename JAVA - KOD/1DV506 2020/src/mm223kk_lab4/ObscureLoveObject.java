/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */
package mm223kk_lab4;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ObscureLoveObject {	
	
	private Scanner input = new Scanner(System.in); 	// Scanner for user input.
	
	private Scanner inputFile;							// Scanner for reading file etc.
	
	private ArrayList<String> text = new ArrayList<String>();		//ArrayList for each line.
	
	private ArrayList<String> textObscure = new ArrayList<String>();	//ArrayList for Obscure lines.
	
	private PrintWriter writer;											// For printing in file.
	
	
	// Constructors.
	
	public ObscureLoveObject(String location) {

		try {
			// Scanner reading document location.
			inputFile = new Scanner(new File(location) );
			
			// While there is text lines in the text file do this...
			while(inputFile.hasNextLine()) {	
				text.add(inputFile.nextLine()); // Save the eact textline on a ArrayList.
			}
			inputFile.close();	
			}
			// If error occurs.
			catch(FileNotFoundException  e ){	
		    System.out.println("The file could not be found.");
		    System.exit(0);	
			}
			
	}
	
	
	// The body of this method can be used in main.
	public void start() {
		// Loop until break.
		while(true) {
			
			//Creating of the output theme.
		System.out.println("Obscure\n=======");
		System.out.println("1. Make obscure");
		System.out.println("2. Make readable");
		System.out.println("3. Print obscure");
		System.out.println("4. Print readable");
		System.out.println("0. Exit!");
		System.out.print("\n==> ");
		
			// Checks if users entered number is valid.
				
		int number = input.nextInt(); // Number for user input.
		
		if(number >= 0 && number <= 4) {						// If valid number enterd jump to methods...
			
			if(number == 1)
			makeObscure();
		
				if(number == 2)
					makeReadable();
				
					if(number == 3)
						printObscure();
				
						if(number == 4) 
							printReadable();
					
									if(number == 0)
										break;			// If user enters 0 then jump from the loop.
									System.out.println("Done!\n");			
									
						}else 	System.out.println("That is not an option.");		// If wrong number entered. Display error and redo theme.
		
							
						}			
							input.close();					// // If user enters 0 then jump from the loop, and bye bye. Also close scanner and exit.
							System.out.println("Bye, bye!")
							;System.exit(0);
		
	}
	
	// ----------------------------- Methods.
	
	public void makeObscure() {
		
			// Try to create file obscure.txt
		try {
		writer = new PrintWriter("D:\\Dropbox\\Skola\\Universitet\\DATATEKNIK\\JAVA - KOD\\1DV506 2020\\src\\mm223kk_lab4\\obscure.txt");
		}
		catch(FileNotFoundException  e ){	
			System.out.println("Error creating obscure-file."); // If fail.
		}
		
		
		for(int i = 0; i < text.size(); i++) {
		
		for(int x = 0; x < text.get(i).length(); x++) {
			
			char letter = text.get(i).charAt(x); // Copy each char of each sentence. from array of original file.
			letter += 3;						// Increase char-position by 3.
			
			writer.print(letter);				// Add each char in obscure.txt.
	
		}
		
		writer.println();						// Jump row when done obscuring each sentence.
		
		}
		
		writer.close();							// Close writer when done.	
		
}

	
	public void makeReadable() {
		
		
		try {
			// Scanner reading document location.
			inputFile = new Scanner(new File("D:\\Dropbox\\Skola\\Universitet\\DATATEKNIK\\JAVA - KOD\\1DV506 2020\\src\\mm223kk_lab4\\obscure.txt") );
			
			// While there is text lines in the text file do this...
			while(inputFile.hasNextLine()) {	
				textObscure.add(inputFile.nextLine()); // Save the sentence on text.
			}
			inputFile.close();	
			}
			// If error occurs.
			catch(FileNotFoundException  e ){	
		    System.out.println("The obscure file could not be found.");
		    System.exit(0);	
			}
		
		
		try {
			writer = new PrintWriter("D:\\Dropbox\\Skola\\Universitet\\DATATEKNIK\\JAVA - KOD\\1DV506 2020\\src\\mm223kk_lab4\\readableLovecraft.txt");
			}
			catch(FileNotFoundException  e ){	
				System.out.println("Error printing file.");
			}
			
			
			for(int i = 0; i < textObscure.size(); i++) {
				
			
			for(int x = 0; x < textObscure.get(i).length(); x++) {		//Copy each sentence from obscure charArray
				
				char letter = textObscure.get(i).charAt(x);				// Go thru each char and decrease it with 3 positions.
				letter -= 3;
				writer.print(letter);									// Print by char to readableLovecraft
				
		
			}
			writer.println();											// Jump when done with each sentence.
			
			}
			
			writer.close();												// Close writer when done.
	
	}
	

	public void printObscure() {
		try {
			// Scanner reading document location.
			inputFile = new Scanner(new File("D:\\Dropbox\\Skola\\Universitet\\DATATEKNIK\\JAVA - KOD\\1DV506 2020\\src\\mm223kk_lab4\\obscure.txt") );
			
			// While there is text lines in the text file do this...
			while(inputFile.hasNextLine()) {	
				System.out.println(inputFile.nextLine()); // Print each sentence from obscure.txt.
			}
			inputFile.close();	
			}
			// If error occurs.
			catch(FileNotFoundException  e ){	
		    System.out.println("The obscure file could not be found.");
		    System.exit(0);	
			}
	
	}

	public void printReadable() {
		try {
			// Scanner reading document location.
			inputFile = new Scanner(new File("D:\\Dropbox\\Skola\\Universitet\\DATATEKNIK\\JAVA - KOD\\1DV506 2020\\src\\mm223kk_lab4\\readableLovecraft.txt") );
			
			// While there is text lines in the text file do this...
			while(inputFile.hasNextLine()) {	
				System.out.println(inputFile.nextLine()); // Print each sentence from readable.txt.
			}
			inputFile.close();	
			}
			// If error occurs.
			catch(FileNotFoundException  e ){	
		    System.out.println("The readableLovecraft file could not be found.");
		    System.exit(0);	
			}
	
	}

}
