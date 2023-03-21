package controller;
import model.DiceGame;
import view.ConsoleUI;

public class Player implements model.DiceRolledObserver{	
	
		ConsoleUI ui;
		DiceGame game;
		
		Player(DiceGame g, ConsoleUI i) {
			
			ui = i;
			game = g;
			game.addSubscribers(this);
		}
	
	
	
	
		public void playGame() {
			do {
			if(game.playGame()) {
				ui.showWinningMessage();
			}else {
				ui.showLoosingMessage();
			}
			
			}while(!ui.promptQuitMessage());	
		}

		@Override
		public void diceRolled(int value) {
			ui.showDiceRolledMessage(value);
			
		}
				
}