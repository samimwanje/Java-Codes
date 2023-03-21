package mm223kk_assignment_1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Problem_4_main {
	
	
		public static void main(String[] args) {
			
					int loops = 10;	// Loops for each list size. Used to get an average for each run.
					Problem_3_Timeit timeit = new Problem_3_Timeit();	// Get timeit class so we can run the functions in it.

					
					for(int legnth = 0; legnth <= 2000; legnth += 100  ) {
						
							ArrayList<Integer> numbers = generateList(legnth);			 // Generate array with length random integers.
							generateCSV("3sum",legnth, timeit.timeit(() -> {
								
								ArrayList<Integer[]> result = new ArrayList<Integer[]>();
								for( int x = 0; x < numbers.size(); x++) 
									for(int y = 0; y < numbers.size(); y++) 
										for(int z = 0; z < numbers.size(); z++) {
											
											if( x == y || x == z || y == z )												// Check if current x,y and z are equal.
												continue;																	// Exit current index.
											if( ( numbers.get(x) + numbers.get(y) + numbers.get(z) ) == 0) 					// Check if sum is equal to zero.
												result.add(new Integer[] {numbers.get(x),numbers.get(y),numbers.get(z)});	// Append sum to result list.
											
										}
						
							}, loops)+"");
							
							
							// Generate CSV for the 3sum <  upper boundary.
							generateCSV("3sum_si",legnth, +timeit.timeit(() -> {
								
								ArrayList<Integer[]> result = new ArrayList<Integer[]>();
								for( int x = 0; x < numbers.size(); x++) 
									for(int y = x+1; y < numbers.size(); y++) 
										for(int z = y+1; z < numbers.size(); z++) 
											if( ( numbers.get(x) + numbers.get(y) + numbers.get(z) ) == 0) 					// Check if sum is equal to zero.
												result.add(new Integer[] {numbers.get(x),numbers.get(y),numbers.get(z)});	// Append sum to result list.
								
							}, loops)+"");
					
					}
	
		}
		
		
		private static ArrayList<Integer>  generateList(int elements) {

			ArrayList<Integer> numbers = new ArrayList<Integer>();	
			for(int x = 0; x < elements; x++)
				numbers.add( ThreadLocalRandom.current().nextInt(-1000000, 1000000 + 1) );	 		// Random number between -1000000 to 1000000.

			return numbers;
		}
		
		private static void generateCSV(String csvName,int dataX, String dataY) {
			
			 String path = "src\\mm223kk_assignment_1\\" +csvName  +".csv";			// Path where the csv file will be located.
			 String data = dataX +","+dataY;
			 
			 
			try {
				
				BufferedWriter writer = new BufferedWriter(new FileWriter(path,true)); 
				writer.append(data+"\n");											// Append the latest result to csv file.
				writer.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
}

