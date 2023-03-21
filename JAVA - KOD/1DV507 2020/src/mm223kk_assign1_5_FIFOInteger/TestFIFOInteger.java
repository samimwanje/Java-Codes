/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign1_5_FIFOInteger;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;
import org.junit.jupiter.api.Test;

class TestFIFOInteger {

	@Test
	void test() {
	
		
		LinkedQueue linkedlist = new LinkedQueue();		// Create new list object.
		
		Iterator<Integer> iterator = linkedlist.iterator();		// Creates a Linked-List iterator. 
		
		assertTrue(linkedlist.isEmpty());		// True if queue is empty 
		
		linkedlist.enqueue(1);							// Add elements at end of queue.
		linkedlist.enqueue(2);
		linkedlist.enqueue(3);
		linkedlist.enqueue(4);
		
		
		assertFalse(linkedlist.isEmpty());		 			// False if queue is not empty 	
		
		assertEquals(1,linkedlist.first());			 		// Return (without removing) first element.
		
		assertEquals(4,linkedlist.last());			 		// Return (without removing) last element.
	
		int x = linkedlist.first();
		
		while(iterator.hasNext()) {							// Testing the iterator.
			
				assertEquals(x,iterator.next());
				x++;
			
		}
		

		assertEquals(4,linkedlist.size()); 					// Size of list.
		
		linkedlist.dequeue();		 						//remove first element. 
		linkedlist.dequeue();								// remove first element.
		assertEquals(2,linkedlist.size());					// Size of list.
		linkedlist.dequeue();		 						// remove first element.
		assertEquals(4,linkedlist.first());					// Element left in list.
		linkedlist.dequeue();		 						// remove first element.
		
		
		// Check if Exception works.
	     NullPointerException exception = assertThrows(NullPointerException.class, () -> {
	    		linkedlist.dequeue();
	        });
	    assertEquals("The list is empty", exception.getMessage());

		
		
		
		
		
	
		
		
		
		
	}


}
