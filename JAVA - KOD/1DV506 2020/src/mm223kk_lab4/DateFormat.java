/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */

package mm223kk_lab4;

public class DateFormat {
	
	// Variables are set so error occur if parameter left empty.
	
	private int year = -3;
	
	private int day = 0 ; 
	
	private int month = 0;
	
	private char punc = '.';
	
	private char format = 'c';
	
	// Empty Constructor.
	public DateFormat(){
		
	}
	
	// Constructor with arguments and method.
	public DateFormat(int year, int month, int day, char punc, char format ){
			
		
		// Set arguments + error control.
		try {
			setYear(year);
			
			setMonth(month);
			
			setDay(day);
			
			setPunctuation(punc);
			
			setFormat(format);

			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}

	
	// Set year handling.
	public void setYear(int year) throws IllegalArgumentException {
		
		// If the entered year is 0. Then print Bye, bye!
		if(year == 0) { System.out.println("Bye, bye!"); System.exit(0); }
		
			// If year is out of bound.
				if(year < 1900 || year > 2100 ) 
				throw new IllegalArgumentException("Wrong year format: year <= 1900 <= 2100");
					//set year.
				this.year = year;
	}
	
	// Set month handling.
	public void setMonth(int month) throws IllegalArgumentException {

				if(month < 1 || month > 12 )
				throw new IllegalArgumentException("Wrong month format: Month must be 1-12.");
			
				this.month = month;
		}
	
	
	// Set day handling.
	public void setDay(int day)throws IllegalArgumentException  {
		
		// Checks for "Leap year".
		if(month == 2) {
			if( (year % 4 == 0) && (year % 100 != 0) ) {
				if (day > 29 || day < 1)
					throw new IllegalArgumentException("This day does no exist in Febuary for this year.");
						}
						else{
								if (day > 28 || day < 1) 
										throw new IllegalArgumentException("Day does not exist in this month. Current month has 28 days.");
									}
										}
		
			// Checks if month has 31 days.
			
			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)  {
				if(day < 1|| day > 31) 
					throw new IllegalArgumentException("Day does not exist in this month. Current month has 31 days.");	
			}
			
			
			// Checks if month has 30 days.	
			if(month == 4 || month == 6 || month == 9 || month == 11)  {
				if(day < 1|| day > 30) 
					throw new IllegalArgumentException("Day does not exist in this month. Current month has 30 days.");	
			}
			
		
				this.day = day;			
		}

	
	// Set format handling.
	public void setFormat(char format)throws IllegalArgumentException  {
		
		// If the format is not b,l or m then throw error-message.
		if(format != 'b' && format != 'l' && format != 'm') {
			throw new IllegalArgumentException("Error, format must be: b,l or m.");
		}
		
		this.format = format;
		
	}
	
	
	//Set  handling.
	public void setPunctuation(char punc)throws IllegalArgumentException  {
			
		// If punc is not  /,- or ! then throw error-message.
		if(punc != '/' && punc != '-' && punc != '!') {
			throw new IllegalArgumentException("Error, punctuation must be: /,- or !.");
		}
		
		this.punc = punc; 
	}
	
	//Returning a string based on if the user choose full year or not.
	public String getDate(boolean fullYear)throws IllegalArgumentException  {
		
		// Checks if there are entries missing.
			
		if(year == -3 || month == 0 || day == 0 || punc == '.' || format == 'c')
			throw new IllegalArgumentException("Missing data");
			
		
		// Create strings for format to be printed in.
		
		String yearCopy = Integer.toString(year);
		
		String puncCopy = Character.toString(punc);
		
		String monthCopy = Integer.toString(month);
		
		String dayCopy = Integer.toString(day);
		
		// Check if user wants full year or not. If not then cut the first part of the year.
		
		if(fullYear == false)
		yearCopy = Character.toString(Integer.toString(year).charAt(2)) +Character.toString(Integer.toString(year).charAt(3));
		
		// Checks if user wants any spaces between the numbers.
		if(punc == '!')
			puncCopy = "";
			
		// Checks if month is lower then 10. if yes then add 0 in front of month.
		if(month < 10)
			monthCopy = "0" +Integer.toString(month);
					
		//Checks if day is lower then 10. if yes then add 0 in front of day.
		if(day < 10) 
			dayCopy = "0" +Integer.toString(day);
				
			
		// Add the date formated to a string. Based on the users choice.
		if(format == 'b')
			return yearCopy +puncCopy +monthCopy +puncCopy + dayCopy;
			
			if(format == 'l')
				return dayCopy +puncCopy +monthCopy +puncCopy + yearCopy;

				
				if(format == 'm')		
					return monthCopy +puncCopy +dayCopy +puncCopy + yearCopy;
				
				// If none of the formats m,b and l was chosen  then return error.
					return "Format Error";
	}

	
}