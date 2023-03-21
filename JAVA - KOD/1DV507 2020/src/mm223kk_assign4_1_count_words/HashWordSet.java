
/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign4_1_count_words;

import java.util.Iterator;

public class HashWordSet implements WordSet {
	
	private Word[] wordsArray = new Word[8];																// Used to hold the Word objects.
	private String toString = "{";																			// Used to convert containing elements to string.
	private int size = 0;																					// Elements in array.
	private int hash = 0;																					// Used for every element hash.																				//Used for finding empty index.							
	private int currentHash;																				// Used when checking if the array contains the data.( word ).
	private double loadfactor;																				// Used to calculate if the "bucket" should be expanded.
	
	@Override
	public void add(Word word) {
		
		
		loadfactor =  ( size/((double)wordsArray.length) );																	// Create new Load-factor that checks if size/array.length < 1;
		if(loadfactor >= 1)																									// Check if reHash is needed...														
			reHash();																										// If needed reHash... Make array bigger and reposition.
		
			
			hashCodeGen(word.toString(), wordsArray.length);																// Create hashCode for string.
			

			if(wordsArray[hash] == null) {																					// If the index is is clear. We can add the element.
				wordsArray[hash] = word;  																					// Add element
					size++; 																								// Increase size.
						toString += word +", ";																				// Generate string.
					} else  if( contains(word) == false ) {																	// Check if current position is used.					
							wordsArray[ collisionHanlder(hash, wordsArray) ] = word;
																			size++;	 
																				toString += word +", ";}	 
		
																							}
																																																					
				 
																															
	@Override
	public boolean contains(Word word) {
		
	
		while(true){
					
			
			if(wordsArray[currentHash] != null )											// Check Word already exist in array, if hash is known.
				if(wordsArray[currentHash].toString().equals( word.toString() ))
					return true;	// Return true if exist, else false.
				
						
			if(currentHash == wordsArray.length-1)																					// Check if we are on the last index.
				currentHash = 0;																									// If we are set to the first index.
					
			currentHash++;																									// Increase to next index.
			
			if(currentHash == hash)																									// If we have checked the entire array break and return false.
			break;
			}
		
									return false; 	// Return true if exist, else false.
									
}

	
	
	private int collisionHanlder(int position, Word[] array) {
			
			
				if(position == array.length-1) 																					// Check if we are at the last index in the array.
					position = 0;																								// If yes set index to 0.
			
				// Add Word to empty index, and jump out of loop.
						while(array[position] != null) {																		// Search for a empty place for the data. (Until we find null.				
									
							position++;																							// Increase to next index.																			
								if(position == array.length-1 && array[position] != null) 										// If we are on the last position. Restart to first.
									position = 0;		
								 
						}		
									
		return position;
		
	}
	
	

	private void hashCodeGen(String s, int arrayLength) {
																															// Reset HashCode.
		hash = 0;
		s = s.toLowerCase();
		for(int i = 0; i < s.length(); i++) 																				// Set a hash code based on the array size and char-num.
			hash = ( 31 * this.hash + s.charAt(i) ) % arrayLength; 	
			currentHash = hash;																								// Set current hash variable to the new.
			}


	
	private void reHash() {																									// ReHash() class 
		
		Word[] tmp = new Word[2*wordsArray.length];	
		
		for(int i = 0; i < wordsArray.length; i++) {	
			if(wordsArray[i] != null) {				
				hashCodeGen(wordsArray[i].toString().toLowerCase(),tmp.length);												// Create a new hashCode for current element.
					
								if(tmp[hash] == null) {
										tmp[hash] = wordsArray[i];}															// Insert element in new array.
										else {	tmp[collisionHanlder(hash, tmp)] = wordsArray[i];  ;} } }
		
		wordsArray = tmp; } 																								// Use new Re-Hashed array.
	

	@Override
	public int size() {
		return size;																										// Return amount of elements in the array.
	}

		
	 public String toString() {
		 																				 	 
		 toString += "}";																									// Surround with , and { }.
		 
		 return toString;																									// Return string 
	 }



	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Iterator iterator() {
		
		return new hashIterator();
	}
	
	
	 @SuppressWarnings("rawtypes")
	private class hashIterator implements Iterator {
	
		 
	private String[] iteratorArray; 								// Create a iterator for the hash set.
	private int currentIndex = 0;									// Current index.
		 
	public hashIterator(){
	iteratorArray =  toString.split("[{,} ]+");	}				// Fix array for hashSet iterator.}
		

	@Override
	public boolean hasNext() {

		if(currentIndex != size)								// Check if this is the last element.
		return true;
		else 
		return false;											// If no return false.
	
	}

	@Override
	public String next() {
		return iteratorArray[currentIndex++];					// Return string from current index.
	}
	
	
	}
	
	
	
}
	
	

