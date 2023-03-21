/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */
package mm223kk_lab4;

import java.util.Scanner;

public class SafeDateMain {

		public static void main(String args[]) {
		
		// Variabels for year month day...
			
		int year;
		
		int month;
		
		int day;
		
		// Scanner for input of year...
		
		Scanner input = new Scanner(System.in);
		
		DateFormat datum = new DateFormat();
				
		while (true) {
			
		// Try if no error occurs.
	
		try {
			
			// Set year. Also close the scanner before bye bye.
		
			System.out.print("Give me a year: " );
				year = input.nextInt();
					if(year == 0) input.close();
						datum.setYear(year);
					
					//Set month.
					
						System.out.print("Give me a month: " );
							month = input.nextInt();
								datum.setMonth(month);
						
						// Set day.
						System.out.print("Give me a day: " );
							day = input.nextInt();
								datum.setDay(day);
								
									// Set format and print out.
								datum.setPunctuation('-');
								datum.setFormat('b');
									System.out.println("The date is: " +datum.getDate(true));
								System.out.println();
	
							}
		
							// If error occurs print error from the method in DateFormat.
							catch(IllegalArgumentException e) {
								System.out.println(e); }
		
								}	

							}
}