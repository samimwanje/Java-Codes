package Tree;

public class BinaryTree {
	
	
	Node root = null;
	

	public void addNode(int key, String word) {
		
			
		Node newNode = new Node(key,word);
		
		if(root == null) {			
			root = newNode;
			
		}else {
			
			Node currentNode = root;
			
			Node parent;
			
			
			
			while(true) {
				
				parent = currentNode;
				
				if(key < currentNode.key) {
				currentNode = currentNode.leftChild;
				
				if(currentNode == null) {
					
					parent.leftChild = newNode;
					return;
					
					
				}
				
			} else {
				
				
				currentNode = currentNode.rightChild;
				
				if(currentNode == null) {
					
					parent.rightChild = newNode;
					return;
					
					
					
					}
				
				
	
				}
				
			}
			
		}
				
	}
			
	
	
	public void traverse(Node focusNode) {
		
	if(focusNode != null) {
		
		traverse(focusNode.leftChild);
		
		System.out.println(focusNode);
			
		traverse(focusNode.rightChild);
		
	}
}
	
	
	
	
	
	public void pretraverse(Node focusNode) {
		
	if(focusNode != null) {
		
		
		System.out.println(focusNode);
		
		pretraverse(focusNode.leftChild);
			
		pretraverse(focusNode.rightChild);
		
	}
}
	
	
	
	
	public void posttraverse(Node focusNode) {
		
	if(focusNode != null) {
				
		posttraverse(focusNode.leftChild);
			
		posttraverse(focusNode.rightChild);
		
		System.out.println(focusNode);
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
}


			
	