/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign1_4_AbstractIntCollection;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {

	
	@Override
	public void push(int n) {	
		
		int tmp [] = new int[values.length];			// Create a temp array.		
													
		for(int x = 0; x < values.length-1; x++ ) 		// Move elements one index to the right.
			tmp[x+1] = values[x];
			
		values = tmp;									// Arrray is now temp.	
		values[0] = n;									// Set top elements to element adaded.
		size++;											// Increase size.
		if(size %  8 == 0 && !isEmpty())				// Check if resize is needed
		resize();
	
	}

	@Override
	public int pop() {
		
	if(isEmpty()) // Check if array is empty.
	throw new IndexOutOfBoundsException("Error stack is empty.");
	else {
	
	int top = values[0];					// Save top element.
	
	
	int tmp [] = new int[values.length];	// Create a temp array.
	
	for(int x = 0; x < values.length-1; x++) {		
	tmp[x] = values[x+1];							// Move all elements one index to the left.
	}
	
	values = tmp;									// Current array is now temp.
	size--;											// Deacrase size.
		return top;}								// Return top previously-element.
	}
	
	

	@Override
	public int peek() throws IndexOutOfBoundsException {
		if(isEmpty()) // Check if array is empty.
		throw new IndexOutOfBoundsException("Error stack is empty.");
		return values[0]; // Rreturn the top element.
	}

}