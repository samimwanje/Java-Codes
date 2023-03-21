/*
 * Strings.java
 * Date: 13 aug 2008
 * Author: Jonas Lundberg
 */
package chap3;

/*
 * A program showing how a number of string methods can be used.
 *
 */
public class Strings {

	public static void main(String[] args) {
		String abc = new String("abcdefgh");
		int length = abc.length();    // Number of characters 
		char first = abc.charAt(0);  // Get first character 
		System.out.println(abc+",\tLength = "+length+",\tFirst = "+first);
		
		String name = "Jonas Lundberg";
		String sub = name.substring(2,10); // characters 3 to 10
		String upper = name.toUpperCase(); // To upper case letters 
		System.out.println(name+",\tSub = "+sub+",\tUpper = "+upper);
	}
	
/* Print-out
 * abcdefgh,	Length = 8,	First = a
 * Jonas Lundberg,	Sub = nas Lund,	Upper = JONAS LUNDBERG
 */

}
