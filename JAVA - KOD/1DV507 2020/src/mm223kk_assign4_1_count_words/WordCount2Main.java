/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign4_1_count_words;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;


public class WordCount2Main {

	public static void main(String[] args) {
		
		HashWordSet hashSet = new HashWordSet();											// Create new hashSet object.
		TreeWordSet treeSet = new  TreeWordSet();											// Create new treeWord set object.
		Scanner file = null;																// Used to read file.

		try {
		
		 file = new Scanner(new File("src/mm223kk_assign4_1_count_words/words.txt")); 			// Read file.

		}catch (Exception e) {
				System.out.print("File not found");												// If file not found.
		}
		
		
		while(file.hasNext()) {																	// Scan through each word in file and add to HashSet and TreeSet.
			Word word = new Word(file.next());
			hashSet.add(word);
			treeSet.add( word);
				}	
				
			
				System.out.println("A view of the Tree: " +treeSet);													// Print out view of the tree.
				System.out.println("Word already exist: " +treeSet.contains(new Word("also") ));						// Check if the word computer exist.
				System.out.println("Word already exist: " +treeSet.contains(new Word("Sami") ));						// Check if the word computer exist.
				System.out.println("Size of the tree: " +treeSet.size() );												// Print the treeSett size.
				
				
				Iterator<?> iterator = treeSet.iterator();																	// Create new iterator.
				
				System.out.print("A view from the treeSet iterator: ");													// Text...
				 
				while(iterator.hasNext()) {																					// Check for more elements in the array.
					System.out.print(iterator.next() +" ");}
		
				System.out.println("\n\n-------------------------------------------------------hashSet:\n");		// Print the hashSet in  a string.
				System.out.println("A view of the hashSet: " +hashSet);													// Print out view of the hashSet.
				System.out.println("Word already exist: " +hashSet.contains(new Word("also") ));						// Check if the word computer exist.
				System.out.println("Word already exist: " +hashSet.contains(new Word("Sami") ));						// Check if the word computer exist.
				System.out.println("Size of the hashSet: " +hashSet.size() );											// Print the treeSett size.
				
				
				Iterator<?> iterator2 = hashSet.iterator();																// Create new iterator.
				
				System.out.print("A view from the hashSet iterator: ");													// Text...
				 
				while(iterator2.hasNext()) { 																			// The hashSet size is a bit off. Can't locate the problem...
					System.out.print(iterator2.next() +" ");}
	
		
		}

}
