/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */


package mm223kk_lab3;

public class Radio {

private static boolean mode = false;

private static int channel;

private static int volume ;





Radio() {
channel = 1;

volume = 1;	
}

	// Slår på radion. Vissa metoder är kopplade till denna och blir aktiva när denna kallas..


public static void turnOn() {
	
	mode = true;
	channel = 1;		
	volume = 1;

}




// Välj kanal inom tilllånta område, annars skrivs felmeddelande ut.

public void setChannel(int ch) {
	
	if(mode == true) {
	
	if (ch <= 10 && ch >= 0) {
		channel = ch;
		}
		else
		System.err.println("New channel not within range!");
	}
	else
	System.err.println("Radio off ==> No adjustment possible");
	
}



	

// Channel up and down, tills gräns nås. Felmeddelande skrivs ut.


public void channelUp() {
	
	if( mode == true ) {	
	channel++;
	if(channel > 10) {
	channel = 10;
	System.err.println("New channel not within range!");	
		}
	}
	else
	System.err.println("Radio off ==> No adjustment possible");
		

}

// Kanal ner varje gång metoden kallas. Tills gräns nås. Felmeddelande skrivs ut.

	public void channelDown() {
	
	if( mode == true ) {
		
	channel--;
	
	if(channel < 0 ) {
			
	channel = 0;
	System.err.println("New channel not within range!");
	}
	
	}
	else 	
	System.err.println("Radio off ==> No adjustment possible");
		
		

	}




// Set volume. Val volum sätt, error skrivs ut om val volum är över eller under tillåtna.


	public void setVolume(int vol) {
	
	if(mode == true) {
	
	if (vol <= 5 && vol >= 0) {

	volume = vol;
	}
	else
	System.err.println("New volume not within range!");
	}
	else
	System.err.println("Radio off ==> No adjustment possible");
	
}






// Volume up and down.


	public void volumeUp() {
	
	if( mode == true ) {
		
	volume++;
	
	if(volume >= 6) {
		
	
	volume = 5;
	System.err.println("New volume not within range!");	
	}
	
	}
	else {
		
		System.err.println("Radio off ==> No adjustment possible");
		}
	}

// Sänker volumen med ett steg tills man når gränsen. Även felmeddelande som skrivs ut.


	public void volumeDown() {
	
	if( mode == true ) {
		
	volume--;
	
	if(volume <= -1 ) {
			
	volume = 0;
	System.err.println("New volume not within range!");
	
	}
	
	}
	else {
		
		System.err.println("Radio off ==> No adjustment possible");
		
		}

	}


	// Skriver ut en sträng med nuvarande instälningar.
	
	public String getSettings() {

		return "Settings:  On " +mode  +", " +" Channel " +channel +", " +"Volume " +volume;
		
	}

	// Slår på radion. Vissa metoder är kopplade till denna och blir inaktiva när denna kallas. Inställningar återställs även.


	public static void turnOff() {

	
	mode = false;

	channel = 1;
			
	volume = 1;
	
	}
}