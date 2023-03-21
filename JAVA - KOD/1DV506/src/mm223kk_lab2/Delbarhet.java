/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */




package mm223kk_lab2;

	import java.util.Scanner;


public class Delbarhet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
// En "counter" för mellanrummen senare.
		
		int count = 0;
		
// Lägger börjar räkna fråna 101 till 102
		
		for(int i = 0; i < 100; i++) {
			
		int number = 101 + i;
		
// Sparade siffra i number kontrolleras om delbar med fyra men inte fem.
		
		if(number % 4 == 0 && number % 5!= 0) {
			
			
		count ++;
		System.out.print(" " +number);
			
		}
		
// Sparade siffra i number kontrolleras om delbar med fem men inte fyra.
		
		if(number % 5 == 0 && number % 4!= 0) {
			
			count ++;
			System.out.print(" " +number);
		}
			
// Counter har ökat värde för varje siffra som uppfyllde villkoren, när counter är 10 börjar den om och hoppar rad.
		
		
		if(count >= 10) {
			
			System.out.println();
			
		    count = 0;
		    
			}
		
		
		}
			
		
		input.close();

			
	}
			
}
		
	

	

