package mm223kk_assignment_4_1;

public class Undirected extends Graph{

	Undirected(int elements) {
		super(elements);
	}
	
	/*
	 * This function is used to add a new edge to the Undirected graph.
	 * It uses the default weight 1.
	 * @param x - The source of the edge.
	 * @param y - The destination of the edge.
	 */
	public void addEdge(int x, int y){
		
		if (x >= vertices || y >= vertices || x < 0 || y < 0)			// Check if vertices are possible.
			throw new IndexOutOfBoundsException("Value is out of bound.");
		
		adjancyList.get(x).add( new Edge(x,y,1) ); // Use the graph list to add new edge x ---> y
		adjancyList.get(y).add( new Edge(y,x,1) ); // Use the graph list to add new edge x ---> y
		edges ++;		// Increase edges.
	}
	
	/*
	 * This function is used to add a new edge to the Undirected graph.
	 * It uses a given weight w.
	 * @param x - The source of the edge.
	 * @param y - The destination of the edge.
	 */
	public void addEdge(int x, int y,int  w){
		
		if (x >= vertices || y >= vertices || x < 0 || y < 0)			// Check if vertices are possible.
			throw new IndexOutOfBoundsException("Value is out of bound.");
		
		adjancyList.get(x).add( new Edge(x,y,w) ); // Use the graph list to add new edge x ---> y
		adjancyList.get(y).add( new Edge(y,x,w) ); // Use the graph list to add new edge x ---> y
		edges ++;		// Increase edges.
	}
	
	/*
	 * This function is used to remove an edge on the graph.
	 * It copies all elements expect to the cloned one to the graph.
	 */
	public void removeEdge(int x, int y){
		
			if (x >= vertices || y >= vertices || x < 0 || y < 0)							// Check if vertices are possible.
				throw new IndexOutOfBoundsException("Value is out of bound.");
			
			int currentE = edges;	
			
			for(int i = 0; i < adjancyList.get(x).length(); i++ )	// Loop through adjacency list.
				if( adjancyList.get(x).get(i).destination() == y ) {	// For edge x ---> y.
					adjancyList.get(x).delete(i);					// Delete edge x --- y.
					break;
			}
			
			for(int i = 0; i < adjancyList.get(y).length(); i++ )	// Loop through adjacency list.
				if( adjancyList.get(y).get(i).destination() == x ) {	// For edge y ---> x.
					adjancyList.get(y).delete(i);					// Delete edge y --- x.
					edges--;										// Decrease size of edges.
					break;
			}
			
			if(currentE == edges)
				throw new IndexOutOfBoundsException("Error, edge is not in graph.");
	}
	
}
