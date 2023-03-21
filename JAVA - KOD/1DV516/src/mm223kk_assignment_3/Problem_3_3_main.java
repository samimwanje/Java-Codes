/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 02/11/2022
 */
package mm223kk_assignment_3;

public class Problem_3_3_main {

	public static void main(String[] args) {
		Problem_3_3_Insertsort Insertsort = new Problem_3_3_Insertsort();

		// Initializing some random integer sets  for validation.
		int numbers1[] = Insertsort.sort(new int[]{1,4,8,2,5,9,3,7,6});	// Set from lecture.
		int numbers2[] = Insertsort.sort(new int[]{1, 17, 12, 20, 10, 15, 16, 5, 13, 7});	
		int numbers3[] = Insertsort.sort(new int[]{9, 13, 17, 6, 7, 3, 15, 10, 16, 11});
		int numbers4[] = Insertsort.sort(new int[]{97, 33, 90, 52, 28, 17, 44, 46, 67, 32});
		// Add generated random integer sets to array.
		int sortedSets[][] = {numbers1,numbers2,numbers3,numbers4};
		
		
		for(int i = 0; i < sortedSets.length; i++) { // Loop through the set array.
			System.out.print("Numbers"+(i+1) +": [ ");
			for(int x = 0; x < sortedSets[i].length; x++ )	// Loop through numbers in sorted set.
				System.out.print(sortedSets[i][x]+", ");	// Print current index value.
			System.out.println(" ]");
		}

	}

}
