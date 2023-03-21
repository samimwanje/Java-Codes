package mm223kk_assignment_4_2;

public class Problem_2_main {

	public static void main(String[] args) {

		Undirected undGraph = new Undirected(15);
		
		
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
		
		// Not same connection.
		undGraph.addEdge(12, 11);
		undGraph.addEdge(12, 13);
		undGraph.addEdge(13, 14);
		undGraph.addEdge(14, 12);
		
		System.out.println("\n-------------------------------------------Depth Searh Undirected-------------------------------------------\n");
		DFSearch DFSearch = new DFSearch(undGraph, 3);
		System.out.println("Has path to 5: "+DFSearch.hasPathTo(5));
		System.out.println("Has path to 11: "+DFSearch.hasPathTo(11));
		System.out.println("Path to 8: "+DFSearch.pathTo(8));
		
		System.out.println("\nBreadth: \n");
		
		BFSearch BFSearh = new BFSearch(undGraph, 3);
		System.out.println("Has path to 5: "+BFSearh.hasPathTo(5));
		System.out.println("Has path to 11: "+BFSearh.hasPathTo(11));
		System.out.println("Path to 8: "+BFSearh.pathTo(8));
		

		System.out.println("\n-------------------------------------------Depth Searh Directed-------------------------------------------\n");
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
		
		// Not same connection.
		diGraph.addEdge(12, 11);
		diGraph.addEdge(12, 13);
		diGraph.addEdge(13, 14);
		diGraph.addEdge(14, 12);
		
		DFSearch = new DFSearch(diGraph, 3);
		System.out.println("Has path to 5: "+DFSearch.hasPathTo(5));
		System.out.println("Has path to 11: "+DFSearch.hasPathTo(11));
		System.out.println(DFSearch.pathTo(1));
		
		System.out.println("\nBreadth: \n");
		
		BFSearh = new BFSearch(diGraph, 3);
		System.out.println("Has path to 5: "+BFSearh.hasPathTo(5));
		System.out.println("Has path to 11: "+BFSearh.hasPathTo(11));
		System.out.println("Path to 8: "+BFSearh.pathTo(1));


	}

}
