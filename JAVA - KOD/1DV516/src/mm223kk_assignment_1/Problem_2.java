package mm223kk_assignment_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_2 {

	public static void main(String[] args) {
		// Load list and print result.
		threesum(new ArrayList<Integer>( Arrays.asList(2,-2,0,2,1)) ).forEach((Integer[] value) -> System.out.print(Arrays.toString(value) +" "));

	}
	
	
	private static ArrayList<Integer[]> threesum(ArrayList<Integer> numbers) {
		
		ArrayList<Integer[]> result = new ArrayList<Integer[]>();
		
		for( int x = 0; x < numbers.size(); x++) 
			for(int y = x+1; y < numbers.size(); y++) 
				for(int z = y+1; z < numbers.size(); z++) 
					if( ( numbers.get(x) + numbers.get(y) + numbers.get(z) ) == 0) 					// Check if sum is equal to zero.
						result.add(new Integer[] {numbers.get(x),numbers.get(y),numbers.get(z)});	// Append sum to result list.
					
				
		return result;																				// Return result list.								
	}
}
