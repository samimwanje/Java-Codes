/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 02/11/2022
 */
package mm223kk_assignment_3;

public class Problem_3_3_Insertsort {
	
	/**
	 * Function used to sort integer elements in an array.
	 * The method used here is called insert sort.
	 * @param arr - Array that will be sorted. Less sorted the better.
	 * @return	- Return sorted array.
	 */
	public int[] sort( int arr[]) {	
			
		for(int i = 1; i < arr.length; i++) {		// Loop through each index.
				int current = arr[i];
				for(int x = i-1; x >= 0; x--) {		// Start looping on the left part of current index.
					if(current < arr[x]) {			// Check if element on the left is less then current.
						int tmp = arr[x];		  	// Save element on the left.
						arr[x] = current;			// Set left-element position to current.
						arr[x+1] = tmp;				// Set current to the left element.
					}else
						break;						// Break if something current is not less then the left element.
					
				}
		}
		
		return arr;									// Return sorted array.
	}

	
}