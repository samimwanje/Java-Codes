package mm223kk_assignment_1;

public class Problem_3_Timeit  {
	
		/**
		 * Function uses the interface "Funciton.java" in order,
		 * to declare a function and then measure the time it takes to run it.
		 * @param task - The task the twill be measured.
		 * @param loops	
		 * @return	// Returns the average of 10 runs it took to run the task.
		 */
		public float timeit(Function task, int loops) {
			
			long startTime = 0;	// Start time.
			long endTime = 0;	// End time.	
			float avg = 0;		// Average time.
			 
			for(int i = 0; i < loops+2; i ++) {			// Re run "loops+2" times. 	
				
					 if(i >= 2) {			// Wait for the nanoTime to warm up.
						 startTime = System.nanoTime();	// Start time.
						 	task.runCode();							// Run the task.
						 endTime = System.nanoTime();		// Stop time.	
						 avg += (endTime - startTime);			// Wait for 2 loops in order to skip the slow "warm up" time. 
					 }else 
						System.nanoTime();		// Warm up.	

			}
						
			return ((avg/loops)/(float)Math.pow(10,9));				// Return the measured time in s.
	
		}
}
	






