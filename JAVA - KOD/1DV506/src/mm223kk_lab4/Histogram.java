/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */

package mm223kk_lab4;
	

	import java.util.Scanner;

	import java.util.ArrayList;

	import java.io.*;

	public class Histogram {
	
	public static void main(String[] args) {
		
	// Variabler för utprinting senare.
				
	int a = 0;
	
	int b = 0;
	
	int stars = 0;
			
	ArrayList<Integer> textArray = new ArrayList<Integer>();
	
	Scanner text = null;
	
	// Försöker läsa in filen.
	
	try {
		
		File read = new File( args[0] );
		
		System.out.println("Läser heltal från filen: " +read.getPath());
		text = new Scanner(read);

		}	
		catch(Exception e) {
		System.out.println("File was not found.");
		}
	
		// Skapar en array med siffrorna i textfilen.

		while(text.hasNext()) {
			
		textArray.add(text.nextInt());

	}
	
		text.close();
	
		// Variabler som ökar för siffror i intervallet, och siffror som ej tillhör intervallet.
	
		for(int i = 0; i < textArray.size(); i++) {
			
		if(textArray.get(i) >= 1 && textArray.get(i)  <= 100) 
		a ++;	
		else
		b++;
		
		}
	
		System.out.println("Antal heltal i intervallet [1,100]: " +a +"\nÖvriga: " +b);
			
		System.out.println("Histogram");
			
		for(int i = 0; i <= 9; i++ ) {
						
		// Jämnar upp och skapar printouten.
		if(i == 0)
		System.out.print(10*i+1+" ");
		else
		System.out.print(10*i+1);
		
		System.out.print(" - "+(i+1)*10);
				
		if(i == 9)
		System.out.print("| ");
		else
		System.out.print(" | ");
		
		// Kontrollerar om talet ingår i intervallet. Stars ökar då med 1.
		
		for(int y = 0 ; y < textArray.size(); y++) {
			
		if(textArray.get(y) >= (10*i+1) && textArray.get(y) <=  (i+1)*10 ) {	
		stars++;
		}
		
		}
		
		// Printar ut antal tal i intervallet med "*".
		
		for(int x = 0; x < stars; x++) {
	
		System.out.print("*");		
		}
		
		stars = 0;
		System.out.println();	
	
		}
		

	}
}