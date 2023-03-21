/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 04/10/2022
 */
package mm23kk_assignment_2;

import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class Problem_3_Queue<T> implements Iterable<T>  {
	
	private QueueNode <T> latestNode, first = null;							// Set latestNode as null and first as null for the first time..
	private int index = 0;													// Index should start at 0.
	
	
	/**
	 * This method adds a value at the end of the queue.
	 * @param value - The value that the user is adding.
	 */
	public void enqueue(T value) {
		
		if(isEmpty())														// Check if this is the first latestNode being added.
			latestNode = first = new QueueNode<T>(value);					// Create a new latestNode and set it as first if list is empty.
		else {
			latestNode = latestNode.next = new QueueNode<T>(value);			// Current nodes pointer to newly added latestNode.
		}
		index++;															// Increase the index value.
	}
	
	
	/**
	 * Return the current size of the List.
	 * @return returns the index variable.
	 */
	public int size() {
		return index;
	}
	
	
	/**
	 * Function used to check if List is empty or not.
	 * @return returns true if the list is empty..
	 */
	public boolean isEmpty() {
		return size() == 0;
	}
	
	
	/**
	 * Method used to delete a random element in the queue.
	 */
	public T dequeue(){
		
			if(isEmpty())																// Throw error if list is empty.
				throw new NullPointerException("List is empty.");
		
			T value = null;																// Variable holding value of element that will be returned.
		
			int rmvIndex =  ThreadLocalRandom.current().nextInt(0,  size());			// A random index that will be removed.
				
			if(rmvIndex == 0) {	
				value = first.value;
				first = first.next;
			}else {
			
				QueueNode<T> previous = null;										// Previous start at null.
				QueueNode<T> current = first;										// Get the head and the latestNode.
				QueueNode<T> next = current.next;									// Get the next element.
				
				for(int i = 0; i < rmvIndex; i ++) {								// Find the element that will be deleted.
					previous = current;
					current = next;
					next = current.next;
				}
				
				value = current.value;												// Save the value of element.
				previous.next = next;												// Change pointer to element after deleted one.
				
				if(index == rmvIndex+1)												// Change the latest element in queue if last was deleted.
					latestNode = previous;											
					
			}
			
			index--;
			return value;
			
	}
	
	
	
	/**
	 * Method used to return a string formated view of the linked list.
	 */
	public String toString() {

		QueueNode<T> currentNode = first;								// Get the first latestNode.
		
		if(first == null)
			return "[ ]";
		
		String str = "[ ";
		while(currentNode.next != null) {								// While the current latestNode is pointing to a latestNode. 
			
			str += currentNode.value +" , ";							// Load the value of current latestNode to string.
			currentNode = currentNode.next;								// Set the current the latestNode that current is pointing at.
			
		}
		str += currentNode.value +" ]";
		
		return str;														// Return nice string of the array.
	}
	

	// Implementation of iterator class.
private	class Iter implements Iterator<T> {

		private Object values[];		// Values in the queue.
		private int idx;				// Current index.
		
		Iter(){
			QueueNode<T> currentNode = first;
			values = new Object[size()];
			idx = 0;
			
			// Load all  elements to an array.
			for(int i = 0; i < size(); i++) {
				values[i] = currentNode.value;						// Add current value to values.
				currentNode = currentNode.next;					// Change current node to next.	
			}
			
	
			for (int i = 0; i < values.length; i++) {
				int rnadomIndex = ThreadLocalRandom.current().nextInt(0, size());		// Generate random index between 0 and size.
				Object temp = values[rnadomIndex];										// Save current random index element.
				values[rnadomIndex] = values[i];										// Replace random index with element at index i.
				values[i] = temp;														// Swap the random element to i.
			}
			
			
		}
		
	
		public boolean hasNext() {
			if(isEmpty() == true) 											// Check if list is empty.
				throw new IndexOutOfBoundsException("List is empty");
			
			return (idx != size());										// Return false if this is the last.
		}

	
		@SuppressWarnings("unchecked")
		public T next() {
			if(isEmpty() == true) 
				throw new IndexOutOfBoundsException("List is empty");
			
			return  (T)values[idx++];												// Get value from current.
		}
		
	}

	/**
	 * Iterator return an object of the iterator class above.
	 */
	@Override
	public Iterator<T> iterator() {
		return new Iter();
	}
}
