/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign2_4_5_FIFOGeneric;

public interface GenericQueue<T> extends Iterable<T> {  
	   public int size();                     // current queue size 
	   public boolean isEmpty();              // true if queue is empty 
	   public void enqueue(T element);   // add element at end of queue 
	   public T dequeue();               // return and remove first element. 
	   public T first();                 // return (without removing) first element 
	   public T last();                  // return (without removing) last element 
	   public String toString();              // return a string representation of the queue content

	}