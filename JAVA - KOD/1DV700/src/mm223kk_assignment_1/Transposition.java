package mm223kk_assignment_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Transposition {
	    /**
	     * Function used to create transEncryption.
	     */
	    public void transEncryption() {
	    	
	    	Scanner input = new Scanner(System.in);								// Load scanner object.
	    	System.out.print("Enter plaintext path: ");							// Ask user for key.
			String path = input.nextLine();										// Set the path ( Where the file is located).	
	        String plaintext = "";												// Initialize plain text variable.
			int rows =  0;														// Generate a key.
			try {
	    		
				
			    File myObj = new File(path);
			    Scanner sc = new Scanner(myObj);
				while(sc.hasNextLine())											// Get data from file.
	    		    plaintext += sc.nextLine();        
	    		sc.close();
	    		
	    		
	    		System.out.print("Enter how many rows: ");					// Ask user for key.
	    		rows = generateKey(plaintext.length());
	    		
	    		
			} catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			}
	
	        int columns = (int)  Math.ceil((double) plaintext.length()/rows);	// Columns will be rows/key.
	        char[][] matrix = new char[rows][columns]; 							// Initialize a matrix-array with rows equal to the key and columns rows/key.  
	        int k = 0;															// Counter for current char in the plain text.
	        for (int row = 0; row <	rows; row++) {
	            for (int column = 0; column < columns; column++) {	
	            	if (k < plaintext.length())									// Check if done.
	            		matrix[row][column] = plaintext.charAt(k);				// Add all chars values in the plain text to the matrix.
	            	k++;	
	            	}
	        }
	        
	    	String encryptedMessage = "";										// Initialize a string  variable for  the encrypted message.
	        for (int column = 0; column < columns; column++) 
	        	for (int row = 0; row < rows; row++)
	        			encryptedMessage +=  matrix[row][column];			// Add column by column to encrypted message.	
   
	        try {			
				BufferedWriter writer = new BufferedWriter(new FileWriter(path,false)); 
				writer.append(encryptedMessage);	
				writer.close();
				
			} catch (IOException e) {
				e.printStackTrace();
		    }
	       
	        input.close();
	    }
	
	    /**
	     * Function used to decrypt transposition encryption.
	     */
	    public void transDecryption() {	
	    	Scanner input = new Scanner(System.in);										// Load scanner library.
	    	String encryptedMessage = "";												// Initialize a string  variable for  the encrypted message.
	    	System.out.print("Enter plaintext path: ");									// Ask user for key.
			String path = input.nextLine();												// Generate a key.	
    		int rows = 0;																// Initialize rows variable.																
		
			try {
				
			    File myObj = new File(path);
			    Scanner sc = new Scanner(myObj);
			    while (sc.hasNextLine())
		    		  encryptedMessage += sc.nextLine();	
	    		sc.close();
	    		
	    		System.out.print("Enter how many rows: ");									// Ask user for key.
	    		rows = generateKey(encryptedMessage.length());								// Get rows from user.
			} catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			}

			int columns = (int) Math.ceil((double) encryptedMessage.length()/rows);			// Columns will be message/key.
	        char[][] matrix = new char[rows][columns]; 										// Initialize a matrix-array with rows equal to the key and columns rows/key.  
	        int k = 0;																		// Counter for current char in the encryptedMessage text.
	        for (int column = 0; column < columns; column++) {								// Go here from column to column, which is reverse of the encryption.
	            for (int row = 0; row < rows; row++) {   									// Go through each row and add to matrix. Column.
	                matrix[row][column] = encryptedMessage.charAt(k);           			// Add all chars values from the encrypted message.
	                k++;    																// Increase k.
	            }
	        }
	        
	    	String decryptedMessage = "";													// Initialize the decrypted message
	    	for (int row = 0; row < rows; row++) 
	            for (int column = 0; column < columns; column++)							// Loop through the columns.
	                    decryptedMessage +=  matrix[row][column];      						// Add row by row to the decrypted message. 
	        
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
	    private int generateKey(int textLength) {
	    		Scanner input = new Scanner(System.in);										// Load scanner library.
	    	    int key = input.nextInt();
	    	    while (key > textLength) {
	    	      System.out.println("Error: rows must be less than text length.");				// Show what went wrong.
	    	      System.out.print("Enter a key for rows: ");									// Ask user for key.
	    	      key = input.nextInt(); 													// Ask for new key.
	    	    }		
	    	    input.close();
	    	    return key;																	// Return the key.
	    }

}
