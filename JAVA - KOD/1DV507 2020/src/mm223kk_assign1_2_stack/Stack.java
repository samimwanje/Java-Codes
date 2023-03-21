package mm223kk_assign1_2_stack;

/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 23/08/2020
 */


public class Stack implements StringStack{

	private int size = 0;
	
	private String array[];
	
	//private String element;
	
	@Override
	public int size() {
		return size;				// Return the size of the stack.
	}

	@Override
	public boolean isEmpty() {
		
		return size == 0; 			//Check if array is empty.
	}

	@Override
	public void push(String element) {
		if(size == 0) { array = new String[1];			// Create array with size 1 if array is empty.
		array[0] = element;								// Push in first element.
		size ++;										// Increase variable size.
		
		}
		else {
			
		String arrayCopy[] = new String[array.length+1];	// Create are with one more space.
		
		arrayCopy[0] = element;								// Add the new element
		
		for(int x = 0; x < arrayCopy.length-1; x++) {		// Move all elements to the right.
			arrayCopy[x+1] = array[x];
			
		}
		array = arrayCopy;								// Set array to the newly constructed.
		size ++;										// Increase size.
		}
	}

	@Override
	public String pop() {
		if(size != 0) {						// Cheack array is empty.
		String poped = array[0];			// Save first element.	
		
		String arrayCopy[] = new String[array.length-1];			// Deacrease size of array.
		// Did this task for quite some time ago. I have realised that there are faster approaches when
		// it comes to the size of the array.
		// It's better to resize only when needed.
		for(int x = 0; x < arrayCopy.length; x++) {		
			arrayCopy[x] = array[x+1]; 
		}
		
		array = arrayCopy;		// Set to newly constructed array.
		size --;				// Decrease size.
		return  poped;
		}
		else {
		throw new IllegalStateException("Array is empty!");			// If empty.
		}
		
	}
	
	
	@Override
	public String peek() {
		if(isEmpty() == false)			// return the top element.
		return array[0];
		else
		return "Array is empty."; // If there is no element on the top.
	}
	
}
