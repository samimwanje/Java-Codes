/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 23/10/2022
 */
package mm223kk_assignment_3;


public class Problem_3_1_Quadratic {
	
	private Object[] hashTable;		// The hash table.
	private int size;				// Current items in the hash table.
	private int primeIndex;			// The size of the hash table, a prime number.
	private long collisions;			// Variable that counts how many collisions that have occurred.
	private long quadIterations;
	
	/**
	 * Constructor used to set up the hash table,
	 */
	public Problem_3_1_Quadratic(){
		primeIndex  = 53; 						// Start 67 as prime number and available elements.
		size = 0;								// Set size to 0
		collisions = 0;							// Set collisions to 0.
		quadIterations = 0;						// Count the number of "collision-iterations" before a place was found.
		hashTable = new Object[primeIndex];		// Create new empty hash Table with 67 elements.
	}
	
	/*
	 * Function used to return and reset amount of collisions that have occurred.
	 * This function does not have much to do with the hash table. It is mostly,
	 * for analyzing Problem_3_2.
	 *  @return -  collisions value is returned after reset.
	 */
	public long collisions() {
		long tmpCol = collisions;
		collisions = 0;	
		return tmpCol;
	}
	/**
	 * Function used to count the number of quad "collision-iterations" before an empty place was found.
	 * The quadIterations value is reseted when this function is called.
	 * This function does not have much to do with the hash table. It is mostly,
	 * for analyzing Problem_3_2.
	 * @return - quadIterations value is returned after reset.
	 */
	public long quadIterations() {
		long tmpQuadIt = quadIterations;
		quadIterations = 0;	
		return tmpQuadIt;
	}
	
	
	/**
	 * Function used to hash and insert key to hashed index.
	 * @param key - String from user.
	 */
	public void insert(Object key) {
		
		//"Rule of thumb, α = n / m ∼ 1 / 2". 1/2 % seemed to work best so I chose that.
		if(size >= (primeIndex*7/10)){			// This value is changed through the analyze.					

			nextPrime();									// Update size and current prime.
			Object[] tmphashTable = new Object[primeIndex];	// Save all current elements.
			for(int i = 0; i < hashTable.length; i ++) 		// Save all current elements to new array.
				if(hashTable[i] != null) 				
					tmphashTable[hashCode(hashTable[i])] =  hashTable[i];	// Rehash with new size.
		
			hashTable = tmphashTable;							// Replace previous hash table with larger table.
		}
		
		int hashCode = hashCode(key);							// Get a hash code of current key.
		
		if(hashTable[hashCode] == null ) {						// Check if current hashCode-index is empty.
			hashTable[hashCode] = key;							// Return the generated hash code.
		
		}else {
			quadIterations++;									// Increase the quadIterations variable.
			collisions ++;										// Increase the collision variable.
			hashTable[hashQuadratic(hashCode)] = key;			// Generate 
		}
		size++;													// Increase the size.
	}
	
	/**
	 * Function used to create a hashCode
	 * @param key - String object that user is going to hash.
	 * @return	- Returns an Int, which is the empty hashed index.
	 */
	private int hashQuadratic(int hashCode) {
	
				int quad = 1;											// Set quad to 2
				while( true ) {											// Loop through while loop until empty hashCode is found.
					hashCode = (hashCode + (quad*quad) ) % primeIndex;
					if(hashTable[hashCode] == null) 					// Try to see if current place is empty.	
						return hashCode;										// Break through the while loop.
					else {
						quad++;
						quadIterations++;									// Increase the quadIterations variable.
					}
				}
				
	}
	
	/**
	 * Function used to find and set the next prime number,
	 * The prime number will be used for the size of the 
	 * hashTable. This function will be called once 70 %,
	 *  of the table is filled.
	 */
	private void nextPrime() {
		
		primeIndex *= 2;			 // Double the current prime number. (Size).
		while(true) {			 // Start a while loop until next prime number is found.
			
				int divisible = 0; // Counts how many numbers i can be divided with.
				for(int i = 2; i <= primeIndex/2; i++ )  	// Start from 2 to prime/2.
					if( (primeIndex % i) == 0)	// If current prime number is divisible with i 
						divisible++; // Increase divisible count.
				
				if(divisible == 0)		// When done check how many divisible.
					break;				// End while loop if none where divisible.
				else 
					primeIndex++;		// Else go to the next upcoming number.
				
		}

	}
	
	/**
	 * This function is used to create a,
	 * hash code from a string. It converts chars
	 * to int, sum up a number and returns the,
	 * hashed code.
	 * @param hashTable2
	 * @return
	 */
	private int hashCode(Object key) {
		
		int	hashCode = key.hashCode();
		return (Math.abs(hashCode)  % primeIndex); // Converts absolute value of hash code to an index in array with modulo.	
	}
	
	/**
	 * Function used to check if hash table contains string.
	 * @param str - The string that will be checked.
	 * @return	- Returns true if the string was found.
	 */
	public boolean find(Object key) {
		
			int hashCode = hashCode(key);	
			int quad = 0;					// Set quad to 2
			while( true ) {	// Loop through while loop until empty hashCode is found.
				
				hashCode = (hashCode + (quad*quad) ) % primeIndex;
				if(hashTable[hashCode] == null) 							// Try to see if current place is empty.	
					return false;										// Break through the while loop.
				else if(hashTable[hashCode] == key)						// Check if key was found.
					return true;
				else
					quad++;												// Go to next quad.
			}		
	}
	
	
	/**
	 * This function is used for viewing a snippet of the hashTable.
	 */
	public void print() {
	
		System.out.print("[ ");
		for(int i = 0; i < hashTable.length; i++)
			if(hashTable[i] != null)
				System.out.print(hashTable[i] +", ");
		System.out.println(" ]");
	}
	
	public void delete(Object key) {
		
		int index = getIndex(key);		// Get the index of the key in table.
		
		if(index != -1) {				// Check if string-object exist.
			hashTable[index] = null;		// Set index key-value to null.
			size --;						// Decrease size.
			
		}else 
			throw new NullPointerException(key+" is not in hash table.");
	}
	
	/**
	 * Function used to find the index value,
	 * of a key.
	 * @param str - Key that will be found.
	 * @return	- Returns the key-index (hasCode) as int.
	 */
	private int getIndex(Object key) {
		
		int hashCode = hashCode(key);	
		int quad = 0;					// Set quad to 2
		while( true ) {	// Loop through while loop until empty hashCode is found.
			
			hashCode = (hashCode + (quad*quad) ) % primeIndex;
			if(hashTable[hashCode] == null) 							// Try to see if current place is empty.	
				return -1;												// Returns -1 if key does not exist.
			else if(hashTable[hashCode] == key)							// Check if key was found.
				return hashCode;										// Returns the hashCode.
			else
				quad++;													// Go to next quad.
		}		
	}
	
}
