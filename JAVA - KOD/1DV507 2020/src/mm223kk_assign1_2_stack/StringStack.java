package mm223kk_assign1_2_stack;


/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 23/08/2020
 */



public interface StringStack {
	
	
	  int size(); 			// Current stack size
	   boolean isEmpty(); 		// true if stack is empty
	   void push(String element); 	// Add element at top of stack
	   String pop(); 		// Return and remove top element,
					// exception if stack is empty
	   String peek(); 		// Return (without removing) top element,
					// exception if stack is empty.

}
