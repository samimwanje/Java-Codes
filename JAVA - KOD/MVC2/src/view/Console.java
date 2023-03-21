package view;

import java.util.LinkedList;

import model.Card;

public class Console {
	
	
	private int m_input; 
	
	protected int getInputChar() {
		try {
			int c = System.in.read();
			while(c== '\r' || c == '\n')
				c = System.in.read();
			return c;
		} catch (Exception e) {
			System.out.println("" +e);		
			return 0;
		}
	}
	
	
	public void presentInstructions() {
		System.out.println("Hello Black Jack World");
		System.out.println("P to start new game, h to hit, s to stand, q to quit");
		
	}
	
	public void collectEvents() {		
		m_input = getInputChar();
	}
	
	
	public boolean wantsToQuit() {
		return m_input == 'q';	
	}


	public boolean wantsToStartGameNewGame() {
		return m_input == 'p';
	}


	public void presentDealerHand(LinkedList<Card> hand) {
		// TODO Auto-generated method stub
		
	}
	
}
