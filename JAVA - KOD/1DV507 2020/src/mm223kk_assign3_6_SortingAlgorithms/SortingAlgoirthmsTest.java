package mm223kk_assign3_6_SortingAlgorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortingAlgoirthmsTest {

	@Test
	public void testInsertionSortIntArray() {
		
		
		
		SortingAlgorithms tester = new SortingAlgorithms();
		int[] array = {9,6,3,5,10,3,7};
		array =  tester.insertionSort(array);
		assertEquals(3, array[0]);
		assertEquals(3, array[1] );
		assertEquals(5, array[2]);
		assertEquals(6, array[3]);
		assertEquals(7, array[4]);
		assertEquals(9, array[5]);
		assertEquals(10,array[6]);
	
	}

	@Test
	public void testInsertionSortStringArrayComparatorOfString() {
		
		SortingAlgorithms tester = new SortingAlgorithms();
		String[] test1 = {"I","Love","Java","Programming","Language","lol"};
		test1 = tester.insertionSort(test1, (String s1,String s2) -> s1.compareTo(s2));
	
		assertEquals("I",test1[0]); 
		assertEquals("Java",test1[1]); 
		//assertEquals("Love",test1[2]); Should fail. 
		//assertEquals("lol",test1[2]); Should fail. 
		assertEquals("Language",test1[2]); // should not should not fial.
		assertEquals("Programming",test1[5]);
	
	
	}

}
