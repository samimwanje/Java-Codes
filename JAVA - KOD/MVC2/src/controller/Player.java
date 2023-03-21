package controller;

public class Player {
	
	
	
		
	public boolean playGame(view.Console a_view, model.Dealer a_dealer, model.Player a_player) {
		a_view.presentInstructions();
		a_view.collectEvents();
		if(a_view.wantsToStartGameNewGame()) {
			a_dealer.startGame(a_player);
			a_view.presentDealerHand(a_dealer.getHand());
			a_view.presentDealerHand(a_dealer.getHand());
			return true;	
		}else if(a_view.wantsToQuit())
			return false;
		return true;
	}

}
