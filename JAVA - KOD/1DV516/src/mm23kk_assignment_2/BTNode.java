/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 10/10/2022
 */
package mm23kk_assignment_2;

public class BTNode {
	
			public int key;			// Current key-value.
			public BTNode left;		// Left child-
			public BTNode right;	// Right child.

			
			public BTNode(int value) {
				this.key = value;
				this.left = null;
				this.right = null;

			}
			

	
			/*
			 * @return If both left and right child is empty.
			 */
			public boolean isLeaf(){	
				return (left == null) && (right == null);
			}
		
			
			/**
			 * Checks if current child is full.
			 * @return True if both left and right has a node.
			 */
			public boolean isFull(){
				return (left != null) && (right != null);
			}
			
			/**
			 * Check if there is only one child.
			 * @return	True if not full, and either left or right has a node.
			 */
			public boolean oneChild(){
				return !isFull()  && !isLeaf();
			}
			
}
