	import java.util.Scanner;


public class DisplayTimeModulo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please type in your time in seconds: ");
		
		int myTime = input.nextInt();
		
		int minutes = (myTime)/60;
		
		int seconds = (myTime % 60);
		
		if(seconds == 0) {
			
			
		System.out.print("\nThe time is " +minutes +" minutes");
		
		}
		
		else {
		System.out.print("\nThe time is " +minutes +" minutes and " +seconds +" seconds");
		
		input. close();
			
		}

		System.out.println(-7 % -3);
	}

}
