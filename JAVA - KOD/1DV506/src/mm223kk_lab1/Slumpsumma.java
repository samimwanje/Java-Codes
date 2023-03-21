/* Tillägg hantering av namn som Bo ahl med if-satser. Ex...
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */



package mm223kk_lab1;

import java.util.Random;

public class Slumpsumma {

	public static void main(String[] args) {
		
		
// Sktivera slumptals generator.
		
		Random rand = new Random();
		
// Genera slumptal 0 <= a b c d e f g <= 99.
		
		
		int a = rand.nextInt(100);
		
		int b = rand.nextInt(100);

		int c = rand.nextInt(100);
		
		int d = rand.nextInt(100);
		
		int e = rand.nextInt(100);
		
		int f = rand.nextInt(100);

		System.out.println("Fem genarede slumptal: " +a +" " +b +" " +c + " " +d +" " +e +" " +f);
		
		System.out.println("Slumptalens summa är: "+( +a  +b  +c  +d  +e  +f));


		
	}

}
