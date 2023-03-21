package model;

import java.util.LinkedList;

public class Deck {
	
	LinkedList<Card> m_cards;
	
	public Deck(){	
		m_cards = new LinkedList<Card>();
		for(int cIx = 0; cIx < Card.Color.Count.ordinal(); cIx++) {
			for(int vIx = 0; vIx < Card.Value.Count.ordinal(); vIx++) {
				Card c = new Card( Card.Color.values()[cIx], Card.Value.values()[vIx]);
				add(c);
			}
		}
	}

	public void add(Card c) {
		m_cards.add(c);
	}

	
	public void shuffle() {
		for(int i = 0; i < 1017; i++) {
			int index = (int)(Math.random() * 171717.0) % m_cards.size();
			Card c = m_cards.get(index);
			m_cards.remove(index);
			add(c);
		}

	}
	
	public Card getTopCard() {
		Card c = m_cards.get(0);
		m_cards.remove();
		return c;	
	}

	private Card getRandomCard() {
			int index = (int)(Math.random() * 171717.0) % m_cards.size();
			Card c = m_cards.get(index);
			m_cards.remove(index);
		return c;
	}
	
}
