/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign3_1_printReverse;

public class PrintRecusive {
	
	

	public void print(String str, int i) {
		
		if( i <=  str.length()-1 ) {									 //Check if i is NOT equal to the next last index.
		System.out.print(str.charAt(i));								// Print current element that is equal to i.
		print(str,++i);													// Increase the value of i with 1, and then rerun the print() with i+1.
		}
		
	}
		

	public void printReverse(String str, int i) {

			
			if( i <= str.length()-1 ) { 							 //Check if i is NOT equal to the next last index.
				System.out.print(str.charAt(str.length()-1 -i ));	// Print char at "the end of the string - i "
				printReverse(str,++i);								// 	Increase the value of i with 1, and rerun method with  i+1.
					}
			
	}

}