/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 04/10/2022
 */
package mm23kk_assignment_2;

public class Problem_1_LinkedList<T> {
	
	private LinkedNode<T> node, first = null;							// Set node as null and first as null for the first time..
	private int index = 0;												// Index should start at 0.
	
	
	/**
	 * This method adds a value at the end of the linked list.
	 * @param value - The value that the user is adding.
	 */
	public void add(T value) {
		
		if(first == null)												// Check if this is the first node being added.
			node = first =	new LinkedNode<T>(value);			// Create a new node with next set to 0.
		else {
			node.next = new LinkedNode<T>(value);				// Current nodes pointer to newly added node.
			node = node.next;
			
		}
		index++;														// Increase the index value.
	}
	
	
	/**
	 * Return the current size of the LinkedList.
	 * @return returns the index variable.
	 */
	public int length() {
		return index;
	}
	
	/**
	 * Method used to return a string formated view of the linked list.
	 */
	public String toString() {
		
		if (index == 0)
	 		throw new IndexOutOfBoundsException("List is empty");
		
		LinkedNode<T> currentNode = first;								// Get the first node.
		String str = "[ ";
		while(currentNode.next != null) {								// While the current node is pointing to a node. 
			
			str += currentNode.value +" , ";							// Load the value of current node to string.
			currentNode = currentNode.next;								// Set the current the node that current is pointing at.
			
		}
		str += currentNode.value +" ]";
		
		return str;
	}
	
	public T get(int position){
		
		if(position < 0 || position >= index)
			throw new NullPointerException("Index out of bound.");
		
		T indexValue = null;
		LinkedNode<T> currentNode = first;								// Get the first node.
		indexValue = currentNode.value;
		
		for(int i = 0; i < position; i ++) {	
			currentNode = currentNode.next;								// Set the current the node that current is pointing at.
			indexValue = currentNode.value;								// Set the current the node that current is pointing at.
		}
		return indexValue;
	}
	
	/**
	 * Method used to delete an element on a certain index.
	 * @param position - index of element that will be deleted.
	 */
	public void delete(int position){
		

			if(position < 0 || position > index || position == index)					// Throw error if size of list does not match.
				throw new IndexOutOfBoundsException("Index out of bound.");
			
			LinkedNode<T> currentNode = first, prevNode = first;						// Get the head node.
			
			if(position == 0)															// Check if it is the first element that is going to be changed.
				first = currentNode.next;												// Change the pointer of the first element.
			else {
				
				for(int i = 0; i < position; i ++) {	
					prevNode = currentNode;												// Save the previous element.
					currentNode = currentNode.next;										// Set the current the node that current is pointing at.
				}
		
				prevNode.next = currentNode.next;										// Replace the previous nodes next to current nodes next.
			}
	
			index--;																	// Decrease index.
	}
	
	/**
	 * This method is used to reverse the linked list.
	 */
	public void reverse() {
		
		if (index == 0)
	 		throw new IndexOutOfBoundsException("List is empty");
		
		LinkedNode<T> previousNode = null;					// Pointer for previous node
		LinkedNode<T> currentNode = first;					// Set current node to the first node.
		LinkedNode<T> nextNode = null;						// Pointer for next node.
		node = first;										// Last added element to the first added.
	
		for(int i = 0; i < index; i++) {
			
				nextNode = currentNode.next;				// Save the next of the current node.
				currentNode.next = previousNode;			// Change the next of current node.
				previousNode = currentNode;					// Change previous node to current node.
				currentNode = nextNode;						// Change current node to next.
			
		}
		first = previousNode;								// Set the first node as the previous one. The first added element.
		

	}
	
	

}
