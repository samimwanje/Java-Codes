package mm223kk_assignment_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Assignment_1_6_c {
	

		public static void main(String[] args) {
			
			
			
			for(int words = 256; words < 1256; words += 100) {
				ArrayList<String> codes = new ArrayList<String>();
				int counter = 0;			// Collision counter.
				for(int z = 0; z < words; z++) {		
						int random = ThreadLocalRandom.current().nextInt(256);	// Generate random number
						String word = "";
						for(int x = 0; x < random; x++ )	// Generate random word.
							word += ((char) ThreadLocalRandom.current().nextInt(256));		// Generate random string
						String result = ""+hashFunction(word);	// Pass word to hash function.
						if( codes.contains(result)  )
							counter++;						// Increase collision counter.
						else 
							codes.add(result);
				}
				generateCSV("nolimitmy", words, counter);	// Generate CSV file.
			}
	
		}
		
		private static int hashFunction256(String plaintext){
			return plaintext.hashCode(); // Making sure that it is lower than 256 using modulo.
		}
	
		private static int hashFunction(String plaintext){
			int hashCode = 0;										// Initialize hash code.										
			for(int i = 0; i < plaintext.length(); i++) 
				hashCode += plaintext.charAt(i)*i*37 + i*53+(plaintext.charAt(i) % 37);			// Generating a value of the result.	
			return hashCode; // Making sure that it is lower than 256 using modulo.
		}
	
	
		private static void generateCSV(String csvName,int dataX, int y) {
				String path = "src\\mm223kk_assignment_1\\" +csvName  +".csv";			// Path where the csv file will be located.
				String data = dataX +","+y;
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));
					writer.write(data+"\n");											// Append the latest result to csv file.
					writer.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	
}
