package mm223kk_assignment_4_1;

import java.util.Iterator;

public class Problem_1_main {

	public static void main(String[] args) {

		System.out.println("\n-------------------------------------------Undirected------------------------------------------------\n");
		
		Undirected undGraph = new Undirected(11);
		undGraph.addEdge(0, 2);
		undGraph.addEdge(2, 3);
		undGraph.addEdge(1, 3);
		undGraph.addEdge(3, 4);
		undGraph.addEdge(4, 5);
		undGraph.addEdge(4, 6);
		undGraph.addEdge(5, 6);
		undGraph.addEdge(6, 7);
		undGraph.addEdge(7, 8);
		undGraph.addEdge(8, 9);
		undGraph.addEdge(9, 10);
		undGraph.addEdge(10, 6);

		
		System.out.println("Vertices: "+ undGraph.vertices());	  // Print vertexe's in graph
		System.out.println("Edges: " +undGraph.edges());		  	// Print Edges in graph. 
		System.out.print("Edges in graph: ");
		undGraph.edgesPrint();
		

		// Remove edges.
		undGraph.removeEdge(3,4);
		undGraph.removeEdge(0,2);
		undGraph.removeEdge(8,9);
		undGraph.removeEdge(10,6);
		
		System.out.print("Adj 6: ");
		undGraph.adjacencysPrint(6);  								// Print adjacency's for vertex 6.
		System.out.println("Degree: " +undGraph.degree(6));	  		// Print degree for vertex 6.
		System.out.println("Vertices: "+ undGraph.vertices());	 	// Print vertexe's in graph 
		System.out.println("Edges: " +undGraph.edges());		 	// Edges in graph.
		
		System.out.print("Edges in graph: ");
		undGraph.edgesPrint();			  							// Print all the edges in the graph.
		
		System.out.println("\n-------------------------------------------Undirected Iterators----------------------------------------\n");

		// Vertices Iterator.
        System.out.println("\nVertices Iterator: ");
        Iterator<Problem_2_LinkedList<Edge>> verticesIt = undGraph.verticesIterator();
        Problem_2_LinkedList< Problem_2_LinkedList<Edge>> vertices = new Problem_2_LinkedList< Problem_2_LinkedList<Edge>>();
        while (verticesIt.hasNext()) 		// Iterates through each vertex index.
        	vertices.add( verticesIt.next() );	// Add each vertex to the list.
        System.out.println("Vertices: " +vertices.length());	// Print the amount of vertices
        
        // Edges Iterator.
        System.out.println("\nEdges Iterator: ");
        Iterator<Edge> edgesIt = undGraph.iterator();
        Problem_2_LinkedList<Edge> edges = new  Problem_2_LinkedList<Edge>();
        while (edgesIt.hasNext()) 		// Iterates through each edge index.
        	edges.add( edgesIt.next() );		// Add each to the list.
        System.out.println("Edges: " +edges.length()/2);	// Print the amount of edges
        
        // Adjacency Iterator.
        System.out.println("\nAdjacency Iterator: ");
        Iterator<Integer> adjacencyIt = undGraph.adjacencyIterator(6);
        System.out.print("Adjacency 6: ");	// Print the amount of edges
        while (adjacencyIt.hasNext()) 		// Iterates through each edge index.
        	System.out.print(adjacencyIt.next() +", "); 		// Add each to the list.
        System.out.println();
 
		

		System.out.println("\n-------------------------------------------Directed----------------------------------------------------\n");

		Directed diGraph = new Directed(15);
		diGraph.addEdge(2, 0);
		diGraph.addEdge(2, 3);
		diGraph.addEdge(3, 1);
		diGraph.addEdge(3, 4);
		diGraph.addEdge(4, 3);
		diGraph.addEdge(5, 4);
		diGraph.addEdge(5, 6);
		diGraph.addEdge(6, 4);
		diGraph.addEdge(6, 10);
		diGraph.addEdge(7, 6);
		diGraph.addEdge(7, 8);
		diGraph.addEdge(8, 9);
		diGraph.addEdge(10, 9);
		diGraph.addEdge(12, 11);
		diGraph.addEdge(12, 13);
		diGraph.addEdge(13, 14);
		diGraph.addEdge(14, 12);
		
		System.out.println("Vertices: "+ diGraph.vertices());	  // Print vertexe's in graph
		System.out.println("Edges: " +diGraph.edges());		  	// Print Edges in graph. 
		System.out.print("Edges in graph: ");
		diGraph.edgesPrint();
		
		
		// Remove edges.
		diGraph.removeEdge(3,4);
		diGraph.removeEdge(12,11);
		diGraph.removeEdge(8,9);
		diGraph.removeEdge(14,12);
	
	
		System.out.print("Adj 6: ");
		diGraph.adjacencysPrint(6);  								// Print adjacency's for vertex 6.
		System.out.println("Degree: " +diGraph.degree(6));	  		// Print degree for vertex 6.
		System.out.println("Vertices: "+ diGraph.vertices());	 	// Print vertexe's in graph 
		System.out.println("Edges: " +diGraph.edges());		 	// Edges in graph.
		System.out.print("Edges in graph: ");
		diGraph.edgesPrint();			  							// Print all the edges in the graph.
		
		
		System.out.println("\n-------------------------------------------Directed Iterators -------------------------------------------\n");

		// Vertices Iterator.
        System.out.println("\nVertices Iterator: ");
        Iterator<Problem_2_LinkedList<Edge>> diVerticesIt = diGraph.verticesIterator();
        Problem_2_LinkedList< Problem_2_LinkedList<Edge>> diVertices = new Problem_2_LinkedList< Problem_2_LinkedList<Edge>>();
        while (diVerticesIt.hasNext()) 		// Iterates through each vertex index.
        	diVertices.add( diVerticesIt.next() );	// Add each vertex to the list.
        System.out.println("Vertices: " +diVertices.length());	// Print the amount of vertices
        
        // Edges Iterator.
        System.out.println("\nEdges Iterator: ");
        Iterator<Edge> diEdgesIt = diGraph.iterator();
        Problem_2_LinkedList<Edge> diEdges = new  Problem_2_LinkedList<Edge>();
        while (diEdgesIt.hasNext()) 		// Iterates through each edge index.
        	diEdges.add( diEdgesIt.next() );		// Add each to the list.
        System.out.println("Edges: " +diEdges.length());	// Print the amount of edges
        
        // Adjacency Iterator.
        System.out.println("\nAdjacency Iterator: ");
        Iterator<Integer> dadjacencyIt = diGraph.adjacencyIterator(6);
        System.out.print("Adjacency 6: ");	// Print the amount of edges
        while (dadjacencyIt.hasNext()) 		// Iterates through each edge index.
        	System.out.print(dadjacencyIt.next() +", "); 		// Add each to the list.
        System.out.println();
		
		

	}

}
