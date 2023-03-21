package mm223kk_assignment_4_4;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class DijkstrasAlgorithm {
  	
    private Graph graph;   // The graph we are reading from.
    private int source;	 // The start point in the graph.
    private int[] edgeTo;	 // Passed vertices.
    private int[] distTo;	 // The distances from the source vertex to each other vertex.
    private PriorityQueue<Integer> pq;  // The priority queue used to store the vertices in order of their distance from the source vertex.
    private boolean[] marked;	 // Marked vertices.


    /**
     * Constructor that reads a graph, sets the source, and initializes the marked array and the edgeTo
     * array, which will hold all the passed elements.
     *
     * @param graph the graph to read from
     * @param source the start point in the graph
     */
    public DijkstrasAlgorithm(Graph graph, int source) {
        this.graph = graph;
        this.source = source;

        // Initialize the arrays and the priority queue.
        this.marked = new boolean[graph.vertices];
        this.edgeTo = new int[graph.vertices];
        this.distTo = new int[graph.vertices];
        this.pq = new PriorityQueue<>();

        // Initialize the distance array and the priority queue
        for (int i = 0; i < graph.vertices; i++) {
            distTo[i] = Integer.MAX_VALUE;
        }
        distTo[source] = 0;

        pq.add(source);
    }

    /**
     * Runs Dijkstra's algorithm on the graph.
     */
    public void run() {
        // Iterate through the priority queue and relax each edge.
        while (!pq.isEmpty()) {
            int v = pq.poll();
            marked[v] = true;

            // Relax each edge.
   	
            	Problem_2_LinkedList<Edge> adj = graph.adjacency(v);
            	for(int i = 0; i < adj.length(); i++) {
            		int w = adj.get(i).destination();
	                if (distTo[w] > distTo[v] + adj.get(i).weight()) {
	                    distTo[w] = distTo[v] + adj.get(i).weight();
	                    edgeTo[w] = v;
	
	                    // Add the vertex to the priority queue if it has not already been marked.
	                    if (!marked[w]) {
	                        pq.add(w);
	                    }
	                }
            	}
           
        }
    }
    
    public int getSource() {
        return source;
    }

    /**
     * Returns the distance from the source vertex to the given vertex.
     *
     * @param v the vertex to get the distance to
     * @return the distance from the source vertex to the given vertex
     */
    public int distanceTo(int v) {
        return distTo[v];
    }
    
    /**
     * Returns true if there is a path from the source vertex to the given vertex.
     *
     * @param v the vertex to check for a path to
     * @return true if there is a path from the source vertex to the given vertex, false otherwise
     */
    public boolean hasPathTo(int v) {
        return marked[v];
    }

    /**
     * Returns an iterator that iterates over the vertices on the path from the source vertex to the given
     * vertex.
     *
     * @param v the vertex to get the path to
     * @return an iterator that iterates over the vertices on the path from the source vertex to the given
     *         vertex
     */
    public Iterator<Integer> pathTo(int v) {
    	   if (!hasPathTo(v)) {
    	        return null;
    	    }

    	    // Create a stack to store the path.
    	    Stack<Integer> path = new Stack<>();

    	    // Add each vertex on the path to the stack in reverse order.
    	    for (int x = v; x != source; x = edgeTo[x]) {
    	        path.push(x);
    	    }

    	    // Add the source vertex to the stack.
    	    path.push(source);

    	    // Return the stack as an iterator.
    	    return path.iterator();
    }
}