package mm223kk_assignment_1;

public class Problem_8_Percolation {
	
	
	private int gates [][];
	private Problem_6_quickUnion quickUnion;		// Use the quick union class.	
	private int N;									// Current N, for nxn.
	public int openGates;							// Current open gates.
	private int fullGates;							// Current full gates.
	private final int top;							// Top virtual gate.
	private final int bottom;						// Bottom virtual gate.
	
	
	/**
	 * Constructor which takes in a given number n,
	 * and creates an n x n blocked grid of gates.
	 * @param n - Used for the size of n x n. 
	 */
	Problem_8_Percolation(int n){
		
		if (n <= 0)			// Check first if correct values are entered.
			throw new IndexOutOfBoundsException("Value is out of bound.");
		
	     N = n;														// Set n
		 gates = new int[n][n];										// Create n x n grid.
		 quickUnion = new Problem_6_quickUnion( (N*N) +2);			// Prepare a quickUnion find of n*n elements + the two virtual gates.
		 

		 top = N*N;													// Virtual top site will be the next last element.
	     bottom = N*N +1;											// Virtual bottom site will be the last element.
		 for(int i = 0; i < N; i++) {
			 
			 quickUnion.union(i, top);								// Connect to all virtual top gates to the top row.
			 quickUnion.union( N * (N - 1) + i, bottom);			// Connect to all virtual bottom gates to the bottom row.
			
		 }
		 
		 // Close all the gates.
		 for(int y = 0; y < N; y++) 
			 for(int x = 0; x < N; x++)
				 gates[y][x] = 0;
	
	}
	
	private boolean isOpen(int y, int x) {
		
		if (y < 0 || x < 0 || y > N|| x > N)			// Check first if correct values are entered.
			throw new IndexOutOfBoundsException("Value is out of bound.");
		return gates[y][x] == 1;
	}

	
	private boolean isFull(int y, int x) {
		
		if (y < 0 || x < 0 || y > N|| x > N)			// Check first if correct values are entered.
			throw new IndexOutOfBoundsException("Value is out of bound.");
		
		return quickUnion.connected( unionIndex(y, x), top);		// If it is connected to the top then it is full.
	}
	
	public boolean percolates() {
		
		return  quickUnion.connected(top, bottom);	// If top connects to bottom then the percolation is true.
	}
	
	public void openSite(int y, int x) {
		
		
		if(isOpen(y,x))														// Do not do anything if y,x is already open.
			return;
		
		if (y < 0 || x < 0 || y > N|| x > N)								// Check first if correct values are entered.
			throw new IndexOutOfBoundsException("Value is out of bound.");
		
		gates[y][x] = 1; 													// Open site.
		
		openGates++;
		
		int currentIndex = unionIndex(y, x); 								// Get the quickUnion index of the current site.
	

		if( y != 0  && gates[y-1][x] == 1 )	
			quickUnion.union( unionIndex(y-1, x), currentIndex); // Get the quickUnion index for the site over (up) the current site, and connected the lines.
	
		
		
		if( y != (N - 1) && gates[y+1][x] == 1)
			quickUnion.union(  unionIndex(y+1, x), currentIndex); // Get the quickUnion index for the site under current site.
		
		
		if( x != (N - 1) && gates[y][x+1] == 1)
			quickUnion.union( unionIndex(y, x+1), currentIndex); // Get the quickUnion index on the right side of the current site.
		
		
		if( x != 0 && gates[y][x-1] == 1)
			quickUnion.union( unionIndex(y, x-1), currentIndex); // Get the quickUnion index on the left side of the current site.
		
		
		if(isFull( y,  x)) {
			fullGates++;
		}

	}
	

	private int unionIndex(int row, int column){
		
		return (row * N) +column;
	}
	
	public void visualize() {
		
		System.out.println("Current state: " +N +"x" +N);
		
		System.out.println("Open gates: " +openGates);
		
		System.out.println("Full gates: " +fullGates);
		System.out.println();
		for(int i = 0; i < N; i++ ) {
			
			for(int x = 0; x < N; x++ ) 
				System.out.print(gates[i][x] +"  ");
			System.out.println();
			
		}
		System.out.println("\nPercolates: " +percolates());
		
	}
	
	
}
