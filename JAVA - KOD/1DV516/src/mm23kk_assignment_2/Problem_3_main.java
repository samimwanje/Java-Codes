/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 04/10/2022
 */
package mm23kk_assignment_2;

import java.util.Iterator;

public class Problem_3_main {

	public static void main(String[] args) {

		Problem_3_Queue<String> queue = new Problem_3_Queue<String>();
		
		
		// Enqueueing.
		queue.enqueue("wgwf");
		queue.enqueue("ehwgw");
		queue.enqueue("wfwh34j");
		queue.enqueue("t3gyh");
		queue.enqueue("hehe");
		queue.enqueue("shwt2");
		
		System.out.println(queue);
		
	
		System.out.println("Enqued values: "+queue);
		queue.enqueue("evwf");
		System.out.println("Enqued values: "+queue);
		
		
		// Dequeueing.
		System.out.println("Dequeued value: "+queue.dequeue());			// Remove random element.
		System.out.println("Dequeued value: "+queue.dequeue());			// Remove random element.
		System.out.println("Dequeued value: "+queue.dequeue());			// Remove random element.
		System.out.println("Costum iterator: "+queue);
		
		
		System.out.println(queue.size());
	
		
		// Using implements Iterator.
		System.out.println("\nIterator 1: ");
		Iterator<String> test = queue.iterator();
		while(test.hasNext()) {
			System.out.println(test.next());
		}
		
		// Using implements Iterator.
		System.out.println("\nIterator 2: ");
		Iterator<String> test2 = queue.iterator();
		while(test2.hasNext()) {
			System.out.println(test2.next());
		}
	

	}

}
