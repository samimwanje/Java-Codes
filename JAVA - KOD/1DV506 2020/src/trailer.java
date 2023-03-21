
import java.util.Scanner;


public class trailer {

	public static void main(String[] args) {
		
		
		
		
		Scanner input = new Scanner(System.in);
		
		int number = 0;
		
		int score;
		
		int average = 0;
		
		while(number < 5) {
			
		System.out.print("Please enter your score: ");
			
		score = input.nextInt();	
			number ++;
			average += score;	
		}
				
		System.out.println("Average score is: " +average/number);
	
			input.close();		
		
	}
}
