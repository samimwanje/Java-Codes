/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign3_3_pascalRow;

import java.util.Scanner;

public class PascalMain {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter rows of the pascal triangle you want to print: ");		// Ask user  to enter number for rows.
		int rows = input.nextInt();
		
		System.out.println();
	
		// Ignore this whole for-loop and use the method pascalRow(x) for only one row array. x = Row.
		for(int x = 0; x <= rows-1; x++) {					
		for(int space = rows-1; space > x; space--) {
			System.out.print(" ");
		}
		for(int array: pascalRow(x) )
			System.out.print(array +" ");
		System.out.println();
		}
		
		input.close();
	}
		
	
	
	/**
	 * This method achieve an integer (n) and returns an with the row of Pascal's triangle.
	 * It uses the main rule: CurrentRow-array[i-1] + CurrenRow-array[i] = nextRow[i]
	 * @param n integer that is used for initializing the row that will be printed.
	 * @return an array of the row that the user wanted to print.
	 */
	private static int[] pascalRow(int n) {
			
		if(n ==  0) {											// If the searched row is row 0.
			
		int array[] = new int[n+1]; 							// Create a new array with one element.
		array[n] = 1;											// Set the only element to 1.
		return array;											// Return the array.
		} else{													// If n is not equal to 1.
		
		int[] previousRow = pascalRow(n - 1);										// Re-run the method with n-1 and set the array to the return value.
		
		int[] arrayNext = new int[previousRow.length + 1]; 							// Create a new array that have the length of the previous row +1.
		arrayNext[0] = 1;															// Set the first element to 1.
			arrayNext[previousRow.length] = 1;										// Set the last element to 1.
				
			// This is the main rule for a Pascal triangle. CurrentRow-array[i-1] + CurrenRow-array[i] = nextRow[i]
				for(int i = 1; i < previousRow.length; i++)							// 	Go from index one to the next last element in the array.
						arrayNext[i] = previousRow[i-1] + previousRow[i];			// Set element arrayNex[i] =  CurrentRow-array[i-1] + CurrenRow-array[i] = nextRow[i]
		
		
		int[] currentRow = arrayNext;												//	Run the method pascalRowNext() with the newly generated array from pascalRow(n-1).
		return currentRow; 															// Returns the searched row after it has been generated.
			}
		}
}