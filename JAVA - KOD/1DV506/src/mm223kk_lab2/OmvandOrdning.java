/*
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */


package mm223kk_lab2;

	import java.util.ArrayList;

	import java.util.Scanner;

	public class OmvandOrdning {

	public static void main(String[] args) {
		
		
	// Scanner och ArrayList objekt.

		
	Scanner input = new Scanner(System.in);
	
	ArrayList<Integer> numArray = new ArrayList<Integer>();
	
	
	// Vilket tal som printas ut...
	
	int n = 1;
	
	
	// Ber om inmatning av tal.
		
	System.out.println("Mata in positiva heltal. Avsluta med ett negativt.");


	// Skapar en array. Ny position för varje inmatade tal. 
	
	System.out.print("Tal " +n +": ");

	
	int heltal = input.nextInt();
		
	while(heltal > 0) {
		
	numArray.add(heltal);
	
	n++;
		
	System.out.print("\nTal " +n +": ");
					
	heltal = input.nextInt();
	
	}
	
	// Printar ut antal positiva inmatade tal.
			
	System.out.println("\nAntal positiva: " +numArray.size());
	
	// Läser in och skriver ut arrayn baklänges.
	
	System.out.print("Baklänges: ");
	

	for(int y = numArray.size()-1; y >= 0; y--) {
		
	System.out.print(numArray.get(y));
	
	// För bortagning av sista kommatecknet.
	
	if(y > 0)
	System.out.print(", ");	
		
	}
		

	input.close();				

		
	}
			
					
}
