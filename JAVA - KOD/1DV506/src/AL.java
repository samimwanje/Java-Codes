
import java.util.ArrayList;
import java.util.Scanner;

public class AL {

	static Scanner input = new Scanner(System.in);

	static ArrayList<Integer> array = new ArrayList<Integer>();

	
	
public static void main(String[]args) {
	
	System.out.print("Please enter an array of numbers, type in 0 when finished!: ");
	
	
	int in = input.nextInt();
	
	
	while(in != 0) {
		
	array.add(in);
	
	in = input.nextInt();
	
	}
	
	
	deleteArray();

	printArray();
	
	
	}

	private static void deleteArray() {
		
	System.out.print("What number would you like to delete?");
	int del = input.nextInt();	
	
	
	for(int i = 0; i < array.size(); i++) {
		
	if(array.get(i) == del) {
		
	array.remove(i);
	
	break;
	
	}
		
	}
	
		
}

	private static void printArray() {
	
	
	System.out.println("-------------------------------------");
	
	for(int i : array) {
		
	System.out.println(" lol");

		
	System.out.println(i);
	}

	}


}
