package mm223kk_assignment_4_2;

public class DFSearch {
	
	Graph graph;		// The graph we are reading from.
	int source;			// The start point in the graph.
	int edgeTo[];		// Passed vertices.
	boolean marked[];	// Marked vertices

	/*
	 * Constructor that reads a tree,
	 * Sets the source, and initializes,
	 * marked array. Also creates sets the edgeTo
	 * array which will hold all  the passed elements.
	 */
	DFSearch(Graph graph, int source){
		
		this.graph = graph;						// Set graph
		this.source = source;					// Set source.
		edgeTo = new int[graph.vertices];		// Set edge to array to size of vertices in graph. All elements are set to 0.
		marked = new boolean[graph.vertices]; 	// Set marked array to size of vertices in graph. All elements are set to false.

		DFS(source);							// Run depth to search in order to pass by elements and add them to edge to array.			
	}
	
	/**
	 * Array used to pass through the tree from a source,
	 * until a stop is reached. All passed by elements will
	 * be added to edge to.
	 * All edges will not be added to edge to.
	 * @param source - The starting in the tree.
	 */
	private void DFS(int source) {

		marked[source] =  true;	// Set current vertex as marked/passed.
		Problem_2_LinkedList<Edge> currentAdj = graph.adjacency(source);	// Array connecting all neighbors of current vertex.
	
		for(int i = 0; i < currentAdj.length(); i++) {
			if(marked[ currentAdj.get(i).destination() ] == false) {			// Check if current neighbor has been passed.
				DFS(currentAdj.get(i).destination());							// If current neighbor has not been passed then traverse to it.
				edgeTo[currentAdj.get(i).destination()] =  source;			// Add neighbor to edge to array when done traversing.
			}
		}
	}
	
	/**
	 * Function used to check, if vertex is somehow,
	 * connected to the source.
	 * @param path - The vertex we are checking connection of.
	 * @return	- returns true or false.
	 */
	public boolean hasPathTo(int path) {
		if(marked[path] == true)		// Check if index for vertex is marked.
			return true;				// If marked return true.
		else 
			return false;				// Otherwise return false.
	}
	
	/**
	 * This function returns array with the path to a certain vertex.
	 * It starts with the source and ends with the vertex we are looking for.
	 * @param target - The target that we want a path to.
	 * @return	- Returns an array of the path. [ Source, ... , Target ]
	 */
	public Problem_2_LinkedList<Integer> pathTo(int target) {
		
		if(hasPathTo(target) == false)	// First check if there is a path.
			return null;				// Returns null if no path was found.
		Problem_2_LinkedList<Integer> path = new Problem_2_LinkedList<Integer>();		// List holding the path.
		int x = target;																	// Set x as target.
		
		while (x != source) {		// If we are not back at the source then we are not done with building the path array.
			path.add(x);			// Add the current element to path list.
			x = edgeTo[x];			// Change X to value of index X.
		}
		
		path.add(source);			// Finally add the source.
		path.reverse();				// Reverse the list.	
		return path;				// Return the list.
		
	}
}

	
