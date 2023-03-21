/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign2_2_FunctionPoinsters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author mm223kk
 *
 */
public class FunctionPointers {

	public static void main(String[] args) {
		System.out.println("Part 1: Apply predicates");
		List<Integer> list = Arrays.asList(45, 3, 24, 16, 1, 1, 3, 8, 7, 6, 10, 12, 17, 22, 30);

		System.out.print("Print all numbers: ");
		Predicate<Integer> all = n -> true;
		selectAndPrint(list, all);                // Return true.

		System.out.print("\nPrint all odd numbers: ");
		Predicate<Integer> odd = n -> n % 2 != 0;      // If odd number return true.
		selectAndPrint(list, odd);

		System.out.print("\nPrint all numbers greater than 10: ");
		Predicate<Integer> aboveTen = n -> n > 10;   // If number greater then 10, return true.
		selectAndPrint(list, aboveTen);

		System.out.println("\n\nPart 2: Apply functions");
		List<Double> numbers = Arrays.asList(1.0, 16.0, 25.0, 81.0);
		System.out.println("Original: "+numbers);
		System.out.println("Square root: "+applyFunction(numbers, Math::sqrt));
		System.out.println("Power of two: " + applyFunction(numbers, FunctionPointers::powerOfTwo));
	}


	// Prints all elements in the list where predicate evaluates to true
	public static void selectAndPrint(List<Integer> list, Predicate<Integer> predicate) {

		for(int i = 0; i < list.size(); i++) {	// Checks if elements meets conditions in the lamba expression.
		
		if(predicate.test(list.get(i)))			// Elements that meet the condition will get printed.				
		System.out.print(list.get(i) +" ");
	
		}	 
	}


	// Returns a new list containing the numbers resulting from applying fx 
	// on the input list numbers
	private static List<Double> applyFunction(List<Double> numbers, Function<Double, Double> fx) {
		
		ArrayList<Double> newList = new ArrayList<Double>();			//Creates new list that holds the "modified" elements.

		for(int i = 0; i < numbers.size(); i++) {						//Goes through every element the list.
			newList.add( fx.apply( numbers.get(i) ));					// Applies chosen function for each element.
		}
			
		return newList;													// Return a new "modified" list.
	}
	
	
	
	
		// If the function powerOfTwo is called.
	private static Double powerOfTwo(Double d) {
		return Math.pow(d,2);    // Return double of element "d^2".
	}
}
