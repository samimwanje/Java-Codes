/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */

package mm223kk_lab3;

public class Card {

	private String currentCard;

	public Card() {
		
	}
	
	// Multi-array som innehåller alla korten med dess färger.
	
	public Card(int colorN, int sizeN) {
		
	String[][] valor = {
		
	{"red-Ess", "red-Two", "red-Three","red-Four", "red-Five", "red-Six","red-Seven", "red-Eight", "red-Nine", "red-Ten", "red-Knekt", "red-Lady", "red-King"},
	
	{"black-Ess", "black-Two", "black-Three"," black-Four", "black-Five", "black-Six","black-Seven", "black-Eight", "black-Nine", "black-Ten", "black-Knekt", "black-Lady", "black-King"},
			
	{"blue-Ess", "blue-Two", "blue-Three","blue-Four", "blue-Five", "blue-Six","blue-Seven", "blue-Eight", "blue-Nine", "blue-Ten", "blue-Knekt", "blue-Lady", "blue-King"},
	
	{"green-Ess", "green-Two", "green-Three","green-Four", "green-Five", "green-Six","green-Seven", "green-Eight", "green-Nine", "green-Ten", "green-Knekt", "green-Lady", "green-King"},
	
	};
	
	currentCard = valor[colorN][sizeN];
	}
	
	
	// Övsätter nuvarande kort till sträng och skickar tillbaka denna.
	
	public String toString() {
		return currentCard;
	}
}