/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */

package mm223kk_assign1_4_AbstractIntCollection;

public class ArrayIntList extends AbstractIntCollection implements IntList {

	@Override
	public void add(int n) {
			
		if(isEmpty()) {				// Check if array is empty.
		values[0] = n;				// If empty add at index 0.
		size++;}					//Increase size.
		else if(isEmpty() == false) {
		values[size] = n;			// else add at the size index.
		size ++; 
		if(size %  8 == 0 && !isEmpty()) // Check if resize is needed.
			resize();}
		
		
		
	}

	@Override
	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		
		
		if(!checkIndex(index,size)) 	// Check if index is in the array.
			throw new IndexOutOfBoundsException();
		else {
		int tmp[] = new int[values.length];				// Create temp array.
		
		
		for(int x = 0; x < index; x++)						// Copy all elements before index to temp.
		tmp[x] = values[x];		
		
		
		for(int i = index; i < size+1; i++)		//Copy all elements from index+1 to temp.
		tmp[i+1] = values[i];
		
		values = tmp;							// Set values to temp.

		values[index] = n;						// add value to the empty index.
		size++;									// Increase size.
		if(size %  8 == 0 && !isEmpty()) 		// Check if resize is needed.
			resize();}
		
	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
			
		if(!checkIndex(index,size))					// Check if index is valid.
			throw new IndexOutOfBoundsException();
		else {
		int tmp[] = new int[values.length];			// Create temp with size of current array.
		
		for(int x = 0; x < index; x++)				// Copy all elements expect to index-element.
		tmp[x] = values[x];							
		
		
		for(int x = index; x < size-1; x++)			// Copy all elements after index element.
		tmp[x] = values[x+1];
		
		values = tmp;								// Set current array to temp.
		size--;}									// Deacrease size.
	
	}

	

	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		if(!checkIndex(index,size)) // Check if index is in the array.
		throw new IndexOutOfBoundsException();
			
		return values[index];			// Return value on index.
	}

	@Override
	public int indexOf(int n) {
		
		
	for(int i = 0; i < values.length; i++) {			
		if(n == values[i]) {				 // Search for n in the array.
		return values[i];
			}	
				} 
		
		return -1;						 		// Return -1 if n is not found.
	}

	
}
