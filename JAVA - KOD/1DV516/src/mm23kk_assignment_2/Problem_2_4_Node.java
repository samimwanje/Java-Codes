/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 19/11/2022
 */
package mm23kk_assignment_2;

public class Problem_2_4_Node {
	
	public String data = null;							// The data.
	
	public Problem_2_4_Node leftChild = null;			// The child of current node.
	
	public Problem_2_4_Node rightSibling = null;		// The sibling.
	
	/*
	 * Constructor used when a new tree node is created.
	 */
	public Problem_2_4_Node( String data){
		this.data = data;								// Set data on creation
	}

}