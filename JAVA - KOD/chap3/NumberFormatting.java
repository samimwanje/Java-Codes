/*
 * NumberFormatting.java
 * Date: 4 sep 2008
 * Author: Jonas Lundberg
 */
package chap3;

import java.text.NumberFormat;

/*
 * A short program showing how class NumberFormat can be used
 * to print values with percentages and currencies.
 *
 */
public class NumberFormatting {


	public static void main(String[] args) {
		double tax = 0.25;  // Tax on food 
		double milkPrice = 8.75;  // Price for milk 	
		double noTax = (1-tax)*milkPrice;
		
		/* Non-formatted printout */
		System.out.println("Price for milk: "+milkPrice);
		System.out.println("Tax: "+tax);
		System.out.println("Price (excl. tax): "+noTax);
		
		/* Create two formatting objects */
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		
		/* Formatted printout */
		System.out.println("\nPrice for milk: "+moneyFormat.format(milkPrice));
		System.out.println("Tax: "+percentFormat.format(tax));
		System.out.println("Price (excl. tax): "+moneyFormat.format(noTax));
	}

}
