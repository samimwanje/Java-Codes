package mm223kk_assignment_4_3;

import java.util.Iterator;

public class KruskalAlgorithm {

	Graph graph;		// The graph we are reading from.
	int V;				// Vertices in graph.
	private int E;		// Edges in graph.
	Edge sortedEdges[];	// Sorted edges.
	Problem_2_LinkedList<Edge> MST = new Problem_2_LinkedList<Edge>();	// The result of the minimum spanning tree.
	private int weight;	// The weight of the cost of the MST tree.
	KruskalAlgorithm(Graph graph){
		
		V = graph.vertices();	// Set vertices.
		E = graph.edges();		// Set edges.
		this.graph = graph;		// Set current graph.
		sortEdges(graph);		// Sort the edges 
		unionMST(sortedEdges); // Create the MST tree using union.
		weight = countWeight();
	}
	
	
	/**
	 * This function is used to sort the edges by ascending edge weight.
	 * @param graph - Graph holding the edges we want to sort.
	 */
	private void sortEdges(Graph graph) {
			
		sortedEdges = new Edge[E];									// Initialize array holding the sorted edges.
		Iterator<Edge> edgesIterator = graph.iterator();			// Iterator used to receive the edges in tree.
		
		int i = 0;													// Current index counter.
		int sortedWeights[] = new int[E];							// Array holding value of weight for each edge. Will be sorted by heap sort.
		
		while(edgesIterator.hasNext() && i < E) {					// Iterates through the edges in the graph.
			Edge current = edgesIterator.next();					// Load the current edge.
			if (current.source() < current.destination()) {				// Only add edge if source is smaller than destination
				sortedEdges[i] = current;							// Add to sorted edges array ( currently unsorted).
				sortedWeights[i] = current.weight();					// Load the weight to sorted weights.
				i++;												// Increase counter.
			}
		}
			
			Problem_3_4_Heapsort heapsort = new Problem_3_4_Heapsort();	// Uses heap sort class from Problem 3.4
			sortedWeights =	heapsort.sort(sortedWeights);				// Sort the sorted weights array.
				
			// Sort sortedEdges array according to sortedWeights.
			int j = 0;
			while(j < E) {
				int min = sortedWeights[j];
				int minIndex = j;										// Find the index of the edge in sortedEdges with the same weight as the current minimum weight
				for(int k = j; k < E; k++) {
					if(sortedEdges[k].weight() == min) {
						minIndex = k;
						break;
					}
				}
				Edge temp = sortedEdges[minIndex];
				sortedEdges[minIndex] = sortedEdges[j];
				sortedEdges[j] = temp;
				j++;
			}														     // Swap the edge at the minimum index with the edge at the current index
	}
	/*
	 * Function the uses union, in order to check if a circle has occurred.
	 * If a is not the the two nodes are unified, and added to the MST set.
	 */
	private void unionMST(Edge[] sortedEdges) {
		Problem_2_5_UnionFind union = new Problem_2_5_UnionFind(V);	// Initialize a union find set.
		
		for(int i = 0; i < sortedEdges.length; i++) {	// Loop through all the edges.
				if( !union.connected(sortedEdges[i].source(), sortedEdges[i].destination()) ) {	// Check if current edges nodes are unified.
					union.union(sortedEdges[i].source(), sortedEdges[i].destination());			// If not then union them.
					MST.add(sortedEdges[i]);												// Add current edeg to the MST set.
				}
		}

	}
	
	/*
	 * Counts the weight of the tree.
	 */
	private int countWeight(){
		int counter = 0;
		for(int i = 0; i < MST.length(); i++)	// Check the MST set and sum all the weights.
			counter += MST.get(i).weight();
		return counter;
	}
	
	/**
	 * Return the minimum cost of the tree. ( Weight)
	 * @return - The weight of the tree.
	 */
	public int weight(){
		return weight;
	}
	
	/**
	 * A nice out print of the result of the tree.
	 */
	public void printResult() {
		for(int i = 0; i < MST.length(); i++)
			System.out.println(MST.get(i).source() +" --- " +MST.get(i).destination() +" == " +MST.get(i).weight());
		System.out.println("Weight of tree: "+weight);
	}

}
