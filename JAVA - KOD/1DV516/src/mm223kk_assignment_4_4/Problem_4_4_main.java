package mm223kk_assignment_4_4;


import java.util.Iterator;

public class Problem_4_4_main {

	public static void main(String[] args) {

		  // Create a graph with 5 vertices and 8 edges.
	    Directed graph = new Directed(8);
	    int[][] el = {{0,1,5}, {0,3,8}, {0,6,9}, {1,2,15}, {1,3,4}, {1,4,12},
	                  {2,7,9}, {3,4,7}, {3,5,6}, {4,2,3}, {4,7,11}, {5,4,1},
	                  {5,7,13}, {6,3,5}, {6,5,4}, {6,7,20}};

	    for (int[] e : el) {
	    	graph.addEdge(e[0], e[1], e[2]);
	    }

	    // Run Dijkstra's algorithm from vertex 0.
	    DijkstrasAlgorithm dijkstra = new DijkstrasAlgorithm(graph, 0);
	    dijkstra.run();
	    System.out.println("Distance: "+ dijkstra.distanceTo(4));

	    // Print the shortest path from the source vertex to each other vertex.
	    for (int i = 0; i < graph.vertices; i++) {

	        Iterator<Integer> iterator = dijkstra.pathTo(i);
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + " ");
	        }
	        System.out.println();
	        System.out.printf("%d to %d: %d\n", dijkstra.getSource(), i, dijkstra.distanceTo(i));
	    }

	}
	
}
