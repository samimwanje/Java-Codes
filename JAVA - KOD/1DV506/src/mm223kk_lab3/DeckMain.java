package mm223kk_lab3;

public class DeckMain {

	public static void main(String[] args) {
		
		Deck myCards = new Deck();
		
		
		// Kontrollera kort kvar
		System.out.println("Kort som vi har kvar: " +myCards.size());

		// Dela ut ett kort.
		System.out.println(myCards.dealCard());
		System.out.println(myCards.dealCard());
		System.out.println(myCards.dealCard());
		System.out.println("Kort som vi har kvar: " +myCards.size());
		
		
		// Försök blanda
		myCards.shuffle();
		System.out.println();
		
		// Dela ut fler kort.
		System.out.println(myCards.dealCard());
		System.out.println(myCards.dealCard());
		
		// Upplys om kort kvar.
		System.out.println("Kort som vi har kvar: " +myCards.size());

	}

}
