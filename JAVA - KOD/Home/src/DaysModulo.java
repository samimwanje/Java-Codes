	import java.util.Scanner;
	
public class DaysModulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		// Dag i siffror?
		
		System.out.print("Please type in what day of the week it is in numbers: ");
		
		
		
		int weekDay = input.nextInt();
		
		// Dagar efter idag i siffror?
		
		System.out.print("\nPlease type in how many days from today: ");
		
		int days = input.nextInt();
		
		// Berakna svaret med modulo, gar 7 dagar po en vecka.
		
		int answer = (weekDay + days) % 7;
		
		// Om svaret med modulo x+y = 7 = > skriv 7 efter svaret annars procced.
	
		if( answer == 0) {
		
		System.out.print("\nThe day of the week in " +days +" days from today days will be: " +7);
		
		}
		
		else {
			System.out.print("\nThe day of the week in " +days +" days from today days will be: " +answer);
		
		
		input. close();
		
	   }
	}

}
