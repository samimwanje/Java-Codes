package mm223kk_assignment_1;

public class Problem_6_main {

	public static void main(String[] args) {
		
		Problem_6_quickUnion quickUnionFind = new Problem_6_quickUnion(8);	// Get Union Find.
		
		quickUnionFind.union(1,2);		// Union 1 with 2.
		quickUnionFind.union(3,2);		// Union 3 with 2.
		quickUnionFind.union(4,5);		// Union 4 with 5.
		quickUnionFind.union(6,1);		// Union 6 with 1.
		quickUnionFind.union(0,4);		// Union 0 with 4.
		
		System.out.println(quickUnionFind);				// Print the current groupings.
		System.out.println(quickUnionFind.find(4));		// Find the group of element 6.
		System.out.println(quickUnionFind.root(6));		// Find the root of for element 6.
 

	}

}
