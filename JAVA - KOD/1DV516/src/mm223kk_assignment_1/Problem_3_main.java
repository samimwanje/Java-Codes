package mm223kk_assignment_1;

public class Problem_3_main {
	

	public static void main(String[] args) {			
	
			Problem_3_Timeit timeit = new Problem_3_Timeit();	// Get timeit class object.
				
			
			System.out.println(  timeit.timeit(() -> {
				
				double x = 26.6 + 26.6 + 5.48 + 8.64;		// Run timeit  with testing code
				System.out.print("Done: "+x);
	
			}, 10));

	}

}