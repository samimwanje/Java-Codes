/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */

package mm223kk_lab3;

public class FractionMain {

	public static void main(String[] args) {

		
		
		// Generar bråk... Bråken bestäms alltså här. (Täljare, Nämnare)
		
		Fraction x = new Fraction(3,1);
		
		Fraction x2 = new Fraction(-12,4);
		
		
		// To string

		System.out.println(x.toString());
		
		System.out.println(x2.toString());
		
		
		// Equal
		
		if(x.isEqualTo(x2)) {
		System.out.println("The fractions are equal.");
		}
		else
		System.out.println("The fractions are NOT equal.");	
		
		
		// Is negative?
		
		if(x2.isNegative()) { 
		System.out.println("The fraction is negative.");
		}
		else
		System.out.println("The fraction is NOT negative.");
		
		
		// Add, subtract, multiply, divide
		System.out.println();

		System.out.println(x.add(x2));
		System.out.println(x.subtract(x2));
		System.out.println(x.multiply(x2));
		System.out.println(x.divide(x2));
		
		
		
		
		
		
		
		
		
	}

}
