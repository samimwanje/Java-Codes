package mm223kk_assign4_9_binheap;

public class BinaryHeapMain {

	public static void main(String[] args) {
BinaryIntHeap testSam = new BinaryIntHeap();
		
		
		System.out.println(testSam.isEmpyty());
		testSam.insert(10);

		testSam.insert(21);

		testSam.insert(1);

		testSam.insert(9);

		testSam.insert(31);


		System.out.println(testSam.pullHighest());
		System.out.println(testSam.isEmpyty());
		System.out.println(testSam.pullHighest());
		System.out.println(testSam.pullHighest());
		System.out.println(testSam.pullHighest());
		System.out.println(testSam.pullHighest());
	
	}

}
