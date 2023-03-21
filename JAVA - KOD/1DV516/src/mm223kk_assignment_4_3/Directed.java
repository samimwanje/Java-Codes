package mm223kk_assignment_4_3;

public class Directed extends Graph{

	Directed(int elements) {
		super(elements);
	}
	
	/*
	 * This function is used to add a new edge to the graph.
	 * It also expands the array of all nodes. if needed.
	 */
	public void addEdge(int x, int y){
		
		if (x >= vertices || y >= vertices || x < 0 || y < 0)			// Check if vertices are possible.
			throw new IndexOutOfBoundsException("Value is out of bound.");
		
		adjancyList.get(x).add( new Edge(x,y,1) ); // Use the graph list to add new edge x ---> y
		edges ++;
	}
	
	/*
	 * This function is used to add a new edge to the directed graph.
	 * It uses the default weight 1.
	 * @param x - The source of the edge.
	 * @param y - The destination of the edge.
	 */
	public void addEdge(int x, int y, int w){
		
		if (x >= vertices || y >= vertices || x < 0 || y < 0)			// Check if vertices are possible.
			throw new IndexOutOfBoundsException("Value is out of bound.");
		
		adjancyList.get(x).add( new Edge(x,y,w) ); // Use the graph list to add new edge x ---> y
		edges ++;
	}
	
	/*
	 * This function is used to add a new edge to the directed graph.
	 * It uses a given weight w.
	 * @param x - The source of the edge.
	 * @param y - The destination of the edge.
	 */
	public void removeEdge(int x, int y){
		
		if (x >= vertices || y >= vertices || x < 0 || y < 0)							// Check if vertices are possible.
			throw new IndexOutOfBoundsException("Value is out of bound.");

		for(int i = 0; i < adjancyList.get(x).length(); i++ )	// Loop through adjacency list.
			if( adjancyList.get(x).get(i).destination() == y ) {	// For edge x ---> y.
				adjancyList.get(x).delete(i);					// Delete edge x --- y.
				edges--; }
	}	
}
