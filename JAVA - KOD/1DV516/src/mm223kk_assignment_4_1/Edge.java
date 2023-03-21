package mm223kk_assignment_4_1;

public class Edge {
	
	private int source;		// Source vertex of edge.
	private int destination;	// Destination vertex of edge.
	private int weight;		// Weight of edge.
	
	
	/**
	 * Constructor for the Edge class.
	 * Initializes the source, destination, and weight fields.
	 * 
	 * @param src - The source vertex of the edge.
	 * @param dst - The destination vertex of the edge.
	 * @param wgt - The weight of the edge.
	 */
	Edge(int src, int dst,int wgt){
		source = src;
		destination = dst;
		weight = wgt;
	}
	
	public int source() {
		return source;
	}
	
	public int weight() {	
		return weight;
	}
	
	public int destination() {	
		return destination;	
	}

}
