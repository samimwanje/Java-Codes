package problemB;

import java.util.Scanner;			// Used to 
import java.util.Arrays;			// Used to sort.

public class ProblemB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		// Used to read from the users input.

		
		int busses = input.nextInt();
		
		String busRep = "";						// String holding 		
			
		int busNumbers[] = new int[busses];
		
		for(int i = 0; i < busses; i++) {
			
			busNumbers[i] = input.nextInt();
			
		}
		
		Arrays.sort(busNumbers);				// Sort all the bus numbers. && ( busNumbers[i] == busNumbers[i+2]-2 )
		
		//6
		//180 141 174 143 142 175

		for(int i = 0; i < busses; i++) {
			
					
					if( ( i < busses-2 ) &&   ( busNumbers[i] == busNumbers[i+2]-2 )  ) {	// Check if a number sequence is exists.
								
							int start = busNumbers[i];			// Save number on current index.
							busRep += start;						// Add to a shorted out print.
							busRep += "-";							// Used to save space.
											
							int sequences = 1;						// Check how many sequences that are found.	
							
							while( ( (i + sequences) < busses) && start == busNumbers[i+sequences]-sequences ) {	// Read how many times the sequences appear.
								sequences++;
							}
						
							busRep += busNumbers[i+sequences-1];				// Add the last number of sequences to output string.
								
							i += sequences-1;								// Go to next index after sequence.
				}else {
			
					busRep += busNumbers[i];		// Sequence is not found, just print out the number.
							
				}
				busRep += " ";
		}	
		
		System.out.println(busRep);
		
		input.close();		// Close scanner
		System.exit(0);		// Exit system.
	}

}
