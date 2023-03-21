package problemC;

import java.util.Scanner; 			// Scanner used for input.
import java.math.BigInteger;		// BigInteger used for vary large numbers.

public class ProblemC {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);				// Waiting for input.
		
		while(input.hasNext()) {								// As long as the input contains a line. 
					
			String current = input.nextLine();
			
			BigInteger factorial = anagrams(BigInteger.valueOf(current.length())); 		// Transfer string length to big int, and count how many ways string can be rewritten using factorial.
			
			// Checks how many times a char appears in string. Result is factorialized and removed(divided) from previous created factorial number for whole string.
			for (char i = 'a'; i <= 'z'; i++)		
				factorial = factorial.divide(anagrams(countDuplicate(current , i)));			
			
			// Checks how many times a char appears in string. Result is factorialized and removed(divided) from previous created factorial number for whole string.
			for (char i = 'A'; i <= 'Z'; i++)
				factorial = factorial.divide(anagrams(countDuplicate(current , i)));			
			
			System.out.println(factorial);		// Print out 
		}

		
		
		input.close();		// Close scanner
		System.exit(0);		// Exit system.

}
	
	
	
/**
 * Function that runs the factorial function on a given number.
 * @param size - Receives a number that will be factorialized.
 * @return - Returns number of how many times a string with given chars can be re written.
 */
public static BigInteger anagrams(BigInteger size) {
	
	
		if (size == (BigInteger.ZERO))	// If factor function is 0.
		return BigInteger.ONE;			// Return 1. Also end recursive  function.
		else
		return size.multiply(anagrams(size.subtract(BigInteger.ONE))); // Continue multiplying counting, by running function recursively.
	
}


/**
 * Function used to check how unique a given char is in a string.
 * @param input - Current string from the input.
 * @param letter - Lower and upper case char checked for duplicate.
 * @return - Return number of duplicates in string.
 */
public static BigInteger countDuplicate(String input , char letter) {
	
	int duplicate = 0; 							// Value holding current duplicates.
	
	for (int i = 0; i < input.length(); i++) 	// For loop checks for duplicates.
		if (input.charAt(i) == letter)			// If char in string appears.
			duplicate++;						// Increase duplicate count.
	
	return BigInteger.valueOf(duplicate);		// Return number of duplicates. 1 is non.
}


}
