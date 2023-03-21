/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 04/10/2022
 */
package mm23kk_assignment_2;

import java.util.Iterator;

public class Problem_2_main {

	public static void main(String[] args) {
		
		Problem_2_Deque<String> deque = new Problem_2_Deque<String>();
		
		
		// Adding on last.
		deque.addLast("xuze");		
		System.out.println("Add last: "+deque.toString());
		deque.addLast("41515");
		System.out.println("Add last: "+deque.toString());
		
		// Add on first.
		deque.addFirst("Soam");
		deque.addFirst("XD");
		System.out.println("Add first: "+deque.toString());
		
		// Remove last
		deque.removeLast();
		System.out.println("Remove last: "+deque.toString());
	
		// Remove first
		deque.removeFirst();
		System.out.println("Remove first: "+deque.toString());
		
		// Print size()
		System.out.println("Size: "+deque.size());
		
		// Empty
		deque.removeFirst();
		deque.removeLast();
		System.out.println("Is empty: "+deque.isEmpty());
		
		
		// Testing iterators.
		deque.addFirst("Soam");
		deque.addFirst("XD");
		deque.addLast("faognaog");
		deque.addLast("gaongapng");
		
		// My costume iterator.
		System.out.println("Costum iterator: "+deque.toString());	
		
		// Using implements Iterator.
		Iterator<String> test = deque.iterator();
		while(test.hasNext()) {
			System.out.println();
			System.out.println(test.next());
		}
		
		
		// Testing error. 
		//deque.removeFirst(); deque.removeFirst(); deque.removeFirst(); deque.removeFirst(); deque.removeFirst();
		

	
	}

}
