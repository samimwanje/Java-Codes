package mm223kk_assignment_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Substitution {
	
	
    
    /**
     * Function used to create substitution encryption.
     */
    public void subEncryption() {
    		Scanner input = new Scanner(System.in);
	    	System.out.print("Enter plaintext path: ");							// For path of file, can for example be "./encryption.txt"
    		String path = input.nextLine();										// Generate a key.	
	        String plaintext = "";												//  Initialize plain text variable.
    		int key =  0;														// Generate a key.		
    		try {
	    		System.out.print("Enter a key max 2^8 bits: ");					// Ask user for key.
	    		key = generateKey();											// Generate max 256 bit key.					
    		    File myObj = new File(path);
    		    Scanner sc = new Scanner(myObj);
    
	    		while(sc.hasNextLine())											// Get data from file.
	    		    plaintext += sc.nextLine()+"\n";

	    		sc.close();
	    		
    		} catch (FileNotFoundException e) {
    		      System.out.println("An error occurred.");
    		      e.printStackTrace();
    		}
    		
    		String encryptedMessage = "";												//Initialize a string  variable for  the encrypted message.    
	        // Iterate through each character in the plain text.
	        for (int i = 0; i < plaintext.length(); i++) {
	            char letter = plaintext.charAt(i);	 									// Get the current character from the plain text.
	            if(!Character.isLetter(letter)) {														// Makes sure the the encrypted message is kept original.
	            	encryptedMessage += letter;											// Add space to the encrypted message.
	            	continue;															// Goes to the next char in the plain text.
	            }
	            
	          	char encryptedChar;																// Initialize encrypted char.
				if (Character.isUpperCase(letter))
					encryptedChar = (char) ((((letter - 'A' + key) % 26) + 26) % 26 + 'A'); 	// Calculate the encrypted character if it is upper case.
				else 
					encryptedChar =  (char) ((((letter - 'a' + key) % 26) + 26) % 26 + 'a'); 	// Calculate the encrypted character if it is lower case.
				
		        encryptedMessage += (encryptedChar);											// Add the encrypted character to the encrypted message.  
	        }
	        
		 	try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(path,false)); 
				writer.append(encryptedMessage);												// Append to the ecnryption file.
				writer.close();
				
			} catch (IOException e) {
				e.printStackTrace();
		    }
		 	
		 	input.close();	// Close scanner.
    }

    
	  
    /**
     * Function used to create substitution decryption.
     */
    public void subDecryption() {
    	Scanner input = new Scanner(System.in);
    	String encryptedMessage = "";										//Initialize a string  variable for  the encrypted message.
    	System.out.print("Enter plaintext path: ");							// Ask user for path that will be decrypted, example ./encryption.txt
		String path = input.nextLine();										
		int key =  0;														// Initialize key integer.
		try {
			
    		System.out.print("Enter a key max 2^8 bits: ");					// Ask user for a max 2^8 bit key.
    		key = generateKey();	
		    File myObj = new File(path);
		    Scanner sc = new Scanner(myObj);
		    
    		while(sc.hasNextLine())
    			encryptedMessage += sc.nextLine()+"\n";						// Read data from file, and assign to encrypted message variable.
    		
    		sc.close();
    		
		} catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	
    		String decryptedMessage = "";	// Initialize a the decrypted message.
    	  	// Iterate through each character in the plain text.
	        for (int i = 0; i < encryptedMessage.length(); i++) {
	            char letter = encryptedMessage.charAt(i);	 							// Get the current character from the plain text.
	            if(!Character.isLetter(letter)) {														// Makes sure the the encrypted message is kept original.
	            	decryptedMessage += letter;											// Add space to the encrypted message.
	            	continue;															// Goes to the next char in the plain text.
	            }           
	            char decryptedChar;														// Initialize encrypted char.
				if (Character.isUpperCase(letter))										// Check if lower or upper case before encryption.
					decryptedChar = (char) ((((letter - 'A' - key) % 26) + 26) % 26 + 'A');
				else 
					decryptedChar = (char) ((((letter - 'a' - key) % 26) + 26) % 26 + 'a');
				
				decryptedMessage += decryptedChar;									// Add the encrypted character to the encrypted message.  
	        }

		 	try {
			
				BufferedWriter writer = new BufferedWriter(new FileWriter(path,false)); 
				writer.append(decryptedMessage);											// Append the latest result to the decryption file.
				writer.close();
				
			} catch (IOException e) {
				e.printStackTrace();
		    }
		 	input.close();
    }
	
	
	
    /**
     * Function used to generate the key, and checks if
     *  the key is in the range of the maximum size.
     * @return
     */
    private int generateKey() {
    		Scanner input = new Scanner(System.in);									// Load scanner library.
    	    int key = input.nextInt();
    	    while (key > (256)) {	// Check if key is larger than 256 bits.
    	      System.out.println("Error: Key can only be max 2^8 bits in size.");	// Show what went wrong.	
    	      System.out.print("Enter new key: ");	// Show what went wrong.	
    	      key = input.nextInt(); 												// Ask for new key.
    	    }		
    	    input.close();
    	    return key;																// Return the key.
    }
	
	
	

}
