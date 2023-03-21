/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 19/11/2022
 */
package mm23kk_assignment_2;

import java.io.File;

public class Problem_2_4_main {
	
		public static void main(String[] args) {
	
			String path = "E:/Dropbox/API/public/";								// SET THIS TO THE PATH.
			File rootFolder = new File(path);									// Create File object with path.
			Problem_2_4_LCRS tree = new Problem_2_4_LCRS();						// Create new tree starting at folder.
			Problem_2_4_Node root = new Problem_2_4_Node(rootFolder.getName());	// Create a starting point node of a folder.
			
			
			folderTree(rootFolder, tree, root);		// Read everything located in the starting point, and add it to the tree.
			
			
			//tree.printNode(root);		// Prints the entire root folder.
			
			//tree.printNode ( tree.findNode(root, "public" ) );					// Search return the root folder.
			
			tree.printNode ( tree.findNode(root, "style" ) );						// Search return the style folder.
			
			tree.printNode ( tree.findNode(root, "img" ) );							// Search return the img folder.
			
			tree.printNode ( tree.findNode(root, "script" ) );						// Search return the script folder.
			
			tree.printNode ( tree.findNode(root, "tags.js" ) );						// Search return the script folder.

		}

		/**
		 * This function is used to add all the containment in a folder to the tree.
		 * The function adds each file/folder to the tree, if it stumbles on a folder,
		 * then this will be added as a sibling of current folder.
		 * @param rootFolder - A root node, which is the root folder.
		 * @param tree - A tree which a the containment will be added on.
		 * @return rootFolder - A file type object which hold the root folder.		
		 */
		private static void folderTree(File rootFolder, Problem_2_4_LCRS tree, Problem_2_4_Node currentFolder) {	
				
				File[] nodes = rootFolder.listFiles();			// Load all the children of the parent folder.		
	
				for(int x = 0; x < nodes.length; x++) {			// Add all the files located in the current folder.
					Problem_2_4_Node currentNode = tree.addChildren(currentFolder, nodes[x].getName());
					if(nodes[x].isDirectory()) {		
						folderTree(nodes[x], tree, currentNode);		
					}
				}

				
		}
}