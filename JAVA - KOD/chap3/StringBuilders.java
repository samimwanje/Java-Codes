/*
 * StringBuilders.java
 * Date: 13 aug 2008
 * Author: Jonas Lundberg
 */
package chap3;

/*
 * A program showing how class StringBuilder
 * can be used.
 *
 */
public class StringBuilders {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); // Create empty StringBuilder 
		sb.append('a');     // Append 'a' ==> sb = a
		sb.append('b');     // Append 'b' ==> sb = ab
		sb.append("CDEFG"); // Append 'CDEFG' ==> sb = abCDEFG
		
		String str = sb.toString(); // Convert to string 
		System.out.println(str);    // Print-out: abCDEFG
		
		sb.insert(0,'X');      // Add X first ==> sb = XabCDEFG
		sb.setCharAt(2,'Z');   // Overwrite position 2 with 'Z' ==> sb = XaZCDEFG
		sb.reverse();          // Reverse order of all characters ==> sb = GFEDCZaX
		str = sb.toString();   // Convert to string 
		System.out.println(str);    // Print-out: GFEDCZaX
	}

}
