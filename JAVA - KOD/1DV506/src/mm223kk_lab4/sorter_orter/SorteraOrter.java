/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */


package mm223kk_lab4.sorter_orter;


public class SorteraOrter {
	
	public static void main(String[] args) {
		
	Ort orter = new Ort("D:\\Dropbox\\Skola\\Universitet\\DATATEKNIK\\JAVA - KOD\\1DV506\\src\\mm223kk_lab4\\sorter_orter\\ortfil.txt");
		
	orter.sort(); // Sortera orterna efter postnummer... Skapar två nya arrays med orter och postnummer...
	
	orter.display();
	
	
	// Visste inte vad jag skulle använda compareTo-metoden till... Detta är ett alternativ.
	
	Ort compareOrt = new Ort(28335);
	
	Ort compareOrt2 = new Ort(53418);
	
	System.out.println("Skillnaden mellan två städers postnummer: " +compareOrt.compareTo(compareOrt2) );

	}	
}