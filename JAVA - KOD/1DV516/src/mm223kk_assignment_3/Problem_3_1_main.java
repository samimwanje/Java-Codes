/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 23/10/2022
 */
package mm223kk_assignment_3;

//import java.util.concurrent.ThreadLocalRandom;

public class Problem_3_1_main {

	public static void main(String[] args) {
		
		Problem_3_1_Quadratic Quadratic = new Problem_3_1_Quadratic();
		
		// Inserting
		System.out.println("//Inserting//");
		String randomStrings[] = {"loves", "hates", "sees", "knows", "looks for", "finds","man", 
		"woman", "fish", "elephant", "fgwfw","big","gib", "tiny", "pretty", "bald","leseps", "the", "every", "some"
		,"runs", "jumps", "talks", "sleeps"};
		for(int i = 0; i < randomStrings.length; i ++) {	
			Quadratic.insert(randomStrings[i]);
		}
		Quadratic.print();		// Print table.

		// Testing
		System.out.println("\n//Finding//");
		System.out.println("sleeps: "+Quadratic.find("sleeps"));
		System.out.println("elseps: "+Quadratic.find("elseps"));
		System.out.println("big: "+Quadratic.find("big"));
		System.out.println("ibg: "+Quadratic.find("ibg"));
		System.out.println("alkts: "+Quadratic.find("alkts"));
		System.out.println("talks: "+Quadratic.find("talks"));
		
		// Testing remove
		System.out.println("\n//Removing//");
		Quadratic.delete("big");
		Quadratic.delete("talks");
		System.out.println("Big: "+Quadratic.find("Big"));
		System.out.println("talks: "+Quadratic.find("talks"));
		
		Quadratic.print();		// // Print table.

	}

}
