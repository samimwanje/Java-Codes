/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign2_4_5_FIFOGeneric;

import java.util.Iterator;

public class ListIterator<T> implements Iterator<T>  {
	
	
		 private Object[] elementArray = new Object[8]; 		// Array that will save all elements from the list.
		 
		 private int num = 0;						// Used when iterating over alla elements.
		 
		 
		  
		 
		 
		 /**
		  * Adds new recently added element in array.
		  * If needed double the size of the array.
		  * @param element every new element will be added to the array.
		  */
		 public void elementCollector(T element) {
					 
		 if(LinkedQueueGeneric.size % 8 == 0 || LinkedQueueGeneric.size != 0)
		 resize();
			 
		 elementArray[LinkedQueueGeneric.size] = element;
		 }
			 
		
		 /** 
		  * Doubling the size of the array when needed.
		  */
		 private void resize() {
			
			 Object[] tmp = new Object[2*elementArray.length];
				System.arraycopy(elementArray,0,tmp,0,elementArray.length); 
				elementArray = tmp;
		
		 }
		 
		 /**
		  * Removes the first element in the array.
		  * Used if the dequeue() method is called.
		  * 
		  */
		 protected void corp() {
			 
			 Object[] tmp = new Object[elementArray.length-1];
				System.arraycopy(elementArray,1,tmp,0,elementArray.length-1); 
				elementArray = tmp;
		
		 }
		 
		 
		/**
		 * After return of element "num" will be increased until "num" = size of the list.
		 * @return True of false if all elements are iterated.
		 * 
		 */
		public boolean hasNext() {	
			return num < LinkedQueueGeneric.size;
		}

		/**
		 * @return Returns element on index. After return of element num will be increased until num = size of the list.
		 */
		@SuppressWarnings("unchecked")
		public T next() {	
			return (T)elementArray[num++];
		}

	}