/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */

	package mm223kk_lab4;

	import java.io.*;

	public class NumberGenerator {

	public static void main(String[] args) {
			
		String location = "D:\\Dropbox\\Skola\\Universitet\\DATATEKNIK\\JAVA - KOD\\\\1DV506\\src\\mm223kk_lab4\\numbers.txt";
		
		try {

		File textfile = new File(location);
		
		System.out.println("Reading from file: " +textfile.getPath());	
		
		PrintWriter output = new PrintWriter(textfile);	
		
		int size = 100; // Antal siffror
		int maxNumber = 200; // Största siffran
		
		// Skriv till dokument.
		for(int i = 0; i < size; i++) {
			
		int num = (int)(Math.random() * maxNumber +1);
		
		if(i < size) {
		output.println(num);
		}
		else
		output.print(num);
		}
		
		output.close();
		}
		catch(Exception e) {
		System.out.print("Could not find file");	
		}	
	}
}
