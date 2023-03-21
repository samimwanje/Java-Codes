/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */



package mm223kk_lab3;

public class Point {
	
	private  int x; 

	private  int y;
	
	
// Konstruktur ifall inget inget x och y anges.
		
	public Point() {
	
	x = 0;

	y = 0;
	
	}



// Konstruktur ifall x och y anges.


	public Point( int x1 , int y1) {
		
	x = x1;

	y = y1;

			
	}
	

// Återfå string. Skriver ut som sträng.


	public String toString() {
	
	return "(" +x +"," +y +")";	
	
	}





// Flytta x och y...



	public void move(int x1, int y1) {

	x += x1;

	y += y1;

	
	}



// Sätt nytt värde på x och y.

	public void moveToXY(int x1, int y1) {
	
	x = x1;
			
	y = y1;
	
	
	}
	
	
// Kontrollerar om  x och y värde för två punkter är lika.


	public boolean isEqualTo(Point p) {
	
	
	return (p.x == x) && (p.y == y);
	}





// Skriver ut avståndet mellan de två punkterna. Använder då avståndsformeln.

	public double distanceTo(Point p) {
	
	return  Math.sqrt( Math.pow( (p.x-x ), 2) + Math.pow( (p.y-y ), 2) );
	
	} 

	
	
}