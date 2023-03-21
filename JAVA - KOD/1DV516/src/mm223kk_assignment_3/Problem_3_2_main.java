/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 23/10/2022
 */
package mm223kk_assignment_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Problem_3_2_main {

	public static void main(String[] args) {

		Problem_3_1_Quadratic hashTable = new Problem_3_1_Quadratic();
		
		// Create 0 to 9000 license plates, and count amount of collisions occurred.
		for( int x = 0; x <  90000; x += 10000) {

			for(int i = 0; i < x; i++ )
				hashTable.insert( new Problem_3_2_Vehicles() );
				
			// Load x as amount of cars, and y as collisions occurred in CSV-file Collions_3_2.
			generateCSV("Collisions_3_2",x, hashTable.collisions());
			
			// Load x as amount of cars, and y as QuadIterations occurred in CSV-file QuadIterations_3_2.
			generateCSV("QuadIterations_3_2_0.5",x, hashTable.quadIterations());		// Change name of "0.5" to create a file.
	
		}

		hashTable.print();		// Print snippet of hash table.
			
	}
	
	
	private static void generateCSV(String csvName,int dataX, long dataY) {
		
		 String path = "src\\mm223kk_assignment_3_2\\" +csvName  +".csv";			// Path where the csv file will be located.
		 String data = dataX +","+dataY;
		 
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));
			writer.write(data+"\n");											// Append the latest result to csv file.
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
