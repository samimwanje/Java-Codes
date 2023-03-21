package mm223kk_assign4_9_binheap;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryIntHeapTest {

	@Test
	public void testBinaryIntHeap() {
		
		BinaryIntHeap tester = new BinaryIntHeap();

		assertEquals(0,tester.size());
		assertTrue(tester.isEmpyty());
		
		
	}

	@Test
	public void testInsert() {
		BinaryIntHeap tester = new BinaryIntHeap();


		tester.insert(31);

		assertEquals(31,tester.pullHighest());
	
		
	}

	@Test
	public void testPullHighest() {
		BinaryIntHeap tester = new BinaryIntHeap();
		
		
		
		

		tester.insert(10);

		tester.insert(21);

		tester.insert(54);

		tester.insert(9);

		tester.insert(31);

		assertEquals(54,tester.pullHighest());
		System.out.println(tester.isEmpyty());
		System.out.println(tester.pullHighest());
		System.out.println(tester.pullHighest());
		System.out.println(tester.pullHighest());
		System.out.println(tester.pullHighest());
		
		
		
		
		
		
		
		
		
	}

	@Test
	public void testSize() {
		BinaryIntHeap tester = new BinaryIntHeap();
		

		tester.insert(10);

		tester.insert(21);

		tester.insert(54);

		tester.insert(9);

		tester.insert(31);

		assertEquals(5,tester.size());
		
		
	}

	@Test
	public void testIsEmpyty() {
	
		BinaryIntHeap tester = new BinaryIntHeap();
		tester.insert(7);
		assertFalse(tester.isEmpyty());
	}

}
