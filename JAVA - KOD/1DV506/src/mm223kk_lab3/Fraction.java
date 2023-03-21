/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */


package mm223kk_lab3;

import java.util.Scanner;


public class Fraction {
	
Scanner input = new Scanner(System.in); // Scanner ifall braktalet har nämnare 0.
	
private int T; // Täljare

private int N; // Nämnare

private int brakTal; // braktalet.




// Konstruktur, begär nytt tal på nämnare while nämnare = 0.

Fraction(int T1, int N1){
	
	
while( N1 == 0) {
System.err.println("Error: the denominator can't be 0");

System.out.print("\nPlease type a new denominator: ");

N1 = input.nextInt();

}


T = T1;

N = N1;
	
brakTal = T/N;
	
}


// Täljare

public int getNumerator( ) {
	
return T;
		
}



// Nämnare

public int getDenominator( ) {
	
return N;	
	
}

// Om braktalet är negativt.

public boolean isNegative( ) {
		
if(brakTal <= -1) {
return true;	
}
else 
return false;

}


// Add, subtract, divide and multiply.

public double add(Fraction x) {
	
	
return brakTal+x.brakTal;	
	
}

public double subtract(Fraction x) {
	
	
return brakTal-x.brakTal;	
	
}


public double multiply(Fraction x) {
	
	
return brakTal*x.brakTal;	
	
}

public double divide(Fraction x) {
	
	
return brakTal/x.brakTal;	
	
}


// Jämför om två braktal är lika.


public boolean isEqualTo(Fraction p) {
	
if(brakTal == p.brakTal)
return true;
else
return false;

}

// Skriver ut braktalet som en String.

public String toString() {
	
	
return +T +"/" +N;
	
	
}


}
