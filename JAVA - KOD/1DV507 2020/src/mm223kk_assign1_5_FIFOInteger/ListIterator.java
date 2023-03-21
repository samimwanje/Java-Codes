/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign1_5_FIFOInteger;

import java.util.Iterator;

public class ListIterator implements Iterator<Integer>  {
	
	
		 private int elementArray[] = new int[8]; // Array that will save all elements from the list.
		 
		 private int num = 0;						// Used when iterating over alla elements.
		 
		 
		 
		 /**
		  * Adds new recently added element in array.
		  * If needed double the size of the array.
		  * @param element every new element will be added to the array.
		  */
		 public void elementCollector(int element) {
					 
		 if(LinkedQueue.size % 8 == 0 && LinkedQueue.size != 0)
		 resize();
			 
		 elementArray[LinkedQueue.size] = element;
		 }
			 
		
		 /** 
		  * Doubling the size of the array when needed.
		  */
		 private void resize() {
			
			 int[] tmp = new int[2*elementArray.length];
				System.arraycopy(elementArray,0,tmp,0,elementArray.length); 
				elementArray = tmp;
		
		 }
		 
		 /**
		  * Removes the first element in the array.
		  * Used if the dequeue() method is called.
		  * 
		  */
		 protected void corp() {
			 
			 int[] tmp = new int[elementArray.length-1];
				System.arraycopy(elementArray,1,tmp,0,elementArray.length-1); 
				elementArray = tmp;
		
		 }
		 
		 
		/**
		 * After return of element "num" will be increased until "num" = size of the list.
		 * @return True of false if all elements are iterated.
		 * 
		 */
		public boolean hasNext() {	
			return num < LinkedQueue.size;
		}

		/**
		 * @return Returns element on index. After return of element num will be increased until num = size of the list.
		 */
		public Integer next() {	
			return elementArray[num++];
		}

	}