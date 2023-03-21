package mm223kk_assignment_4_3;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class Graph {
	
	protected Problem_2_LinkedList< Problem_2_LinkedList<Edge> > adjancyList; // The adjacency list holding edge lists.
	protected int vertices;		// Amount of vertices in graph.
	protected int edges = 0;		// Edges in the graph.
	
	/**
	 * Constructor used to create a graph array,
	 * with the size elements * 2, since they are stored in pairs.
	 * @param elements - Amount of vertices in graph. Example 3, 0 1 2.
	 */
	Graph(int elements){

		if (elements <= 0)			// Check first if correct values are entered.
			throw new IndexOutOfBoundsException("Value is out of bound.");
		
		adjancyList = new Problem_2_LinkedList< Problem_2_LinkedList<Edge> >();	// Initialize adjacency list.
		vertices  = elements;													// Set numbers of vertices(Nodes)

		for(int i = 0; i < elements; i++)												
			adjancyList.add( new Problem_2_LinkedList<Edge>() );				// Add n lists in the adjacency lit.
	
	} 
	
	
	/**
	 * Find and print the djacency's of vertex x.
	 * @param x - Vertex which we want the adjacency's of.
	 * @return	An array of current vertex's adjacency's.
	 */
	public Problem_2_LinkedList<Edge> adjacency(int x) {
		if (x >= vertices || x < 0 )							// Check if vertices are possible.
			throw new IndexOutOfBoundsException("Value is out of bound.");
		return  adjancyList.get(x);											// Return list of x adjacency's.
	}
	
	
	/**
	 * Function used to print adjacency's of x
	 * @param x - the vertex that we want the neighbors of.
	 */
	public void adjacencysPrint(int x){
		
		Problem_2_LinkedList<Edge> adj = adjacency(x);
		
		if(adj.length() == 0)
			throw new IndexOutOfBoundsException("Vertex is not in graph.");
		
		System.out.print("[");	
		for(int i = 0; i < adj.length(); i ++)
			System.out.print(adj.get(i).destination() +", ");
		System.out.println("]");	
	}

	/**
	 * Function used to prints all the edges in the graph.
	 * The mirrors are ignored here.
	 */
	public void edgesPrint(){
		for(int i = 0; i < vertices; i ++) {
			Problem_2_LinkedList<Edge> adj = adjancyList.get(i);
			for( int w = 0; w < adj.length(); w++ )
				System.out.print("("+adj.get(w).source()+"," +adj.get(w).destination()+")" +" ");
		}System.out.println();
	}
	
	/**
	 * Prints the degree of a given vertex.
	 * @param x - a vertex
	 * @return returns degree of given vertex.
	 */
	public int degree(int x) {
		return  adjacency(x).length();		// Return a nice out print of the group.
	}
	
	/**
	 * Returns the amount of vertices in the graph.
	 * @return vertices in graph.
	 */
	public int vertices(){
		return vertices;
	}
	
	/*
	 * Return the amount of edges in graph array.
	 */
	public int edges(){
		return edges;
	}
	
	
	// ------------------------------------------------Iterators -------------------------------------------------------

	/**
	 * Iterator class for vertices, return all the vertices in the graph.
	 * They are return one by one, as a "Problem_2_LinkedList<Edge>", containing the connecting edges.
	 */
	class verticesIterator implements Iterator<Problem_2_LinkedList<Edge> > {
	
		private int index = 0;	// Counter of current vertex.
		/**
		 * Function used to check if there are more vertices in the graph.
		 */
		@Override
		public boolean hasNext() {
			return (index < vertices);
		}
		/**
		 * Function used to return the current vertex.
		 */
		@Override
		public Problem_2_LinkedList<Edge> next() {
			return adjancyList.get(index++);	// Return current vertex and increase the index counter.
		}
		
	}
	
	
	/**
	 * Class EdgeIterator returns the edges in the tree one by one.
	 */
	public class EdgeIterator implements Iterator<Edge> {
	    // The index of the current vertex being iterated over.
	    private int currentVertex = 0;
	    // The index of the current edge being iterated over.
	    private int currentEdge = 0;

	    @Override
	    public boolean hasNext() {
	        // If the current vertex is beyond the number of vertices, there are no more edges to iterate over.
	        if (currentVertex >= vertices) {
	            return false;
	        }
	        // If the current edge is beyond the number of edges for the current vertex, move on to the next vertex.
	        if (currentEdge >= adjancyList.get(currentVertex).length()) {
	            currentVertex++;
	            currentEdge = 0;
	            // Recursively call hasNext() to check if there are any more edges to iterate over.
	            return hasNext();
	        }
	        // Otherwise, there are more edges to iterate over.
	        return true;
	    }

	    @Override
	    public Edge next() {
	        // If there are no more edges to iterate over, throw a NoSuchElementException.
	        if (!hasNext()) {
	            throw new NoSuchElementException();
	        }
	        // Get the current edge and increment the current edge index.
	        Edge edge = adjancyList.get(currentVertex).get(currentEdge);
	        currentEdge++;
	        return edge;
	    }

	    @Override
	    public void remove() {
	        // The remove method is not supported in this iterator.
	        throw new UnsupportedOperationException();
	    }
	}

	/**
	 * This class implements the Iterator interface and provides an iterator that iterates over the vertices adjacent to a given vertex in a graph.
	 */
	class adjacencyIterator implements Iterator<Integer> {
	    // A list of the edges adjacent to the vertex being iterated over.
	    private Problem_2_LinkedList<Edge> adj;
	    // The index of the current edge being iterated over.
	    private int counter = 0;

	    // Constructor that initializes the adjacency list for the vertex being iterated over.
	    adjacencyIterator(int x) {
	        adj = adjacency(x);
	    }

	    @Override
	    public boolean hasNext() {
	        // If the counter is less than the number of edges in the adjacency list, there are more edges to iterate over.
	        return counter < adj.length();
	    }

	    @Override
	    public Integer next() {
	        // Increment the counter and return the destination vertex for the current edge.
	        return adj.get(counter++).destination();
	    }
	}

	
	 /**
     * Method used to create the "Vertices" Iterator Class.
     */
    public Iterator<Problem_2_LinkedList<Edge> > verticesIterator() {
        return new verticesIterator();
    }

    /**
     * Method used to create the "Edges" Iterator Class.
     */
    public Iterator<Edge> iterator() {
        return new EdgeIterator();
    }

    /**
     * Method used to create the "Adjacency" Iterator Class.
     */
    public Iterator<Integer> adjacencyIterator(int x) {
        return new adjacencyIterator(x);
    }

}
