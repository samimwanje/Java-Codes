package mm223kk_assign1_1;

public class CollectionMain {

	public static void main(String[] args) {
		
		System.out.println("============================================ LIST");		
		
		ArrayIntList list = new ArrayIntList();
		
		System.out.println("The stack is empty: " +list.isEmpty());
	
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(7);
				
		System.out.println("The values in the list are now: " +list.toString());
		
		System.out.println("\nRemove value at position " +"2.");
		
		list.remove(2);
		
		System.out.println("Add " +"8 " +"at the end.");
		
		list.add(8);
		
		System.out.println("The values in the list are now: " +list.toString());
		
		System.out.println("\nAdd " +"9 " +"at position " +"2.");
		
		list.addAt(9, 2);
		
		System.out.println("The list is empty: " +list.isEmpty());
		
		System.out.println("The values in the list are now: " +list.toString());
		
		System.out.println("The size of the list is: " +list.size());
		
		System.out.println("Integer " +"5 " +"is att position: " +list.indexOf(5));
		
		System.out.println("On position " +"\"  \" " +"we have: " +list.get(3));
			
		System.out.println("============================================ STACK");
		
		
		/// Stack
		ArrayIntStack stack = new ArrayIntStack();
		
		System.out.println("The values in the stack are now: " +stack.toString());

		System.out.println("The stack is empty: " +stack.isEmpty());
		
		System.out.println("\nAdd " +"8 4 2 5 6 " +"at the stack.");
		
		stack.push(8);
		stack.push(4);
		stack.push(2);
		stack.push(5);
		stack.push(6);
	
		System.out.println("The values in the stack are now: " +stack.toString());
		
		System.out.println("The stack is empty: " +stack.isEmpty());
		
		System.out.println("\nThe integer " +stack.pop() +" is now removed.");	
		
		System.out.println("The values in the stack are now: " +stack.toString());

		System.out.println("Integer at the top of the stack: " +stack.peek());
		
		System.out.print("Number of intergers currently stored: " +stack.size());
	}

}
