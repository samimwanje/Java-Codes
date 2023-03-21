/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package application;

import java.util.ArrayList;
import java.util.Collections;

public class Random extends Main {
	
	
	ArrayList<Integer> numbers; // List that hold five random numbers.
	

	public ArrayList<Integer> numbers() {
			
		
		// Generating five random numbers.
		numbers = new ArrayList<Integer>();

		for(int x = 0; x < 5; x++) {		
			numbers.add((int) ( Math.random()*( (6-1) +1) )+ 1);
		}
		
		Collections.sort(numbers); // Sorting the array before returning the numbers.
		return numbers;
		
	}
	
	
	
}
