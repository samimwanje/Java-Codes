/**
 * Author: Sami Mwanje
 * Mail:   mm223kk@stunde.lnu.se
 * Date:   2023-01-03
 */
package mm223kk_assignment_1;
public class Assignment_1_2_a {

	public static void main(String[] args) {
		String encryptedMes = "HKPUFCMHY BHDDXZH";						// String of encrypted message
		String alphabetString = "abcdefghijklmnopqrstuvwxyz";			// String of alphabet.	
		String cipherString = "XGPYHQZIRAJSBKTCLUDMVENWFO";				// String of the cipher.
		String decryptedMes = "";										// Result of decryption.
		
	
			for(int currChar : encryptedMes.toCharArray())					// Get the current encrypted message index char.
				for(int i = 0; i < cipherString.length(); i++) {			// Get the current cipher index char corresponding the encrypted message.
					if( currChar == ' ' ) {									// Check if current char is a space.
						decryptedMes += " ";								// Add a space on the result.
						break;												// Go to next char.
					}
						
					if(currChar == cipherString.charAt(i)) {				// Check if current char corresponds to the cipher-char.
						decryptedMes += alphabetString.charAt(i);			// Add current char to decryption message.
						break;												// Go to next char.
					}
				}
		System.out.println(decryptedMes);									// Print the result.
	}

}
