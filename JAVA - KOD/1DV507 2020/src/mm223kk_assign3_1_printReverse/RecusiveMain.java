/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign3_1_printReverse;

public class RecusiveMain {

	public static void main(String[] args) {
		
		PrintRecusive recursion = new PrintRecusive();
		
		String str = "Hello Everyone!";
		
		   recursion.print(str, 0);
		   System.out.println(); // Line break
		   recursion.printReverse(str,0);
		   
	}

}