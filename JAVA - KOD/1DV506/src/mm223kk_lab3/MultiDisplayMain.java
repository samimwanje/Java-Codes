/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */


package mm223kk_lab3;

public class MultiDisplayMain {

	public static void main(String[] args) {
			
		
		MultiDisplay md = new MultiDisplay();
		
		md.setDisplayMessage("Hello World!");
		md.setDisplayCount(3); // Antal hello World
		
		
		md.display();      // Utför en printning
				
		md.display("Goodbye cruel world!", 2);  // ==> print-out
				
		System.out.println( "Current Message: " +md.getDisplayMessage() );
		
		
		
	}

}
