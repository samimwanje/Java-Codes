/* Tillägg hantering av namn som Bo ahl med if-satser. Ex...
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */




package mm223kk_lab1;


import java.util.Scanner;

public class VaxelPengar {

	public static void main(String[] args) {
		
		

		
		Scanner input = new Scanner(System.in);
		
// Eko ange kostanden.
		
		System.out.print("Ange kostnaden: ");
		
		double kostand = input.nextDouble();
		
// Eko kunden betalde.
		
		System.out.print("\nAnge erhallet belepp: ");
		
		double betalar = input.nextDouble();
		
// Eko kunden får tillbaka...
		
		double tillbaka = Math.round( betalar - kostand );
		
		System.out.println( "\nTillbaka: " +(int)tillbaka +" kronor"  );

		
		
			
// Kontrollerar hur mycket det blir kvar dividerat på nuvarande potentiel sedel/mynt... större än 1 => 1 mindre än 1 => 0.
		
		// 1000 
		
		
		System.out.println( "1000-lapp:" +(int)((tillbaka / 1000)) );
				
	
		// 500 
		
		
		System.out.println( "500-lapp: " +(int)((tillbaka % 1000 / 500) ) );
		
		
		// 200 
		
		System.out.println( "200-lapp: " +(int)(tillbaka % 1000 % 500 / 200) );
		
		// 100 
		
		System.out.println( "100-lapp: " +(int)(tillbaka % 1000 % 500 % 200 / 100) );
				
				
		// 50 
				
		System.out.println( "50-lapp: " +(int)(tillbaka % 1000 % 500 % 200 % 100 / 50)  );
		
				
		// 20 
				
		System.out.println( "20-lapp: " +(int)(tillbaka % 1000 % 500 % 200 % 100 % 50 / 20) );
				
				
				
		// 10 
				
		System.out.println( "10 krona: " +(int)(tillbaka % 1000 % 500 % 200 % 100 % 50 % 20 / 10) );
				
				
		// 5 
				
		System.out.println( "5 krona: " +(int)(tillbaka % 1000 % 500 % 200 % 100 % 50 % 20 % 10 / 5) );
				
				
		// 2 
				
		System.out.println( "2 krona: " +(int)(tillbaka % 1000 % 500 % 200 % 100 % 50 % 20 % 10 % 5 / 2) );
		
		
		// 1 
		
		System.out.println( "1 krona: " +(int)( tillbaka % 1000 % 500 % 200 % 100 % 50 % 20 % 10 % 5 / 2) );
		
		
		input. close();
	}

}
