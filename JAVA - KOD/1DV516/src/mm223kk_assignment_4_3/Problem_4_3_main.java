package mm223kk_assignment_4_3;

public class Problem_4_3_main {

	public static void main(String[] args) {

		System.out.println("\n-------------------------------------------Undirected Weighted Edges MST-------------------------------------------\n");
		
		Undirected undGraph = new Undirected(5);
		undGraph.addEdge(2, 1,2);
		undGraph.addEdge(3, 2,4);
		undGraph.addEdge(0, 3,7);
		undGraph.addEdge(1, 4,3);

		KruskalAlgorithm kGraph = new KruskalAlgorithm(undGraph);
        kGraph.printResult();
	}

}
