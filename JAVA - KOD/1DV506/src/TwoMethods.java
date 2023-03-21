
	import java.util.ArrayList;
	
	import java.util.Scanner;

	public class TwoMethods {
		
		
		
		
		
		
		
		
		
		
		
		

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	
	
	// Check for double...

	int numbers [] = {2,3,4,5,2}; 
		
	System.out.println(hasDuplicates(numbers));
		
	
	// Array to in array.
	
	ArrayList<Double> test = new ArrayList<Double>();
	
	// Type in numbers
	
	System.out.print("Add numbers to the list, type 0 when done: ");
	
	double number = input.nextDouble();
	
	while(number != 0) {
		
	test.add(number);
		
	number = input.nextDouble();

	
	}
	
	
	// Print out the array
	
	for(int i : roundOff(test)) {
		
	System.out.println(i);
		
	}
	
	
	input.close();
		
	}
	
	
	
	
	// Double method.
	
	private static boolean hasDuplicates(int [] arr) {

	int n = 0;
		
	for( int i = 0; i < arr.length; i++ ) {
		
		
	for(int y = arr.length-1; y > i; y--) {
		
	if(arr[i] == arr[y])
		
	n++;

	}
	
	
	}
	
	if(n > 0) 
	return true;
	else	
	return false;
	}
	



	
	// ArrayList to int Method.

	private static ArrayList<Integer> roundOff(ArrayList<Double> input){
		
	ArrayList<Integer> newList = new ArrayList<Integer>();
	
	
	for(double i : input) {
		
		
	newList.add((int)Math.round(i));	
		
	}
	
	return newList;
	
	}
	

	
}

