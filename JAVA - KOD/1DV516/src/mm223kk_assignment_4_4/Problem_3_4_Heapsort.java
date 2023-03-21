/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 02/11/2022
 */
package mm223kk_assignment_4_4;

public class Problem_3_4_Heapsort { 
	
	private int heap[];	// 1-indexed array that will be sorted.
	private int size;		// Local size. Needed since we are using 1-indexing
	
	/**
	 * Function used to sort an array by descending order.
	 * @param arr - The array that will be sorted.
	 */
	public int[] sort(int arr[]){
		
		size = arr.length;						// Subtracts 1 to the local size variable, since we are using 1 indexing.
		heap = new int[size+1];					// prepare a heap with size of arr + 1.
		
		for(int i = 1; i < size+1; i++) { 		// Add all the values from arr[i] to heap[i+1].
			add(i, arr[i-1]);					// Add 
			swim(i);							// Make sure that the heap condition is satisfied for current value. Swim up if at wrong place.
		}
		
		reArrange();							// Start heap sorting by sinking (MinHeap).
		return heap;							// Return the sorted array.
	}
	
	/**
	 * Function used to rearrange the heap array.
	 * It sinks the "nodes" until the min-heap condition has been fulfilled.
	 */
	private void reArrange(){
		while( size > 1)		
			 delMax();		// Shift the root to last element until done.
	}
	
	
	/** 
	 * Function used to delete and return the max value from the,
	 * binary heap tree. In this case it is used to shift the element,
	 * on the root with the last element.
	 * @return 
	 * @return - Returns the max value.
	 */
	private void delMax() {

		if (size > 0) {
	
			int currentMax = heap[1];			// Tmp for current max (Root).
			int currentLast = heap[size];		// Tmp for current last.
			heap[1] = currentLast;				// Move last to root.
			heap[size]= currentMax;				// Move root to last place.
			size --; 							// Decrease the size.			
			sink(1);							// Move the new root to the right place, by "sinking" it.
			
		//	heap[size +1 ] = 0;					// The new last element to 0 (null). 
			
		}

	} 
	
	/**
	 * Function used to sink the root element to the right position.
	 * This is normally done after a delete max has been called.
	 * @param k - The index of the element that will be "sinked".
	 */
	private void sink(int k) {
		
		while( 2 * k <= size ) {							// While we can traverse in the tree..
			
			int index = 2*k;									// Set index value to left children.
			if(index < size && heap[index] < heap[index+1])		// Check if less than right children.
				index++;										// Set next index. ( Right ) if larger.
					
			if( heap[k] > heap[index] )				// Check if we are done. If parent is larger than largest children.
				break;
					
			int currentParent = heap[k];			// Tmp for current parent.
			int largerChildren = heap[index];		// Tmp for the larger children.
			heap[k] = largerChildren;				// Move current parent to larger children position.
			heap[index]= currentParent;				// Move current larger children to parent position.
			
			k = index;								// Change k to the newly largest children.
		}
	}


	/**
	 * Function used to add all the element in a heap array,
	 * this array is nor max or minimum heap. The elements will be sorted,
	 * as they are inserted.
	 * @param k - Index of current element.
	 * @param key - Value of current element.
	 */
	private void  add(int k, int key ) {

		if(k >= heap.length)	// Check if index k is too large.
			expandHeap();		// Expand the size of the heap.
		
		if(heap[k] == 0) {		// Check of current position is empty.
			heap[k] = key;		// Set the key to current position.
			
		}else {
			
			if(key < heap[k])	// Check if current value should go left or right.
				add(2*k ,key);	// Go to left.
			else	
				add(2*k+1 ,key); // Go to right.
		}
	}
 

	/**
	 * Function used to rearrange the heap array, 
	 * so that it fulfills the max heap condition.
	 * The node k will swim up until the condition is satisfied.
	 */
	private void  swim(int k) {
		while(k > 1 && ( heap[k/2] < heap[k]) ) { 	// K is larger than 1, and While the parent is less the the current children k.
				
			int currentP = heap[k/2];	// Save the current parent.
			int currentC = heap[k];		// Save the current children.
			
			heap[k] = currentP;			// Move down current parent.
			heap[k/2] = currentC;		// Move up current children to parent.
			
			k /= 2;						// Change value of k to the newly changed parent.
		}
	}
	
	/**
	 * Used to expand the size of the heap if needed.
	 */
	private void  expandHeap(){
		
		int heapOld[] = heap;	
		heap = new int[heap.length*2];					// prepare a heap with size of arr + 1.	
		for(int i = 0; i < heapOld.length; i++) 		// Add all the values from arr[i] to heap[i+1].
			heap[i] = heapOld[i];	
	}
	
}