package Tree;

public class Node {
	
	int key;
	String data;

	Node leftChild;
	Node rightChild;
	
	
	Node(int key, String name){
		
		this.key = key;
		this.data = name;
		
	}
	
	
	public String toString(){
		return data;	}
	
	
	
}
