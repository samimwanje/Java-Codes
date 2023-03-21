package mm223kk_assignment_1;

public class Problem_5_UnionFind {
	
				private int unionArray[];	// Array which holds all the elements.
				
				/**
				 * Constructor that creates an array containing x-elements.
				 * This is the starting array.
				 * @param elements - amount of elements that will be used as base. 0,1,2,3,...,x-elements
				 */
				Problem_5_UnionFind(int elements){
					
					if (elements <= 0)			// Check first if correct values are entered.
						throw new IndexOutOfBoundsException("Value is out of bound.");
					
					unionArray = new int [elements];		// Set the unionArray array.
					for( int i = 0; i < unionArray.length; i++ )	
						unionArray[ i ] = i;				// Add number i to each index.
					
				}
				
				/**
				 * Method used to union two elements. 
				 * The root will be the root of the y-value.
				 * Loops through array and checks after x, which is then changed to corresponding root.
				 * @param x	- Element that will be joined to a root.
				 * @param y	- Element in group which will be either root or receive x as new member of group.
				 */
				public void union(int x, int y) {
					
					int x_value  = unionArray[x];		// Find the value of the element with index x.
					int y_value  = unionArray[y];		// Find the value of the element with index x.
					
					for(int i = 0; i < unionArray.length; i++)	// Loop through all the elements.
						if(unionArray[i] == x_value)			// Find the value for element with index x.
							unionArray[i] = y_value;			// Change it to same value as the value for element with index y.
					
					
				}
				
				/**
				 * Checks if two elements have the same root.
				 * @param x	Index of first element.
				 * @param y	Index of second element.
				 * @return	 True or False if in same root.
				 */				
				public boolean connected(int x, int y) {
			
					return unionArray[x] == unionArray[y];	//  If the elements are equal then the root should be the same.
					
				}
				
				/**
				 * Find and print the group of element x.
				 * @param x - Element which you are looking for.
				 * @return	Returns a nice out print of the group of element x.
				 */
				public String find(int x) {
					
					String group = "{";
					int groupFor = unionArray[x];			// Get the value of element x.
					
					for(int i = 0; i < unionArray.length; i++) {
						if(groupFor == unionArray[i])		// Check for all elements with the same value as x.
							if(i != unionArray.length-1)
								group += i+",";				// Add element to out print string.
					}
					
					group = group.substring(0,group.length()-1);
					group += "}";
					return  group;							// Return a nice out print of the group.
			
				}
				
				/**
				 * Get the root of the x element.
				 * @param x - element which we are looking for the root of.
				 * @return Return the root element.
				 */
				public int root(int x) {
					
					while (x != unionArray[x]) 	// While element x is not the same as corresponding index-value continue searching for the end.
						x = unionArray[x];		// Change x to value of current element. And the search.	
					return x;					// When x is equal to current element the we have found the root. Return the previous set x.
					
				}
				
				/**
				 * Method that loops through the elements and returns all the found groups.
				 */
				public String toString() {
						
						String print = "";
							
						for(int x = 0; x < unionArray.length; x++) {			// Loop through all the elements in order to find all the groups.
		
								int groupFor = unionArray[x];					// Get the current value of element x (root).
								if(!print.contains(groupFor+""  ) ) {
									
									String group = "{";
									for(int i = 0; i < unionArray.length; i++) {	// Check if value of current i is in the same group as current x.
										if(groupFor == unionArray[i]) 
											if(i != unionArray.length-1)
												group += i+",";
									}
									// Prepare nice out print.
									group = group.substring(0,group.length()-1);
									if(x != unionArray.length-1)
										group += "}";
									print += group +" ";

								}
						}
						return print;		// Print out the final result.
				}
				
				/**
				 * Extra method used to manually set a base array.
				 * @param arr - The manually set base array.
				 */
				public void setUnion(int arr[] ) {
					
					unionArray = arr;		// Change the private union array to the set one.
				
				}
	
}