/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 04/10/2022
 */
package mm23kk_assignment_2;

import java.util.Iterator;

public class Problem_2_Deque<T> implements Iterable<T> {
	
	private DequeNode <T> latestNode, first = null;							// Set latestNode as null and first as null for the first time..
	private int index = 0;												// Index should start at 0.
	
	
	/**
	 * This method adds a value at the end of the linked list.
	 * @param value - The value that the user is adding.
	 */
	public void addLast(T value) {
		
		if(isEmpty())													// Check if this is the first latestNode being added.
			latestNode = first =	new DequeNode<T>(value);					// Create a new latestNode and set it as first if list is empty.
		else {
			latestNode = latestNode.next = new DequeNode<T>(value);						// Current nodes pointer to newly added latestNode.
		}
		index++;														// Increase the index value.
	}
	
	
	/**
	 * This method adds a value at the beginning of the  list.
	 * @param value - The value that the user is adding.
	 */
	public void addFirst(T value) {
		
		DequeNode <T> previousFirst = first;								// Save the current first.
		
		if(isEmpty())														// Check if this is the first latestNode being added.
			latestNode = first =	new DequeNode<T>(value);						// Create a new latestNode and set it as first if list is empty.
		else {
			
			first =  new DequeNode<T>(value);								// Set first to new latestNode.
			first.next = previousFirst;										// Set next to previous first.
			
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
	 * Method used to return a string formated view of the linked list.
	 */
	public String toString() {

		DequeNode<T> currentNode = first;								// Get the first latestNode.
		
		if(first == null)
			return "[ ]";
		
		String str = "[ ";
		while(currentNode.next != null) {								// While the current latestNode is pointing to a latestNode. 
			
			str += currentNode.value +" , ";							// Load the value of current latestNode to string.
			currentNode = currentNode.next;								// Set the current the latestNode that current is pointing at.
			
		}
		str += currentNode.value +" ]";
		
		return str;
	}
	
	/**
	 * Return the value of an element on a certain index.
	 * @param position	- index of element that is wished to be returned.
	 * @return	- Returns the value of the index.
	 */
	public T get(int position){
		
		if(position < 0 || position >= index)
			throw new NullPointerException("Index out of bound.");
		
		T indexValue = null;
		DequeNode<T> currentNode = first;								// Get the first latestNode.
		indexValue = currentNode.value;
		
		for(int i = 0; i < position; i ++) {	
			currentNode = currentNode.next;								// Set the current the latestNode that current is pointing at.
			indexValue = currentNode.value;								// Set the current the latestNode that current is pointing at.
		}
		return indexValue;
	}
	
	/**
	 * Method used to delete the first element in the list.
	 */
	public void removeFirst(){
		
			if(isEmpty())					// Throw error if list is empty.
				throw new IndexOutOfBoundsException("List is empty.");

			first = first.next;												// Change the pointer of the first element.
			index--;																// Decrease index.
			
			if(isEmpty())															// If we have removed the last element, set first and current latestNode to 0.
				latestNode = first = null;
	}
	
	
	
	/**
	 * Method used to delete the first element in the list.
	 */
	public void removeLast(){
			
			if(isEmpty())					// Throw error if list is empty.
				throw new IndexOutOfBoundsException("List is empty.");
			
			DequeNode<T> currentNode = first;										// Get the head and the latestNode.
		
			for(int i = 0; i < size()-2; i ++)
				currentNode = currentNode.next;										// Set the current the latestNode that current is pointing at.
	
			currentNode.next = null;												// Replace the previous nodes next to current nodes next.
			latestNode = currentNode;												// Set the latest node to this next last.
			index--;																// Decrease index.
			if(index == 0)															// If we have removed the last element.
				latestNode = first = null;
			
	}
	
	/**
	 * This method is used to reverse the linked list.
	 */
	public void reverse() {
		
		if (isEmpty())
	 		throw new IndexOutOfBoundsException("List is empty");
		
		DequeNode<T> previousNode = null;					// Pointer for previous latestNode
		DequeNode<T> currentNode = first;					// Set current latestNode to the first latestNode.
		DequeNode<T> nextNode = null;						// Pointer for next latestNode.
		latestNode = first;										// Last added element to the first added.
	
		for(int i = 0; i < index; i++) {
			
				nextNode = currentNode.next;				// Save the next of the current latestNode.
				currentNode.next = previousNode;			// Change the next of current latestNode.
				previousNode = currentNode;					// Change previous latestNode to current latestNode.
				currentNode = nextNode;						// Change current latestNode to next.
			
		}
		first = previousNode;								// Set the first latestNode as the previous one. The first added element.
		

	}


	// Implementation of iterator class.
	class Iter implements Iterator<T> {
		
		private DequeNode <T> headNode = first;								// Get the current first node.
		
		@Override
		public boolean hasNext() {
			if(isEmpty() == true) 											// Check if list is empty.
				throw new IndexOutOfBoundsException("List is empty");	
			return (headNode != null);										// Return false if this is the last.
		}

		@Override
		public T next() {
			
			if(isEmpty() == true) 
				throw new IndexOutOfBoundsException("List is empty");
			DequeNode<T> current = headNode;									// Current as head node.
			headNode = headNode.next;											// Set next node as head node.
			return (current.value);												// Get value from current.
		}
		
	}


	/**
	 * Function that creates a new iterator class. That will be used to view the list.
	 */
	@Override
	public Iterator<T> iterator() {
		 return new Iter();														// Return new iterator class.
	}
	
	
	
}

