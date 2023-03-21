/*
 * MathFunc.java
 * Date: 3 sep 2008
 * Author: Jonas Lundberg
 */
package chap3;

/*
 * A program showing how the mathematical functions in class
 * Math can be used. Notice that these methods are static
 * ==> They are called upon a class, not an object.
 *
 */
public class MathFunc {


	public static void main(String[] args) {
	double d = Math.sqrt(2);         // sqrt ==>  square root
        System.out.println("Square root of 2: "+d);
        
        d = Math.pow(d,2);               // pow(m,n) ==> m raised to the power of n
        System.out.println("d raised to the power of 2: "+d);		
	}

}
