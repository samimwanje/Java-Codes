/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign2_4_5_FIFOGeneric;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;
import org.junit.jupiter.api.Test;

class TestFIFOGeneric {

	@Test
	void test() {
	
		
		LinkedQueueGeneric<String> linkedlist = new LinkedQueueGeneric<String>();		// Create new list object.
		
		Iterator<String> iterator = linkedlist.iterator();		// Creates a Linked-List iterator. 
		
		assertTrue(linkedlist.isEmpty());		// True if queue is empty 
		
		linkedlist.enqueue("One");							// Add elements at end of queue.
		linkedlist.enqueue("Two");
		linkedlist.enqueue("Three");
		linkedlist.enqueue("Four");
		
		
		assertFalse(linkedlist.isEmpty());		 			// False if queue is not empty 	
		
		assertEquals("One",linkedlist.first());			 		// Return (without removing) first element.
		
		assertEquals("Four",linkedlist.last());			 		// Return (without removing) last element.
	
		int x = 0;
		
		String testString[] = {"One", "Two", "Three", "Four"};
		
		while(iterator.hasNext()) {							// Testing the iterator.
			
				assertEquals(testString[x++],iterator.next());
				if(x == 3)
				return;
			
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
	    
	    
	    
	    
	    
	    
	    /// Testing Integers
	    /// Testing Integers
	    /// Testing Integers
	    /// Testing Integers
	    
	    

	    LinkedQueueGeneric<Integer> IntegerList = new LinkedQueueGeneric<Integer>();		// Create new list object.
		
		Iterator<Integer> IntegerIterator = IntegerList.iterator();		// Creates a Linked-List iterator. 
		
		assertTrue(linkedlist.isEmpty());		// True if queue is empty 
		
		IntegerList.enqueue(1);							// Add elements at end of queue.
		IntegerList.enqueue(2);
		IntegerList.enqueue(3);
		IntegerList.enqueue(4);
		
		
		assertFalse(linkedlist.isEmpty());		 			// False if queue is not empty 	
		
		assertEquals(1,linkedlist.first());			 		// Return (without removing) first element.
		
		assertEquals(4,linkedlist.last());			 		// Return (without removing) last element.
	
		int z = IntegerList.first();
		
		while(IntegerIterator.hasNext()) 						// Testing the iterator.
				assertEquals(z++,IntegerIterator.next());
		

		assertEquals(4,linkedlist.size()); 					// Size of list.
		
		linkedlist.dequeue();		 						//remove first element. 
		linkedlist.dequeue();								// remove first element.
		assertEquals(2,linkedlist.size());					// Size of list.
		linkedlist.dequeue();		 						// remove first element.
		assertEquals(4,linkedlist.first());					// Element left in list.
		linkedlist.dequeue();		 						// remove first element.
		
		
		// Check if Exception works.
	     NullPointerException exception2 = assertThrows(NullPointerException.class, () -> {
	    		linkedlist.dequeue();
	        });
	    assertEquals("The list is empty", exception2.getMessage());

	}


}
