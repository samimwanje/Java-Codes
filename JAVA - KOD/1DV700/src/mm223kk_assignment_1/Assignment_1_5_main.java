/**
 * Author: Sami Mwanje
 * Mail:   mm223kk@stunde.lnu.se
 * Date:   2023-01-03
 */
package mm223kk_assignment_1;

public class Assignment_1_5_main {

	public static void main(String[] args) {
		String encryptedMesseage = "D cvqz ij xgpz rcvo oj rmdoz czmz";						// String of encrypted message
		int key = 0;
		while(true) {					// Get the current encrypted message index char.
	
			String answer = subDecryption(encryptedMesseage,  key);	
			System.out.println(answer +" "+key);
			if(key > 26 ) {
				break;
			}
			
			key++;	
		}

	}
	
	
	 private static String subDecryption(String encryptedMessage, long key) {
 	  String decryptedMessage = "";														// Initialize a the decrypted message.
 	  																				    // Iterate through each character in the plain text.
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
	   
			return decryptedMessage;		
 }

}
