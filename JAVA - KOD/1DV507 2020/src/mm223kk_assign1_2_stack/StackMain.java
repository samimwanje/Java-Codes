package mm223kk_assign1_2_stack;



/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 23/08/2020
 */


public class StackMain {

	public static void main(String[] args) {
		
		
		Stack test = new Stack();								// Create object.
		
		System.out.println("Is empty: " +test.isEmpty());		// Is empty = true or false?
		System.out.println("Element on top is: " +test.peek()); // View element on top.
	
		test.push("Color");										// Add element on top
		test.push("Medium");									// Add element on top
		test.push("Objective");									// Add element on top
		
		
		System.out.println("\nElement on top is: " +test.peek());				// View element on top.
		System.out.println("Element poped: " +test.pop());						// View and pop element on top.
		System.out.println("Element poped: " +test.pop());						// View and pop element on top.
		System.out.println("Element on top is: " +test.peek());					// View element on top.
		
		System.out.println("\nElement poped: " +test.pop());					// View and pop element on top.
		System.out.println("Element poped: " +test.peek());						// View element on top.
		//	test.pop();														//	Enable to run Exception.
		
	}

}