package mm223kk_assignment_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Problem_8_main {

		public static void main(String[] args) {
	
				int n = 10;																// Number of grid n x n.
				int maxOpenings = 100000;												// Max number of openings.
				int dataPoints = 1000;													// Loops for the average. 
				double sumResult = 0;													// Holding the average result.
				double pResults[] = new double[dataPoints];								// Double array holding each stick.
				int p = 0;																// Current P*.
				
				Problem_8_Percolation percolation = new Problem_8_Percolation(n);		// Get the class for Percolation with n as nxn.
		
				for( int z = 0; z < dataPoints; z++) {
		
						for(int i = 0; i < maxOpenings; i ++) {
			
								int x =  ThreadLocalRandom.current().nextInt(0, n);	 			// Random number between 0 to n-1. For column.
								int y =  ThreadLocalRandom.current().nextInt(0, n);	 			// Random number between 0 to n-1. For row.
								percolation.openSite(y, x);										// Open current row and column. (y,x)
								
								if(percolation.percolates())									// If the system percolates, then break from the loop.
										break;
		
						}
						
						int openGates =  percolation.openGates;
						double probabilty = openGates/((double)(n*n));
	
						p += openGates;															// Sum up current openings.
						pResults[z] = openGates;												// Add all results to array.
						sumResult += probabilty;												// Sum up current result.
						
						percolation.visualize();												// Visualize the run.
						generateCSV("percolation_10x10",z, openGates);							// Add result to CSV.
						//n += 10;																// Increase curernt nxn.
						percolation = new Problem_8_Percolation(n);								// Reset the system (Block all sites).		
						System.out.println();
					
				}
				
				double pMean = p/(double)dataPoints;												
				double threshold = sumResult/dataPoints;										// Calculate the threshold mean.
				System.out.println("Average P*: " +pMean);										
				System.out.println("Percolation threshold: " +threshold);						// Print the mean.
				double std = 0;
				
				// Calculate the standard deviation.
				for(int i = 0; i < dataPoints; i++)
					std += Math.pow( (pResults[i] - pMean) ,2);	
				std = Math.sqrt( std/(dataPoints-1));
				System.out.println("Standard deviation: " +std);								// Print the Standard deviation.
			
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
