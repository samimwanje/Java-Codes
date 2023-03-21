package mm223kk_assignment_3;

import java.util.concurrent.ThreadLocalRandom;

public class Problem_3_2_Vehicles {
	
	private String licenseID = "";		// License letters.
	private int licenseNumber;			// License number.
	
	/**
	 * Constructor that generates a new cars,
	 * license id letters and numbers.
	 */
	Problem_3_2_Vehicles(){
		String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for(int i = 0; i < 3; i++)
			licenseID += alfabet.charAt( ThreadLocalRandom.current().nextInt(0,alfabet.length()) );	// Generate letters.
		licenseNumber = ThreadLocalRandom.current().nextInt(100,1000);								// Generate numbers.
		
	}
	
	/**
	 * This function returns a string of the full license plate.
	 * This will be used for the hash table in Problem_1.
	 * @return	- Returns a string of the license plate.
	 */
	public String toString() {
		return licenseID+""+licenseNumber;	// Returns a 
	}
	

	public int hashCode() {
		String plate = toString();			// Get the full plate id.
		int hash = 0;						// HashCode start is default 0.	
		for(int i = 0; i < plate.length(); i++)	// Create hash code from the key.	
			hash += (i*plate.charAt(i))*plate.charAt((i+5)%6)*Math.pow(17+i%53, plate.length()-( (i+1)));	

		//  
		return hash; // Converts hash code to an index in array with modulo.
	
	}
}
