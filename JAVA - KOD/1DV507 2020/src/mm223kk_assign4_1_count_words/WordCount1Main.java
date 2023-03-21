/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign4_1_count_words;


import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.File;



public class WordCount1Main {
	


	public static void main(String[] args) {
		
		// Create new hash and treeSet.
		HashSet<Word> wordsHash = new HashSet<Word>();
		TreeSet<Word> wordsTree = new TreeSet<Word>();

		try {
		
		Scanner file = new Scanner(new File("src/mm223kk_assign4_1_count_words/words.txt"));
		while(file.hasNext()) {																		// Scan file for words.
		Word word = new Word(file.next());															
		wordsHash.add(word);																		// Add to hashSet.
		wordsTree.add(word);																		// Add to treeSet.
		}}catch (Exception e) {																		// If error occur.
			
			System.out.print("File not found");
		}
			
			
		//The value is a bit bigger For some reason some words comes two times. I expect that it has something to do with the UTF...Style...
		System.out.println(wordsHash);															
		System.out.println(wordsTree);
		System.out.println("Words found in hash: " +wordsHash.size());
		System.out.println("Words found in tree: " +wordsHash.size());
		

	}

}
