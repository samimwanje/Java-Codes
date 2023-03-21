/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 04/10/2022
 */
package mm23kk_assignment_2;

public class Problem_1_main {
	
	public static void main(String[] args) {
		
	Problem_1_LinkedList<String> LinkedList = new Problem_1_LinkedList<String>();
	

	LinkedList.add("lol");
	LinkedList.add("1313");
	LinkedList.add("14151");
	LinkedList.add("52526");

	System.out.println(LinkedList);
	
	LinkedList.delete(0);
	LinkedList.add("testh");
	LinkedList.add("tests");
	
	System.out.println(LinkedList);
	
	LinkedList.reverse();
	LinkedList.add("1234");
	
	System.out.println(LinkedList);			// Reversed array.
	
	}
	
}

