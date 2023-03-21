/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */

package mm223kk_assign3_6_SortingAlgorithms;


public class SortingMain {

	public static void main(String[] args) {

		SortingAlgorithms sorter = new SortingAlgorithms();
		
		
		
		 String[] unsortedString = {"4", "9", "7", "8", "8", "3", "5", "1", "6"}; 
		

		
		int[] unsortedInt = {5,1,4,3};										// An unsorted array.
		
		unsortedInt = sorter.insertionSort(unsortedInt);
	
		unsortedString = sorter.insertionSort(unsortedString, (String s1,String s2) -> s1.compareTo(s2));
			
		
		for(int t : unsortedInt)
		System.out.print(t);
		
		System.out.println();
		
		for(String t : unsortedString)
		System.out.print(t + " ");
		

	}

}
