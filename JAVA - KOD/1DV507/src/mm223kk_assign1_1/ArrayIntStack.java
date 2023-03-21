package mm223kk_assign1_1;

public class ArrayIntStack extends AbstractIntCollection implements  IntStack{
	
	
	
	
	
	/* Add integer at top of stack. */
	public void push(int n) {
		
		int[] current = values;
		resize();
		
		for(int i = 0; i < size+1; i++) {	
		values[i+1] = current[i];
		}
		
		values[0] = n;
		size++;
	}
	
	/* Returns and removes integer at top of stack  */
	public int pop() throws IndexOutOfBoundsException{
		
		int top = values[0];	
		int [] current = values; 
		
			values = new int[size-1];
		
		for(int i = 0; i < size-1; i++) {	
			values[i] = current[i+1];		
		}
		
		size--;
		return top;	
	}
	
	/* Returns without removing integer at top of stack */
	public int peek() throws IndexOutOfBoundsException{
		return values[0];
		
		
	}
	
	/* Number of integers currently stored. */
	public int size() {
		return size;
		
		
	}
	
	/* Returns true if collection is empty. */
	public boolean isEmpty() {
		return size==0;
		
		
	}
	
	/* String of type "[ 7 56 -45 68 ... ]" */
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("[");
		for (int i=0;i<size;i++) {
			buf.append(" "+values[i]);
		}

		buf.append(" ]");
		return buf.toString();
	}
			
}
