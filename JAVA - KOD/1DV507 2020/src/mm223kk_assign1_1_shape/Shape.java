package mm223kk_assign1_1_shape;


/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 23/08/2020
 */


import java.text.DecimalFormat;

public abstract class Shape {
	protected String name;
	private  int filled;
	
	public Shape(String shapeName, int filled) { name = shapeName; this.filled = filled; }	
	
	public abstract double getArea(); // Abstract methods that are used in all sub-classes.
	public abstract double getPerimeter();

	
	@Override // ToString to transfer geometric object to string.
	public String toString() {
		DecimalFormat f = new DecimalFormat("##.00");		// Format
		String a = f.format( getArea() );				// Area
		String p = f.format( getPerimeter() );			// Perimeter
		if(filled == 1)										// If filled is 1
		return name+", Area = "+a+", Perimeter = "+p +", FILLED.";
		else
		return name+", Area = "+a+", Perimeter = "+p +", NOT FILLED."; // Else the object is not filled.
	}	
}