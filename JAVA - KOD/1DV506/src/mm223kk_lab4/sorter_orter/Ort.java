/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */


package mm223kk_lab4.sorter_orter;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ort  implements  Comparable<Ort>{
	
	// Variabler
	
	private ArrayList<Integer> postnummer = new ArrayList<Integer>();
	
	private ArrayList<String> stader = new ArrayList<String>();
	
	private Scanner input;

	private ArrayList <String> ortdata = new ArrayList<String>();
	
	private int pn;

	// Konstruktor som läser in ort och postnummer.
	
	
	public Ort(int pn) {
		this.pn = pn;
	}
	
	
	// Konstruktor... Som läser in en ortfil.
	
	public Ort(String path) {
		
	try {
		input = new Scanner(new File(path));
	}
	catch(Exception e) {
		
		System.out.print("File was not found.");	
	}
	
	while(input.hasNext()) {
		ortdata.add( input.nextLine() );
		}
		
	}
	
	
	// Skapar två nya arrays med orter och postnummer...
	
	private void split() {
	
	for( int i = 0; i < ortdata.size(); i++ ) {
		
		String temp = "";
		
		String a = ortdata.get(i);
		
		for(int y = 0; y < a.length(); y++) {
			
		if ( Character.isDigit( a.charAt(y) ) ){	
		temp += a.charAt(y);	
		}	
			}
		
		postnummer.add(Integer.parseInt(temp));
		}
	
		//System.out.println("Postnummer är nu splittrade.");
	
			
	
	for( int i = 0; i < ortdata.size(); i++ ) {
		
		String temp2 = "";
		
		String b = ortdata.get(i);
		
		for(int y = 0; y < b.length(); y++) {
			
		if ( Character.isLetter( b.charAt(y) ) ){	
		temp2 += b.charAt(y);	
		}
		
		}
		stader.add(temp2);
		}
	
		//System.out.println("Orter är nu splittrade.");
	}
	
	// Sortera orterna efter postnummer.
	
	public void sort() {	
		Collections.sort(this.ortdata);
		split();
		//System.out.println("Orterna är nu sorterade.");
	}
	
	

	// Jämför skillnaden mellan två postnummer.
	public int compareTo(Ort o) {
		
	return Math.abs(pn - o.pn);
	}
	
	
	// Antal orter.
	public int size() {
		
	return ortdata.size();
		
	}
	
	// Printar ut resultat.
	public void display() {
		
		System.out.println("Antal funna orter: " +size());
		
		
		for(int i = 0; i < size(); i++) {
			
			System.out.println(postnummer.get(i) +" " +stader.get(i) );
			
		}		
	}	
}
