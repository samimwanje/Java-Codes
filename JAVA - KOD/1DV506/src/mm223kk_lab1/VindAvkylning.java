/* Tillägg hantering av namn som Bo ahl med if-satser. Ex...
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */




package mm223kk_lab1;

import java.util.Scanner;

public class VindAvkylning {

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);


		System.out.print( "Ange temperatur i (C): " );

// Vamtar på temperatur i celcius.

		double T = input.nextDouble ();


		System.out.print("Ange vindhastigheten i (m/s): ");

// Vantar på vindhastighet i (m/s), och konvertrar till (km/h).

		double V = input.nextDouble ( ) *3.6;

// Barknar vardet med fomeln: 13.12 + 0.6215*T - 11.37*V^{0.16} + 0.3965*T*V^{0.16}



		double twc = ( (13.12 + 0.6215 * T)  - (11.37 * Math.pow( V, 0.16 )) + ( 0.3965 * T * Math.pow( V, 0.16 ) ) );

// Avrundar vardet och anger med en decimal.

		System.out.print( "Upplevd temperatur (C): " +Math.round(twc*10)/10.0);
		
// Stang scanner.

		input. close();


	}

}
