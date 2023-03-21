/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 02/11/2022
 */
package mm223kk_assignment_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import mm223kk_assignment_1.Problem_3_Timeit;


public class Problem_3_5_main {
	

	public static void main(String[] args) {
		
		 Problem_3_5_Quicksort Quicksort = new Problem_3_5_Quicksort(); 		// Quicksort-
		 Problem_3_4_Heapsort Heapsort = new Problem_3_4_Heapsort();			// Heapsort.
		 Problem_3_3_Insertsort Insertsort = new Problem_3_3_Insertsort();		// Insertsort.
		 Problem_3_Timeit Timeit = new Problem_3_Timeit();
		 
		// test(10, Quicksort, Heapsort, Insertsort); 	// Used to test run the sorting classes.	
		int loops = 100;				// Mean value for calculating average time.
		int startElements = 0;		// Max elements in array.
		int maxElements = 20000;

//	for(int x = startElements; x < maxElements; x *= 10 )
		for(int elements = startElements; elements < maxElements; elements += (maxElements/10)) {
			
			int randomNums[] = new int[elements];
			for(int i = 0; i < elements; i++ ) 
				randomNums[i] = ThreadLocalRandom.current().nextInt();
			
			// Measuring vs depth.
			Quicksort.sort(randomNums, 20);
			int depth = Quicksort.depth;
			System.out.println("Depth: " +depth);
			generateCSV("quicksort_3_5_depth",elements, depth);
	
			/*
			// Measuring vs Time.
			generateCSV("quicksort_3_5_depth",elements, Timeit.timeit(() -> {	
				Quicksort.sort(randomNums, 1);
			}, loops));
			
			
			// Insertsort measuring.
			int randomNums2[] = new int[elements];
			for(int i = 0; i < elements; i++ ) 
				randomNums2[i] = ThreadLocalRandom.current().nextInt();
			
			generateCSV("insertsort_3_5_depth",elements, Timeit.timeit(() -> {							
				Insertsort.sort(randomNums2);
			}, loops));
			
			// Heapsort measuring.
			int randomNums3[] = new int[elements];
			for(int i = 0; i < elements; i++ ) 
				randomNums3[i] = ThreadLocalRandom.current().nextInt();
			
			generateCSV("heapsort_3_5_depth",elements, Timeit.timeit(() -> {						
				Heapsort.sort(randomNums3);
			}, loops));
			
			
			*/
			
			
		}
		
	}
	
	private static void generateCSV(String csvName,int dataX, double d) {
			String path = "src\\mm223kk_assignment_3_5\\" +csvName  +".csv";			// Path where the csv file will be located.
			String data = dataX +","+d;
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));
				writer.write(data+"\n");											// Append the latest result to csv file.
				writer.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	
	/*
	 * Function used to testing the code,
	 * sorts by using quick sort and insert sort.
	 * Prints the results.
	 * @param - elements that will be sorted.
	 */
	private static void test(int elements, Problem_3_5_Quicksort Quicksort, Problem_3_4_Heapsort Heapsort, Problem_3_3_Insertsort Insertsort) {
		
		int randomNums[] = new int[elements];
		for(int i = 0; i < elements; i++ )
			randomNums[i] = ThreadLocalRandom.current().nextInt(0,elements);
		
		/*
		for(int x : randomNums)			// preSort random values.
			System.out.print(x +", ");
		System.out.println();
		*/
	
		int quick[] = Quicksort.sort(randomNums, 20);
		
		int heap[] =  Heapsort.sort(randomNums);
		
		System.out.println("Success: " +Arrays.equals(quick,heap ) );
		
		for(int x : quick)			// preSort random values.
			System.out.print(x +", ");
		System.out.println();
		
		
		for(int x : heap)			// preSort random values.
			System.out.print(x +", ");	
		System.out.println();
	
		
	}

}
