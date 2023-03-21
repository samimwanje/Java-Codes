/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */

/*
 *This was a hard one... Got some ideas from the textbook Liang. 
 */
package mm223kk_assign3_6_SortingAlgorithms;

import java.util.Comparator;

public class SortingAlgorithms implements SortingAlgorithmsInterface {
	

	@Override
	public int[] insertionSort(int[] in) {
		
		
		if(in.length == 1)						// Check if the length of the array is 1
			return in;							// No sort in then needed.
	
	  
		 int tmp;  										// Create new temporary variable that holds the current number.
	    for(int i = 1; i < in.length; i++)   { 	
	    	for(int x = i;  x > 0; x--) {  			
	    		if(in[x] < in[x-1]) {							// Check if current value is less than the value before.
	    			tmp = in[x];								// If yes save current value in temp.
	    			in[x] = in[x-1];							// Current position is now the same value as previous position element.
	    			in[x-1] = tmp;								// Store temp at previous position index.
	    			
	    		}
	    	}
	    	
	    }
			
		return in;												// Return a sorted array.
		
	}
	
	

	@Override
	public String[] insertionSort(String[] in, Comparator<String> c) {
		
		
		
		if(in.length == 1)						// Check if the length of the array is 1
			return in;							// No sort in then needed.
			
			
			String tmp = "";  													// Create new temporary variable that holds the current number.
			 for(int i = 1; i < in.length; i++)   {  													// If yes save current value in temp.
				  	for(int x = i;  x > 0; x--) {  					
		    		if(c.compare(in[x].toLowerCase(), in[x-1].toLowerCase()) < 0) {							// Check if current value is less than the value before.	
		    			tmp = in[x];								// If yes save current value in temp.
		    			in[x] = in[x-1];							// Current position is now the same value as previous position element.
		    			in[x-1] = tmp;								// Store temp at previous position index.
		    		}
		    		
		    	}
		    	
		    }
				
			return in;															// Return a sorted array.
		
			}
}