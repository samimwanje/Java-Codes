package Tree;



public class TreeMain {

	public static void main(String[] args) {

		BinaryTree theTree = new BinaryTree();
		
		theTree.addNode(50, "Boss");
		theTree.addNode(50, "Vice Pres");
		theTree.addNode(50, "Office Manager");
		theTree.addNode(50, "Secaretay");
		theTree.addNode(50, "Sales Manager");
		theTree.addNode(50, "Salesman 1");
		
		theTree.traverse(theTree.root);
		}
	
	}

