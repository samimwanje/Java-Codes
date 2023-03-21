package view;

public class ConsoleUI {
	
	public void showWelcomeMessage() {
		System.out.print("Welcome to the fun Dicegame!");
		
	}

	public void showWinningMessage() {
		System.out.print("You won!");
		
	}

	public void showLoosingMessage() {
		System.out.print("Sorry you lost!");
		
	}

	public boolean promptQuitMessage() {
		System.out.print("Press q to quit or any key to play again...");		
		return getInputchar() == 'q';
	}
	
	public void showDiceRolledMessage(int diceValue) {
		System.out.println("Dice rolled: " +diceValue);
	}
	

	private int getInputchar() {
		try {
			int c = System.in.read();
			
			while(c == '\r' || c == '\n')
				c = System.in.read(); 
			return c;
		} catch (Exception e) {
			System.out.print("" +e);
			return 0;
		}
		
	}

	

}
