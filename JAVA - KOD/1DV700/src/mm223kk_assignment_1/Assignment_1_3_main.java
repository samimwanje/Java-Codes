/**
 * Author: Sami Mwanje
 * Mail:   mm223kk@stunde.lnu.se
 * Date:   2023-01-03
 */
package mm223kk_assignment_1;
import java.util.Scanner;
public class Assignment_1_3_main {

			private static Substitution	  SubstitutionEncryption	= new Substitution();		// Get the Substitution encryption/decryption object.
			private static Transposition  TranspositionEncryption = new Transposition();		// Get the Transposition encryption/decryption object.

		    public static void main(String[] args)  {
		    
		    		runProgram();	// Start the program.
		    }
	
		    /**
		     * Function used to run the home menu for user.
		     */
		    public static void runProgram(){
		    	for(int i = 0; i < 50; i++) System.out.println("\n\n\n\n");// Clear menu.
		    	int number = homeMenu();  				// Show the home menu.
		    	if(number == 1) {						// Check used input.
		    		for(int i = 0; i < 50; i++) System.out.println("\n\n\n\n");// Clear menu.
		    		encryptMenu();						// Encryption menu.
		    	}else if(number == 2) {
		    		for(int i = 0; i < 50; i++) System.out.println("\n\n\n\n");	// Clear menu.
		    		decryptMenu();						// Decryption menu.
		    	}
		    	
		    }
		    
		    
		    /**
		     * Function for the home menu.
		     * @return number - return a value of the users choice.
		     */
			private static int  homeMenu() {
			    	System.out.println("*******************HOME-MENU*******************\n" +
		                       "*                                             *\n" +
		                       "*                                             *\n" +
		                       "*  Please select the task you want to perfom: *\n" +
		                       "*                                             *\n" +
		                       "*                1. ENCRYPT                   *\n" +
		                       "*                2. DECRYPT                   *\n" +
		                       "*                3. EXIT                      *\n" +
		                       "*                                             *\n" +
		                       "*                                             *\n" +
		                       "***********************************************\n");
			    	return inputMenu();
		    }
			
			/**
		     * Function used to control the user input.
		     * @return - returns the number.
		     */
		    @SuppressWarnings("resource")	// Scanner reused, crashes if it is closed 
			private static int inputMenu() {
		    		int number  = 0;														// What initialize
			    	while(true) {
			            try  {
			       
			            		Scanner input = new Scanner(System.in);						// Load scanner object.							
			            		System.out.print("Select task and press ENTER: ");
			                	number = input.nextInt();									// Ask user for 
			                	break;
			                	
			            } catch (NumberFormatException e) {
			            	    System.out.println("\nThe input was not valid\n");
			            	    System.out.print("Enter key and press ENTER: "); 
			            }
			        }
			        return number;	// Returns the choice in the menu.	
		    }
		    
		    /**
		     * Function for the decryption menu.
		     */
		    private static void decryptMenu() {
		    	System.out.println("*******************DECRYPT*********************\n" +
	                       "*                                             *\n" +
	                       "*                                             *\n" +
	                       "*  Please select the task you want to perfom: *\n" +
	                       "*                                             *\n" +
	                       "*         1. SUBSTITUTION  DECRYPTION         *\n" +
	                       "*         2. TRANSPOSITION DECRYPTION         *\n" +
	                       "*         3. BACK                             *\n" +
	                       "*                                             *\n" +
	                       "*                                             *\n" +
	                       "***********************************************\n");

		    	int number = inputMenu();	// Wait for the input from the user.
		    	if(number == 1)
		    		SubstitutionEncryption.subDecryption();	// Go to substitution decryption.
		    	else if(number == 2)
		    		TranspositionEncryption.transDecryption(); // Go to transposition decryption.
		    	else
		    		runProgram();
		    }
		    
		    /**
		     * Function for the encryption menu.
		     */
		    private static void encryptMenu() {
		    	System.out.println("*******************ENCRYPT*********************\n" +
	                       "*                                             *\n" +
	                       "*                                             *\n" +
	                       "*  Please select the task you want to perfom: *\n" +
	                       "*                                             *\n" +
	                       "*         1. SUBSTITUTION  ENCRYPTION         *\n" +
	                       "*         2. TRANSPOSITION ENCRYPTION         *\n" +
	                       "*         3. BACK                             *\n" +
	                       "*                                             *\n" +
	                       "*                                             *\n" +
	                       "***********************************************\n");
		    	
		    	int number = inputMenu();
		    	if(number == 1)
		    		SubstitutionEncryption.subEncryption();	// Go to substitution encryption.
		    	else if(number == 2)
		    		TranspositionEncryption.transEncryption();	// Go to transposition encryption.
		    	else
		    		runProgram();
			}
	
}
