package mm223kk_assignment_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Assignment_1_6_a {

		public static void main(String[] args) {	
			uniformity();
			//oneBit();
			
		}
	

		private static void oneBit() {
			int counter = 0;			// Collision counter.
			int arr[] = new int[256];		// New array with x random words.
			for(int i = 0; i < 1000; i ++) {
					char randomChar = ((char) ThreadLocalRandom.current().nextInt(200));		// Generate random char
					StringBuilder sb = new StringBuilder("HELLO WORLD");
					sb.setCharAt(ThreadLocalRandom.current().nextInt(sb.length()), randomChar);
					String newString = sb.toString();
					System.out.println(newString);
					int result = hashFunction(newString);
					if( (arr[result] == result))
						counter++;						// Increase collision counter.
					else 
						arr[result] = result;
					generateCSV("onebit", i, counter);
			}	
		}

		private static void uniformity() {
				for(int words = 256; words < 1256; words += 100) {
					int counter = 0;			// Collision counter.
					int arr[] = new int[256];		// New array with x random words.
					for(int z = 0; z < words; z++) {		
							int random = ThreadLocalRandom.current().nextInt(256);	// Generate random number
							String word = "";
							for(int x = 0; x < random; x++ )	// Generate random word.
								word += ((char) ThreadLocalRandom.current().nextInt(256));		// Generate random string
							int result = hashFunction(word);	// Pass word to hash function.
							if( (arr[result] == result))
								counter++;						// Increase collision counter.
							else 
								arr[result] = result;
					}
					generateCSV("words", words, counter);	// Generate CSV file.
				}
		}
	
	
		private static int hashFunction(String plaintext){
			int hashCode = 0;										// Initialize hash code.										
			for(int i = 0; i < plaintext.length(); i++) 
				hashCode += plaintext.charAt(i)*i*37 + i*53+(plaintext.charAt(i) % 37);			// Generating a value of the result.
			
			return hashCode % 256; // Making sure that it is lower than 256 using modulo.
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
