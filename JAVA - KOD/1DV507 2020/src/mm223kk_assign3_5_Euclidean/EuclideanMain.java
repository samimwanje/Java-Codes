/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign3_5_Euclidean;

public class EuclideanMain {


	public static void main(String[] args) {
	
		System.out.println(GCD(18,12));
		System.out.println(GCD(42,56));
		System.out.println(GCD(0,9));
	
	}
	
	/**
	 * This method takes two integers as input and calculates their GCD using Euclidean algorithm.
	 * 
	 * @param m First Integer
	 * @param n Second Integer.
	 * @return  Count how many times the new rest goes in the previous rest (m) until the rest is zero. Re-do the method every time we have a r bigger than 0.
	 */
	public static int GCD(int m, int n) {

		 if (m == 0)   return n;  
		 
		 return  GCD(n%m, m);

	}
	
}