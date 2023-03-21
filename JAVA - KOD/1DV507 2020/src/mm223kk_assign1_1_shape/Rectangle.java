package mm223kk_assign1_1_shape;


/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 23/08/2020
 */


public class Rectangle extends Shape{
	
	private int base, height; // Base and height.
	
	
	
 	public Rectangle(String name, int base, int height, int filled){		// Constructor 
	super(name, filled);			 // Shape-class constructor
	this.base = base;				// SetBase
	this.height = height;}			// SetHeight

 	@Override
	public double getArea() {  // Area of rectangle
	return base*height;
	}


	@Override
	public double getPerimeter() {	// Perimeter of rectangle.
	return height*2+base*2;
	}

	
}
