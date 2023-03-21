/*                   
	Resultatet på "whitespaces" blev inte exakt som det stod på uppgiften. 
	Antar att det beror på att rad hopp ignoreras. Då jag gör om  texten till en string.
	
	Elevmail: mmm223kk@student.lnu.se
			
	Namn: Sami Mwanje.  
			 																				*/


package mm223kk_lab4;

import java.util.Scanner;

import java.io.*;

public class RaknaTecken {

	public static void main(String[] args) {
		
	// Variabler för antal tecken senare.
				
	char a;

	int stora = 0; 
	
	int sma = 0;
	
	int space = 0;
	
	int ovriga = 0;
	
	// Filen finns på
		
	File read = new File("D:\\Dropbox\\Skola\\Universitet\\DATATEKNIK\\JAVA - KOD\\1DV506\\src\\mm223kk_lab4\\HistoryOfProgramming.txt");
		
	String text = "";
	
	
	// Läsning av film, om problem sker. "Filen kunde inte hittas".
	
	try {
	Scanner input = new Scanner(read);
	
	// För över textfilens innehåll till en lång string.
	
	while(input.hasNext()) {
		
	text += input.nextLine();	
		}
	input.close();
	}
	catch(Exception e ){
		
    System.out.println("The file could not be found");	
	
	}
	
	// Variablerna ökar då villkoren uppfylls.	
	for( int i = 0; i < text.length(); i++) {
		
	a = text.charAt(i);   
	
	if(text.charAt(i) == ' ') 
	space++;	
	else if(Character.isLowerCase(a)) 
	sma++;	
	else if(Character.isUpperCase(a))
	stora++;		
	else 
	ovriga ++;	
	}
	
	// Printar ut med nya variablerna.
	
	System.out.println("Antal stora bokstäver: " +stora);

	System.out.println("Antal små bokstäver: " +sma);
	
	System.out.println("Antal \"whitespaces\": " +space);	
	
	System.out.println("Antal övriga: " +ovriga);
	
	}
}
