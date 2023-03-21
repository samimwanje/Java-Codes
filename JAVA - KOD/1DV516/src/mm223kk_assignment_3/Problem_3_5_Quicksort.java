/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 09/11/2022
 */
package mm223kk_assignment_3;

public class Problem_3_5_Quicksort {
	 private int arr[];
	 public int depth;

	/**
	 * Function used to prepare an array for sorting.
	 * Calls the function "partitionSort" with lower index = 0, and higher index = (array-length - 1).
	 * @param arr - Array that will be sorted.
	 * @return	- Return sorted array.
	 */
	public int[] sort(int unsorted[], int maxDepth) {
		arr = unsorted;
		if(maxDepth < 10 || unsorted.length > 5000) {	// 5000 since this was measured in the experiment.
			partitionSort(0, unsorted.length-1, 0);	// Partition the array for the the first time.
			return arr;
		}else {
			return new Problem_3_3_Insertsort().sort(arr);		// Insert sort.
		}
	}
	
	/**
	 * This function is used to recursively sort a, left and a right part of an array.
	 * It uses a so called "pivot-value", which,splits the array in two parts.
	 * Each split will be better sorted, until finally there are no partitions left to sort.
	 * @param unsorted 
	 * @param lower - The lower part (start index) of the partitioned array.
	 * @param higher - The higher part (last index) of the partitioned array.
	 */
	private void partitionSort(int lower, int higher, int depth){	
		depth++;											// Increase the depth;
		
		if( lower >= higher ) {  							// Check if all elements are sorted. Which means we only have partitions of 1.
			this.depth = depth;								// Set the depth.
			return;											// Return null.
		}
		
		int pivotIndex = partition(lower, higher);			// Receive the index of the current pivot element.
		partitionSort(pivotIndex+1, higher, depth);			// Recursively sort the right part, using pivotIndex+1 to higher.
		partitionSort(lower, pivotIndex-1, depth);			// Recursively sort the left part, using lower to pivotIndex-1.

	}


	/**
	 * This function is used to find the pivot index.
	 * It uses the median of three values to determine it.
	 * @param arr - Partition of array that contains a pivot.
	 * @return	- Returns the pivot element as an integer.
	 */
	private void rearrangeMid(int lower, int higher) {
		
		int mid = (lower+higher)/2;
		
		if( lower > mid)				// Check if lower index is larger than mid index.
			swap( lower, mid );			// Swap lower with mid.
		
		if( lower > higher)				// Check if lower index is larger than higher index.
			swap(lower, higher);		// Swap lower with higher.
		
		if(mid > higher)				// Check if mid index is larger than higher index.
			swap(mid, higher);			// Swap mid with higher.
		
		 swap( mid, higher);			// Move higher to the last index.
	}
	
	/**
	 * This function is used for swapping two elements in the array.
	 * @param a - index of element 1.
	 * @param b	- index of element 2.
	 */
	private void swap(int a, int b) {
		int tmp = arr[a];	// Save element 1 as temp.
		arr[a] = arr[b];	// Replace index of element 1 with element 2.
		arr[b] = tmp;		// Replace element 2 with temp.
	}
		
	
	
	/**
	 * This function is used to partly partition the array and return a pivot index.
	 * It moves all the elements that are less than the pivot-element, to the left, and all the element that are larger then the pivot-element,
	 * to the right. After the elements are sorted around the pivot-element. The new index of the,pivot element is returned.
	 * @param Lower	- The lower index bound.
	 * @return Higher - the higher index bound.
	 * @return	- Index of pivot element after sort and re arrange.
	 */
	private int partition(int lower, int higher) {

		 depth++;
		 rearrangeMid(lower, higher);		// Get the "median of three pivots", also move pivot to max.
		 int pivotIndex = higher;			// Save the first and last index.	
		 higher--;							// Jump away from the pivot value index.
		
		 while(true){

			 while(arr[lower] < arr[pivotIndex] && lower <= higher ) 		// While current element is lower then pivot, and not equal to pivot.
					lower++;
			 		
			 while(arr[higher] > arr[pivotIndex] && higher > lower ) 		// While current element is larger then pivot, and not equal to pivot.
				 	higher--;	
			 
			 if(lower >= higher) 				// If higher and lower pointers have passed each other or are the same.
				 break;
	
			swap( lower, higher);
			lower++;							// Jump to next right index when done.				
			higher--;	 						// Jump to next left index when done.		 
		 }
		 
		 swap( lower, pivotIndex);					// Change the pivotIndex to lower.
		 return lower;								// Return the index of the pivot element.
	}
	
}