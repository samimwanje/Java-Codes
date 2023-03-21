/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */


package mm223kk_lab3;

public class MultiDisplay {
	
private	static String message;

private	static int times = 1;

// Kallas med önskas mening..

public void setDisplayMessage(String name) {
		
message = name;

}

// Väljer hur många gånger man vill printa önskade mening.

public void setDisplayCount(int number) {
	
	times = number;
	
}


// Önskade mening printas (message). Även antal gånger (times). 

public void display() {
	
	for(int i = 0; i < times; i++) {
		
	System.out.println(message);
		

		}
	
	}


// Kallas med önskad mening och önskade antal gånger mening ska skrivas.
public void display(String message2, int times2) {
	
	
	
	for(int i = 0; i < times2; i++) {
		
	System.out.println(message2);	
	
	}
	
}


// Printar ut den nuvarande valda meningen.

public String getDisplayMessage() {
	
	return message;
}



}
