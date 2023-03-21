/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */



package mm223kk_lab3;

import java.util.Scanner;


public class Pnr {
	
   // Main.

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Ange ett personnummer i formen ÅÅMMDD-NNNN: ");
	
	String Pnum = input.nextLine();
	
	
	// 2.1
	
	System.out.println( "First part: " +getFirstPart(Pnum) );
	
	System.out.println( "Second part: " +getSecondPart(Pnum) );
	
	// 2.2
	
	System.out.println( "Female person number: " +isFemaleNumer(Pnum) );

	
	// 2.3
	
	System.out.print("Ange två personnummer i formen ÅÅMMDD-NNNN: ");
	
	System.out.print("\nPersonnummer1: ");
	
	String Pnum1 = input.nextLine();
	
	System.out.print("\nPersonnummer2: ");
	
	String Pnum2 = input.nextLine();
	
	System.out.println( "Personnumer 1 och 2 lika: " +areEqual(Pnum1, Pnum2) );
	
	input.close();

	
	
	}
	
	
	
	///1. First part. Skirver ut första delen av personnummer.

	
	private static String getFirstPart(String pnr) {
		
		
	String Firstp = "";
		
	for(int i = 0; i < pnr.length()-5; i++) {
		
	Firstp += pnr.charAt(i);
	
		
	}

		return Firstp;
}
	
	
	

	
	///1. Second part. Skriver ut andra delev av personnummer.

	
	private static String getSecondPart(String pnr) {
		 
		
	String Secondp = "";
		
	for(int i = 7; i < pnr.length(); i++) {
		
	Secondp += pnr.charAt(i);
	
	
		
	}

		return Secondp;
}
	


	
	///2. Kvinnligt personummer??
	
	private static boolean isFemaleNumer(String pnr) {
		
		
		if(pnr.charAt(9) % 2 == 0)
		return true;
		
		else 
		return false;
		
	}
	
	
	/// 3. Are Equal.. Tar in två strängar och kontrollerar om dessa är desamma.
	
	private static boolean areEqual(String pnr1, String pnr2 ) {
		
	
	if(pnr1 == pnr2)
	
	return true;
	
	else
	
	return false;
	}
	

	
}
