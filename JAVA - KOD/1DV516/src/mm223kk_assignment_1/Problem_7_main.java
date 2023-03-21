package mm223kk_assignment_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Problem_7_main {

	public static void main(String[] args) {

		int loops = 10;										// Loops for each list size. Used to get an average for each run.
		Problem_3_Timeit timeit = new Problem_3_Timeit();	// Get timeit class so we can run the functions in it.

		for(int unions = 100000; unions < 1000000; unions += 100000  ) {
				
				Problem_5_UnionFind unionFind = new Problem_5_UnionFind(unions);			// Get Union Find.
				Problem_6_quickUnion quickUnionFind = new Problem_6_quickUnion(unions);	// Get Union Find.
				int currentUnions = unions;
				
				
				int  xy[][] =  new int[unions][2];											// Array holding the random pairs. Same size as unions.
				for(int z = 0; z < unions; z++) {											// Array with twice as many elements as unions. To prevent duplicates.
					
					int x =  ThreadLocalRandom.current().nextInt(0, unions);	 			// Random number between 0 to Uinions.
					int y =  ThreadLocalRandom.current().nextInt(0, unions);	 			// Random number between 0 to Uinions.
					
					xy[z][0] = x;																// Set x- value.
					xy[z][1] = y;																// Set y- value.
					
					//System.out.println("X: "+x +" Y: "+y);
				}
				
				
				generateCSV("unionFind100k",unions, timeit.timeit(() -> {						// Run and time the union method.
					
					for(int i = 0; i < currentUnions; i++) 
							if( !unionFind.connected(xy[i][0], xy[i][1]) )	// Check if they are already connected.
								unionFind.union(xy[i][0],xy[i][1]);		// Union 1 with 2.
					
				}, loops));
				
						
				generateCSV("unionFind_q100k",unions, timeit.timeit(() -> {							// Run and time the union method.
					
					for(int i = 0; i < currentUnions; i++) 
							if( !quickUnionFind.connected(xy[i][0], xy[i][1]) )	// Check if they are already connected.
								quickUnionFind.union(xy[i][0],xy[i][1]);		// Union 1 with 2.
				
				}, loops));
		}
}


		private static void generateCSV(String csvName,int dataX, double dataY) {
		
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