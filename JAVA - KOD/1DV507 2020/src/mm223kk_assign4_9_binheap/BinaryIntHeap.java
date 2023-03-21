package mm223kk_assign4_9_binheap;


public class BinaryIntHeap implements BinaryIntHeapInterface{
	
	private int[] heapArray; 		// Array holding elements.
	private int size;				// Size of heap.
	
	
	public BinaryIntHeap() {
		
	heapArray = new int[8];		// Create new array with length 8.
	size = 0;				// Set size to 0.
		
	}

	@Override
	public void insert(int n) {
		
		
		if( size == 0) {									// Check if heap is empty.
			heapArray[0] = n;								// If empty add on top.
			size++;											// Increase size.
		}else if(size > 0) {
			
			
			int tmp[] = new int[heapArray.length];			// Create an array to hold all the elements.
			for(int x = 0; x < heapArray.length-1; x++ ) {	
				tmp[x+1] = heapArray[x];					// Move all elements to the right. Ignore the first position.
			}	
			
			tmp[0] = n;										// Add new element;
			heapArray = tmp;								// Return reconstructed array.		
			size++;											// Increase size.
			sortHeap(heapArray);							// Sort the array.
			if(size % 8 == 0)								// Check if resize is needed.
			resize();
			}
	
		}
	
	
	
	private void resize() {										// Resize the array.

		int tmp [] = new int[heapArray.length*2];
			
		for(int x = 0; x <heapArray.length; x++ )
		tmp[x] = heapArray[x];
		
		heapArray = tmp;
		
		System.out.print("Size");
		
	}

	
	// Used to sort the elements in the array.
	private void sortHeap(int[] in) {
		
		
		if(in.length <= 1)						// Check if the length of the array is 1
			heapArray =  in;					// No sort in then needed.
		else {
		 int tmp;  										// Create new temporary variable that holds the current number.
	    for(int i = 1; i < size; i++)   { 				// Sort the part with elements.
	    	for(int x = i;  x > 0; x--) {  			
	    		if(in[x] > in[x-1]) {							// Check if current value is less than the value before.
	    			tmp = in[x];								// If yes save current value in temp.
	    			in[x] = in[x-1];							// Current position is now the same value as previous position element.
	    			in[x-1] = tmp;								// Store temp at previous position index.
	    			
	    		}
	    	}
	    	
	    }
	    
	    heapArray = in;		}									// Return a sorted array.
		
	}
	


	@Override
	public int pullHighest() {
		
		if(size == 0) {
			throw new IllegalArgumentException("Heap is empty.");}
		else if(size == 1){ 
		size--;
		return 	heapArray[0];
		}
		else {
		
		int top = heapArray[0];									// Save the top.
		
		int[] tmp = new int[heapArray.length];				// 	Create temp array.
		
		for(int x = 1; x < heapArray.length; x++)			// Move elements to the left.
		tmp[x-1] = heapArray[x];
		
		heapArray = tmp;									// Set temp array to current array.
		size--;												// Deacrase size.
		
		return top;	}	
		}									// Return the saved top-element.
	

	@Override
	public int size() {
		
		return size;										// Return the size of the heap.
	}

	@Override
	public boolean isEmpyty() {
		
		return size == 0;									// Check if heap is empty.
	}
	
	
	
	
}
