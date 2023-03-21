
import java.util.Arrays;

public class Arrs {
	
	
	static int[] numberArray = new int[10];
	
	static int[] randomArray = new int [20];

	public static void main(String[] args) {


		
	
	
	
	randomArray[1]= 2;
	
	String [] stringArray = {"just", "random", "words" };
	
	for(int i = 0; i < numberArray.length; i++) {
		
	numberArray[i] = i;

	}
	
	printBox();
	
	
	multiArray();
	
	
	
	
	
	
	
	
		
}
	
	
	
	
	
	
	// PrintBox method.
	
		private static void printBox() {
		
		int k = 1;
		
		while(k <= 61) {
		System.out.print(('-')); k++;
		}
				
		System.out.println();
		
		
		for(int j = 0; j < numberArray.length; j++) {
			
		System.out.print("|" +j +" ");
			
		}
		
		System.out.print("|");
		
}
	
	
	
	
	// MultiArray 
		
		
		private static void multiArray() {
			
		String[][] multiArray = new String[10][10];
		
		
		for(int i = 0; i < multiArray.length; i++ ) {
			
			
		// Längden på arrayen. (Y-LED).
			
		for(int j = 0; j < multiArray[i].length; j++) {
			
			
		multiArray[i][j] = i +" "+j;
			
			
		}
			
	}
			
			
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
