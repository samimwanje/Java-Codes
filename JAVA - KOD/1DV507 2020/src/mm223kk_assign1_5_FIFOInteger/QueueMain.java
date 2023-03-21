/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign1_5_FIFOInteger;

import java.util.*;


public class QueueMain {

	public static void main(String[] args) {
		
		

		LinkedQueue linkedlist = new LinkedQueue();		// Create new list object.
		
		Iterator<Integer> iterator = linkedlist.iterator();		// Creates a Linked-List iterator. 
		
		
		System.out.println("Is empty: " +linkedlist.isEmpty());		// True if queue is empty 
		
		
		linkedlist.enqueue(1);							// Add elements at end of queue.
		linkedlist.enqueue(2);
		linkedlist.enqueue(3);
		linkedlist.enqueue(4);
		
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
