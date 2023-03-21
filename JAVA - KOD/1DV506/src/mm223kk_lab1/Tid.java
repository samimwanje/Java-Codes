/* Tillägg hantering av namn som Bo ahl med if-satser. Ex...
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */




package mm223kk_lab1;


	import java.util.Scanner;

public class Tid {

	public static void main(String[] args) {
		
		
		// Aktivera avlasning av keyboard.
		
		Scanner input = new Scanner(System.in);
		
		// Eko ange tid i sec.
		
		System.out.print("Ange tid i sekunder: ");
		
		double userSeconds = input.nextDouble();
		
		// Tar ut sec på en "60-punktersklocka"
		
		double clockSeconds = userSeconds % 60;
		
		// Tar ut min på en "60-punktersklocka" dividerar aven instatta tid med 60 for min.

		
		double clockMin = ( userSeconds/60 ) % 60;
		
		// Tar ut h på en "60-punktersklocka" dividerar aven instatta tid med 3600 for omvandling till h.

		double clockHour = ( userSeconds/3600 ) % 60;
		
		
		
		// Resultat notera (int) for att skippa decimaler. Redan angivna.
		System.out.println("Sekunderna du angav motsvarar: " +(int)clockHour +" timmar, " +(int)clockMin +" minuter och " +(int)clockSeconds +" sekunder." );

		// Stang lasning.
		input. close();
		
		

	}

}
