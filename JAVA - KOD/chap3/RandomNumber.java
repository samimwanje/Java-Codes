/*
 * RandomNumber.java
 * Date: 3 sep 2008
 * Author: Jonas Lundberg
 */
package chap3;

import java.util.Random;   // Random belongs to package java.util

/*
 * A program showing how the random number generator 
 * java.util.Random can be used kan användas.
 *
 */
public class RandomNumber {


	public static void main(String[] args) {
		/* Create random generator */
		Random rand = new Random(); 
		
		int randInt = rand.nextInt(100);  // Random integer between 0 and 100
        System.out.println("Random integer: "+ randInt);
        
		double randFloat = rand.nextDouble();  // Random float between 0.0 and 1.0
        System.out.println("Random float: "+ randFloat);
        
        randFloat = 50.0 + 50.0*rand.nextDouble();  // Random float between 50.0 and 100.0
        System.out.println("Random float: "+ randFloat);
        
        boolean randBool = rand.nextBoolean();  // true or false
        System.out.println("Random boolean: "+ randBool);
	}

}
