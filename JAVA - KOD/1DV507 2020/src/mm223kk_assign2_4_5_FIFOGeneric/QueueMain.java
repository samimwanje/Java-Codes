/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign2_4_5_FIFOGeneric;

import java.util.*;


public class QueueMain {

	public static void main(String[] args) {
		
		

		LinkedQueueGeneric<String> linkedlist = new LinkedQueueGeneric<String>();		// Create new list object.
		
		Iterator<String> iterator = linkedlist.iterator();		// Creates a Linked-List iterator. 
		
		
		System.out.println("Is empty: " +linkedlist.isEmpty());		// True if queue is empty 
		
		
		linkedlist.enqueue("One");							// Add elements at end of queue.
		linkedlist.enqueue("Two");
		linkedlist.enqueue("Three");
		linkedlist.enqueue("Four");
		
		System.out.println("Is empty: " +linkedlist.isEmpty());		 // True if queue is empty 	
		
		System.out.println("First element: " +linkedlist.first());			 // Return (without removing) first element.
		
		System.out.println("Last element: " +linkedlist.last());			 // Return (without removing) last element.
		
		
		System.out.println();
		
		System.out.println("Element removed: " +linkedlist.dequeue());		 // return and remove first element. 
		
		System.out.println("Elements in list: ");
		
		while(iterator.hasNext()) {
				System.out.println(iterator.next());
			
		}
		
		
		System.out.println("Size of list: " +linkedlist.size());
	
	}

}
