package mm223kk_assignment_1;

public class Problem_5_main {

	public static void main(String[] args) {	
		
		Problem_5_UnionFind unionFind = new Problem_5_UnionFind(8);		// Get Union Find.
		
		unionFind.union(1,2);		// Union 1 with 2.
		unionFind.union(3,2);		// Union 3 with 2.
		unionFind.union(4,5);		// Union 4 with 5.
		unionFind.union(6,1);		// Union 6 with 1.
		unionFind.union(0,4);		// Union 0 with 4.
		
		System.out.println(unionFind);				// Print the current groupings.
		System.out.println(unionFind.find(4));		// Find the group of element 6.
		System.out.println(unionFind.root(6));		// Find the root of for element 6.
	}

}
