package mm223kk_assign1_1_shape;


/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 23/08/2020
 */



import java.util.ArrayList;

public class ShapeMain {
	public static void main(String[] args) {
		
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add( new Rectangle("R1",2,3, 1) );  // base=2, height=3, filled = 1
		shapes.add( new Rectangle("R2",3,4, 0) ); 	// filled = 0
		shapes.add( new Square("S1",3, 1) );       // side=3, filled = 1
		shapes.add( new Square("S2",5, 0) );      // filled = 0
		shapes.add( new Circle("C1",1,1) );       // radius=1, filled = 1
		shapes.add( new Circle("C2",2,0) );		// filled = 0
		for (Shape s :shapes)  // Print all shapes
			System.out.println(s);
		
		
		
	}
}
 