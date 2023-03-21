/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */


package mm223kk_lab3;

import java.util.ArrayList;

import java.util.Collections;

public class Deck {
	
	private static ArrayList<Card> cards = new ArrayList<Card>();
	
	
	// Konstruktor som skapar kortlek.
	
	public Deck() {
	
	for(int y = 0; y < 4; y ++) {
		
	for(int x = 0; x < 13; x++) {
	Card currentCard = new Card(y,x);
	
	cards.add(currentCard);
	}
	
	}
	
	}
	
	
	
	// Skicka tbx ett specifikt kort.
	
	public Card displayCard(int card) {
		return cards.get(card);
		
	}
	
	
	// Storlek på kortlek.
	
	public int size() {
	
	return cards.size();
	
	}
	
	// Dela ut och ta bort nuvarande kort från kortleken.
	
	public Card dealCard(){
		
	if(cards.size() == 0) {
	System.err.println("Det finns inga kort kvar.");
	}
	
	Card current = 	cards.get(0);
	cards.remove(0);	
	return current;
	}
	
	
	
	
	
	// Blanda kortlek.
	public void shuffle() {
		
		if( size() < 52) {			
			System.err.println("Kan inte blanda mindre än 52 kort");
		}
		else		
			Collections.shuffle(cards);		
		}
		
}