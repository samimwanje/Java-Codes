/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign2_4_5_FIFOGeneric;


import java.util.Iterator;


/**
 * <h1> Linked-list program. </h1> 
 * 
 *<p>This is a "linked-list" program that works like a FIFO ( first in first out)
 * It also comes with an iterator that helps the user to view the elements in the list.
 * The program comes with functions that will make it simpler to view the status of the list.
 * The user can manage the list by adding new elements at the end (tail) of the list, and remove the first (head) element in the list.
 * <p>
 * @author Sami Mwanje: mm223kk
 */

public class LinkedQueueGeneric<T> implements GenericQueue<T>{
	
	protected static int size; 		// Size of the list.
	
	 private Node<T> head;			// Head element (node) of the list.
	
	 private Node<T> tail;			// Tail element (node) of the list.
	 
	 private ListIterator<T> Iterator = new ListIterator<T>();		// Iterator to iterate over all elemets in the list (nodes).
	 
	
	 
	 /**
	  * <b> Constructor: </b>
	  *  <br>
	  *  Constructor for the LinkedQueueGeneric Queue class.
	  *  <br>Makes sure that the list is empty and ready for use.</br>
	  *  
	  */
	public LinkedQueueGeneric() {
				
		size = 0;
		
		head = null;
		
	    tail = null;
		
	}

	/**
	 * Returns a iterator object that can be used to view the full list. 
	 * @return Iterator object with methods such <b>next()</b> and <b>hasNext()</b>.
	 * 
	 */
	public Iterator<T> iterator() {
		
		return Iterator;
	}

	/**
	 * 
	 * Checks the size of the list.
	 * @return Returns the size of the list.
	 * 
	 */
	public int size() {
		
		return size;
	}

	/**
	 * Checks if the size of the list is 0.
	 * @return Return true or false if the list contains any elements.
	 * 
	 * 
	 */
	public boolean isEmpty() {
		
		return size == 0;
	}

	
	/**
	 * 
	 * <p>Adds a new element at the end of the list. If the list was previously empty, head and tail will be the same. 
	 * <br> Otherwise tail will point at the new element. Also increase <b> size </b>.
	 * </p>
	 * 
	 * @param element Element that will be added at the end of  the List.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public void enqueue(T element) {
			
		Node<T> currentNode = new Node<T>(element);
		
		Iterator.elementCollector(element);
		
		if(this.head == null) {
			head = currentNode;
			tail = currentNode;	
		}

		tail.next = currentNode;
		tail = currentNode;
		
		size ++;
	}
	
	/**
	 * 
	 * Returns and removes the first element from the List and decreases <b>size</b>.
	 * 
	 * @throws NullPointerException if <code> empty = true</code>.
	 * @return The first element before removed.
	 */
	public T dequeue() {
		
		if( isEmpty() )
			 throw new NullPointerException("The list is empty");
		
		Iterator.corp();
		T tmp = head.data();
		head = head.next;
		size--;
		return tmp;
	}

	
	/**
	 * 
	 * Returns The first element in the List.
	 * @return The first element.
	 */
	public T first() {
		
		return head.data();
	}

	/**
	 * 
	 * Return the last element in the List.
	 * @return The last element.
	 * 
	 */
	public T last() {
		return tail.data();
	}

}

 
