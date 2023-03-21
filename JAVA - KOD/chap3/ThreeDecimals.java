/*
 * File: ThreeDecimals.java
 * Author: Jonas Lundberg
 * Date: 3 nov 2011
 */
package chap3;

import java.text.DecimalFormat;

/**
 * A simple program showing how to use
 * the DecimalFormat class to round of
 * floating point values correctly. 
 * 
 * @author jlnmsi
 *
 */
public class ThreeDecimals {

	public static void main(String[] args) {
		double d = 8.0/3;                    // 2.666666....
		System.out.println("Exact: "+d);
		
		DecimalFormat dFormat = new DecimalFormat("0.###");      // Three decimals
		String three_decimals = dFormat.format(d);		         // Apply formatting on d
		System.out.println("Three Decimals: "+three_decimals);   // "2.667"

	}

}
