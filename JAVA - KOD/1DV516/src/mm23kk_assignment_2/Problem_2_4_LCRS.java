/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 19/11/2022
 */
package mm23kk_assignment_2;

public class Problem_2_4_LCRS{

		/**
		 * Used to add a sibling to a currently existing children.
		 * Searches through the siblings until an empty spot is found.
		 * The starting point is the node that will receive a new child.
		 * @param currentNode - The node which will achieve a child.
		 * @param data	- The data that the new child will hold.
		 */
		private Problem_2_4_Node addSibling(Problem_2_4_Node currentNode, String data){
	
			while(currentNode.rightSibling != null) 					// Find empty sport for sibling starting with first right.
				currentNode = currentNode.rightSibling;		
			
			currentNode.rightSibling = new Problem_2_4_Node(data);		// If current sibling is null, add sibling. Spot found.
			return currentNode.rightSibling;							// Return the current sibling. Return the newly added sibling.
	
		}
		/**
		 * Function used to ass children to a node.
		 * Starts by checked if the leftChild (first child) value is null.
		 * If the left child  (first child) instance is not null, then the added child
		 * will be added as a sibling  to the currently existing children.
		 * @param currentNode - The node which will achieve a child.
		 * @param data	- The data that the new child will hold.
		 * @return	- Returns the newly added child.
		 */
		public Problem_2_4_Node addChildren(Problem_2_4_Node currentNode, String data){

			if(currentNode.leftChild == null) {							// Check if there is a first children.
				currentNode.leftChild = new Problem_2_4_Node(data);		// If there is, then set the first starting children 
				return currentNode.leftChild;							// Return the set first children.
			}
			
			return addSibling(currentNode.leftChild, data);			// Find an empty sibling spot by starting on current the first child.
		}
		
	
		private Problem_2_4_Node returnNode = null;
		
		/**
		 * This function called the finNode() function,
		 * this function is needed in order to reset the previous node value.
		 * @param startPoint - A root where the searched node will be searched for.	
		 * @param fileName - The name of the searched node (file/folder).
		 * @return	- Returns the searched node if found, else null.
		 */
		public Problem_2_4_Node findNode(Problem_2_4_Node startPoint, String fileName){
			Problem_2_4_Node tempNode = _findNode( startPoint,  fileName);	// Receives the node that will be returned  to the user.
			returnNode = null;				// Reset the global returned node value to null. Important for next search.
			return tempNode;				// Return the searched node.
		}
		
		/**
		 * Help method used  to find a specific in the tree,
		 * The node is returned and can be used with for example,
		 * printNode().
		 * @param startPoint - The root where to search for the node.
		 * @param fileName	- The name of the file or folder that the user is searching.
		 * @return - If the file/folder is found, then it will be returned to the user.
		 */
		private Problem_2_4_Node _findNode(Problem_2_4_Node startPoint, String fileName){
			
					if(startPoint == null)
						return null;										// Exit recursion.
					
					if(startPoint.data.equals(fileName)) {
						
						 if(startPoint.leftChild != null)					// Check if the node is a folder
							 returnNode = startPoint.leftChild;				// Set return as first children.
						 else 
							 returnNode = startPoint;						// Set return as current file.
						 
						 return null;										// Exit recursion.
					}
						
					_findNode(startPoint.leftChild,  fileName);				// Go to current child.
					_findNode(startPoint.rightSibling,  fileName);			// Go to current child's sibling.
					return returnNode;										// Return the searched node or null.
					
		}
		
		/**
		 * Function used to print the contained of a specific node.
		 * @param startPoint - A node where to start before printing the nodes containment.
		 */
		public void printNode(Problem_2_4_Node startPoint) {
			
			if(startPoint == null)
	            return;
	        System.out.print(startPoint.data  + ",   ");	// Print data of current child.
	        printNode(startPoint.leftChild);			// Go to current child.
	        printNode(startPoint.rightSibling);			// Go to current child's sibling.
	        System.out.println();
	    }
}