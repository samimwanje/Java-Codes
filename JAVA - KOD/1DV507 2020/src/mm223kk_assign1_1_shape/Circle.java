package mm223kk_assign1_1_shape;


/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 23/08/2020
 */


public class Circle extends Shape {
	
	private int radius; // Radius.
	
	public Circle(String name, int radius, int filled) { // Constructor for size and name.
		super(name, filled);							// Set name and look in super-class.
		this.radius = radius;							// Set radius.
		
	}
	
	@Override
	public double getArea() {		// Area of Cricle
		return Math.pow(radius,2)*Math.PI;
	}

	@Override
	public double getPerimeter() {    // Perimeter of circle.
		return radius*2*Math.PI;
	}

	
}
