package model;

import java.util.LinkedList;

public class Dealer {
	
	
	Deck m_deck;
	LinkedList<Card> m_hand;
	
	
	public Dealer() {
		m_deck = new Deck();
		m_deck.shuffle();
		m_hand = new LinkedList<Card>();
	}
	
	
	public void dealCard(Card a_c) {
		m_hand.add(a_c);
	}
	
	public Iterator<Card> getHand() {
		return m_hand;
	}
	
	public void startGame(Player a_player) {
		Card c = m_deck.getTopCard();	
		c.show();
		a_player.dealCard(c);
		
		
		c = m_deck.getTopCard();	
		c.show();
		dealCard(c);
		

		c = m_deck.getTopCard();	
		c.show();
		a_player.dealCard(c);
		
		
		c = m_deck.getTopCard();	
		dealCard(c);
		
		
	}


	
	

}
