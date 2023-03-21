package mm223kk_assign4_7_insertionTime;

import java.util.Comparator;

public class sortingTimeMeasure {
	
	
	static long start;
	static long end;
	static long LoadTime = 0;
	static long length;
	static Runtime runtime = Runtime.getRuntime();
	
	final static String[] alphabet  = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
			"s", "t", "u", "v", "w", "x", "y", "z" };
	

		public static void main(String[] args) {
	
		
		//Exercise 7 .1
	
	 	intExprimentExecutor(); // Use only one at once.
	 	
	 	
	 	runtime.gc();  // Clear memory
	 	
	 	
	 	//Exercise 7 .2
	 	
	 	stringExprimentExecutor();			// Use only one at once. Output will be cleared.
	 	
	}
	
	
	private static void intExprimentExecutor() {
	
		
		int z = 1;														// Used to increase the size of the array.				
		while(LoadTime < 1000) {										// Check if it took 1000 ms ( 1 s ) to sort. 
																		// If not... re-try with a bigger array that contains more integers.
		int[]  numArray = new int[10*z]; 								// Create new array with size 10 
		z += 200; 														// On my machine this was the perfect increase-array-value that gave 1000 ms was.
	 	for(int x = 0; x < numArray.length; x++) {	
	 	numArray[x] = (int)(Math.random() * ( numArray.length+5)); }	// Generate random numbers between 0 and the length of the Int-array.
	 	
	 	

	 	// Used for a nice out put not necessarily needed because we can't even read that output while running the program.	
	 	System.out.print("Array generated before sort: " +"{ ");
	 	for(int a : numArray)
	 	System.out.print(a +", ");
	 	System.out.println("}");
 	
	 	start = System.currentTimeMillis();											// Start the time.
	 	numArray = insertionSort(numArray);       
	 	end = System.currentTimeMillis();											// Stop the time.
	 	
	 	
	 	LoadTime = end - start;														// Time to run.
	 	length = numArray.length;													// The length of the array. (amount of integers).
	 	
	 	

	 	// Used for a nice out put not necessarily needed because we can't even read that output while running the program.	
	 	 System.out.print("Array generated after sort: " +"{ ");
	 	for(int a : numArray)																
	 	System.out.print(a +", ");
	 	System.out.println("}"); 
	 	
	 	// A nice output of the status after the run.
	 	System.out.println("InsertionSort---------------------\n");
	 	System.out.println("Amount of integers sorted: " +length +" integers." );		
	 	System.out.println("Time spent to sort integers: " +LoadTime +" ms." );
	 	System.out.println("\nInsertionSort---------------------\n");

 		}
		
		
		
	}
	
	
	
	
	private static void stringExprimentExecutor() {
		
	

		int z = 1;													// Used to increase the size of the array.				
		while(LoadTime <  1000) {											// Check if it took 1000 ms ( 1 s ) to sort. 
																	// If not... re-try with a bigger array that contains more strings.
		String[]  stringArray = new String[10*z]; 					// Create a new StringArray  that will contain random strings with the length 10.
		z += 100; 													// On my machine this was the perfect increase-array-value that gave 1000 ms was.
	 	
		for(int x = 0; x < stringArray.length; x++) {				// For-loop used to place 10-length-strings in array.
		stringArray[x] = generateRandomString(); }					// Place random string to array.
		
	 		
	 	

	 	// Used for a nice out put not necessarily needed because we can't even read that output while running the program.	
	 	System.out.print("Array generated before sort: " +"{ ");
	 	for(String a : stringArray)
	 	System.out.print(a +", ");
	 	System.out.println("}");
 	
	 	start = System.currentTimeMillis();											// Start the time.
	 	stringArray = insertionSort(stringArray,(String s1,String s2) -> s1.compareTo(s2));       
	 	end = System.currentTimeMillis();											// Stop the time.
	 	
	 	
	 	LoadTime = end - start;														// Time took to run.
	 	length = stringArray.length;												// The length of the array. (amount of Strings).
	 	
	 	

	 	// Used for a nice out put not necessarily needed because we can't even read that output while running the program.	
	 	 System.out.print("Array generated after sort: " +"{ ");
	 	for(String a : stringArray)																
	 	System.out.print(a +", ");
	 	System.out.println("}"); 
	 	
	 	// A nice output of the status after the run.
	 	System.out.println("InsertionSortStrings---------------------\n");
	 	System.out.println("Amount of strings sorted: " +length +" Strings." );		
	 	System.out.println("Time spent to sort strings: " +LoadTime +" ms." );
	 	System.out.println("\nInsertionSortStrings---------------------\n");
	 	runtime.gc();  // Clear memory

 		}
		
	
		
	}
	
	
	
	private static  String generateRandomString() {
		
		String currentString = ""; 										// Clear current string.
		for(int x = 0; x < 10; x ++ )								// Generate random string with the length 10;
			currentString += alphabet[ (int)(Math.random() * ( alphabet.length)) ]; 

		return currentString;										// Return generated string.
		
	}
	
	
	

	private static int[] insertionSort(int[] in) {

		
		if(in.length == 1)						// Check if the length of the array is 1
			return in;							// No sort in then needed.
		
		
		

		 int tmp;  										// Create new temporary variable that holds the current number.
	    for(int i = 1; i < in.length; i++)   { 	
	    	for(int x = i;  x > 0; x--) {  			
	    		if(in[x] < in[x-1]) {							// Check if current value is less than the value before.
	    			tmp = in[x];								// If yes save current value in temp.
	    			in[x] = in[x-1];							// Current position is now the same value as previous position element.
	    			in[x-1] = tmp;								// Store temp at previous position index.
	    			
	    		}
	    	}
	    	
	    }
			
		return in;												// Return a sorted array.
		
	}
	
	

	private static String[] insertionSort(String[] in, Comparator<String> c) {
		
		
		if(in.length == 1)						// Check if the length of the array is 1
			return in;							// No sort in then needed.
			
			
			String tmp = "";  													// Create new temporary variable that holds the current number.
			 for(int i = 1; i < in.length; i++)   {  													// If yes save current value in temp.
				  	for(int x = i;  x > 0; x--) {  					
		    		if(c.compare(in[x], in[x-1]) < 0) {							// Check if current value is less than the value before.	
		    			tmp = in[x];								// If yes save current value in temp.
		    			in[x] = in[x-1];							// Current position is now the same value as previous position element.
		    			in[x-1] = tmp;								// Store temp at previous position index.
		    		}
		    		
		    	}
		    	
		    }
				
			return in;															// Return a sorted array.
		
			}
	
	

}
