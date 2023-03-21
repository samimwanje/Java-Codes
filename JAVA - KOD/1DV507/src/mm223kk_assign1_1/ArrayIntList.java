package mm223kk_assign1_1;

public class ArrayIntList extends AbstractIntCollection implements IntList{
	
	
	/* Add integer n to the end of the list. */
	public void add(int n) {
		
	resize();
		
	values[size] = n;
	
	size++;
		
	}
	
	/* Inserts integer n at position index. Shifts the element currently at that 
	 * position (if any) and any subsequent elements to the right.  */
	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		
		int current [] = values;
		
		values = new int[size+1];
		
		values[index] = n;
		
		for(int i = 0; i < index; i++) { values[i] = current [i]; }
		
		for(int i = index; i < size; i++) { values[i+1] = current [i]; }
		
		size++;
			
		}
	
	
	/* Remove integer at position index. */
	public void remove(int index) throws IndexOutOfBoundsException {
		
			int current [] = values;
			
			values = new int[values.length-1];
			
			for(int i = 0; i < index+1; i++) { values[i] = current [i]; }
			
			for(int i = index+1; i < size; i++) { values[i-1] = current [i]; }
			
			size--;
	}
	
	/* Get integer at position index. */
	public int get(int index) throws IndexOutOfBoundsException {
		return values[index];
		
	}

	/* Number of integers currently stored. */
	public int size() {
		return size;
	}
	
	/* Returns true if collection is empty. */
	public boolean isEmpty() {
		return size==0;
		
	}
	
	/* Find position of integer n, otherwise return -1 */
	public int indexOf(int n) {
		
		int position = -1;
		
		for(int i = 0; i < values.length; i++) {
			
		if(values[i] == n) {
		position = i;
		break;}
		}
		
		return position;	
	}
	
	/* String of type "[ 7 56 -45 68 ... ]" */
	
	public String toString() {
		
		return super.toString();
	}
}
