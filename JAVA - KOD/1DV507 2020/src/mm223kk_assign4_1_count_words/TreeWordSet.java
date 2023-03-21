
/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign4_1_count_words;

import java.util.Iterator;

public class TreeWordSet implements WordSet  {

	private Node root;																	// Root of the Tree.
	
	private int size;																	// Size of the Tree.
	
	private String[]  wordList;															// Array used to hold the elements that will be iterated.
	
	
	private  String strings;
	
	private int currentIndex = 0;	
	
	TreeWordSet(){
		root = null;																	// Set root to null.		
		size = 0; }																		// Also set size to null.
	
	
	public void add(Word word) {
		
		if(root == null) {												// Check if there is no root.	
			root = new Node(word);										// Create new root.
			size++;														// Increase size.
			} else{
			root.addNode(new Node(word)); 								// Add node in the root...
			}
	
	}
				
					
	@Override
	public boolean contains(Word word) {
		
		return root.contain(new Node(word));											// Check if the Tree contains a ceratin word.
		
						}
	
	
	@Override
	public int size() {								
		return size;													// Return elements in the array. ( Size  of tree).
	}

	
	
	public String toString() {
		
		return root.printTree(root);											// Return a string of the elements in the tree.
		
	}

	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Iterator iterator() {
		
		return new treeIterator();												// Return a iterator over the tree.
	}
	
	

	private class Node  {
	
	private Word data = null;													// Used to store Word-object.
	private Node leftChild = null;												// Used to store left-child.
	private Node rightChild = null;												// Used to store right-child.
	

	
	private Node(Word data){	 this.data = data;}								// Set currentNode data to data from input.
	
	
	public String toString() {												
		
		strings = "{ ";														// Used for a more clear view over the containment.
		return data.toString();												// Return a string from Word-object. 
		
	}
	
	
	private void addNode(Node data) {
	
		
			if( compare( data.toString() ) < 0 ) {														// Check if current string goes alphabetical before the parent. 
				
			if(leftChild == null) {																		// If the side left is empty.
			leftChild = data;																			// Add word on left side.
			size++;
			}else { 																					
					leftChild.addNode(data);															// Set left child as added data.
			}		
				
			}else if( compare( data.toString() ) > 0 ) {												// Check if the data should go to the Right side.
				
				
				if(rightChild == null) {																// Check if current string goes alphabetical after the parent. 
												
					rightChild = data;																	// If the side left is empty.
					size++;																				
					}else { 																			
						rightChild.addNode(data);														// Add word on left side.	
					}
		
			}
				
			
			
			
		}  
	

	
	private int compare(String input) {
			
		return data.toString().toLowerCase().compareTo(input.toLowerCase());	// Compare two Strings... Mostly used to check if we should go right or left.

	}
	

															
	private boolean contain(Node data) {
		
				
					if(  this.data.toString().toLowerCase().compareTo(data.toString().toLowerCase()) < 0 ) {									// Search on left side.
					
					if(leftChild == null)																										// Check if left side is empty.
					return false;																												// If empty. Return false.
					else 
						return leftChild.contain(data);																							// Otherwise continue searching.
					
					}else if( this.data.toString().toLowerCase().compareTo(data.toString().toLowerCase()) > 0 ) {								// Search on right side.
					
				
							if(rightChild == null)																								// Check if right side is empty.
								return false;																									// If empty return false.
							else 
								return	rightChild.contain(data);																				// Otherwise continue searching.

					}
				
					
					return true;																												// Return true if the data.compare... is == 0.		
		
			}
					
					
	  String printTree(Node data) {
			
			if(rightChild != null) {																		// If rightChild is empty.
				rightChild.printTree(rightChild);  }														// Search for next.
			
		
			strings += data +", ";																			// Add value to string.
			
			
			
			if(leftChild != null) {																			// If left child is not empty.																	
				leftChild.printTree(leftChild); }															// Jump to left Child.
			
			
			
			return strings +" }";																			// Return a System.out.print friendly string.
			
	}

		
}

	
	
	private class treeIterator implements Iterator<Object>{									// Private inner-class used to iterate over all elements.
		
																	// Used to locate current index for iterator.
		
	
		   public treeIterator() {
			   strings = "";										// prepare the string.
			   	wordList = root.printTree(root).split("[{}, ]+");			// Create list of the generated by toString from the base class. 
	  	
	        }
		
	
		
		public boolean hasNext() {	
			
			
														// Check if there is more elements.
			if( currentIndex == size)					// The are should be as big as the size.
			return false;								// If there is not more elements, set to false.
			else
			return true;								// Else if there is, set to true.
		}
		
		
	

		public String next() {
	
			return wordList[currentIndex++];			// Return current element.
		}
		
		
	}

		
}
 