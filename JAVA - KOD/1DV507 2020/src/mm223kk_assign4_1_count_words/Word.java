/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign4_1_count_words;

public class Word implements Comparable<Word> {
	
	
	
	 String word;

	   public Word(String str) {    
		   word = str;	   
	   }
	   
	  
	   
	   public String toString() { return word; }

	   /* Override Object methods */
	   public int hashCode() {
		   return word.toLowerCase().hashCode();		   
		   }
		
	   // Generate a hashcode.
	   public boolean equals(Object other) {
		return word.hashCode() == other.hashCode();  
		}
	   
	  

	@Override
	// Compare words.
	public int compareTo(Word o) {
		return word.toLowerCase().compareTo(o.word.toLowerCase());
	
	}
	
	
}
