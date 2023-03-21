/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */

package mm223kk_assign4_1_count_words;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;

public class IdentyfyWordsMain {
	
	
	public static void main(String[] args) {

		String text = null;									// String for text.
		HashSet<String> words = new HashSet<String>();		// Create new HashSet holding strings.
		PrintWriter newFile = null;							// Create PrintWriter Object.
		
		try {	
			text = new String(Files.readAllBytes(Paths.get("src/mm223kk_assign4_1_count_words/HistoryOfProgramming.txt")));  // Add file containets in text-string-object.
		} catch (Exception e) {																							// If error occur
			System.out.println("Error reading file.");
		}
		
	
		
		
		text = text.replaceAll("[^a-zA-Z \\n ]+", "");
		String[] textSplit = text.split("[\\n ]+");
		
		try {
			
			
			newFile = new PrintWriter("src/mm223kk_assign4_1_count_words/words.txt");
			}
			catch(FileNotFoundException  e ){	
				System.out.println("Error creating wordsArray-file."); // If fail.
			}
		
		
		
		for(String t : textSplit)
		words.add(t);
		
		
		System.out.print(text);
		
		newFile.print(text);
		
		newFile.close();
		
		
	}

}
