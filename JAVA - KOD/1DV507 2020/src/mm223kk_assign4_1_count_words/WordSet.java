/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign4_1_count_words;

public interface WordSet extends Iterable<Word>   {
	
	public void add(Word word); // Add word if not already added
	   public boolean contains(Word word); // Return true if word contained
	   public int size(); // Return current set size
	   public String toString(); // Print contained wordsArray
	

}
