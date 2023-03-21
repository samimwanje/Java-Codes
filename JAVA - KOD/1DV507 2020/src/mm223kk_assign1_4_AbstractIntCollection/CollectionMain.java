/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign1_4_AbstractIntCollection;

public class CollectionMain {

	public static void main(String[] args) {
	
		
		
		ArrayIntStack test = new ArrayIntStack();
		
		ArrayIntList intList = new ArrayIntList();
		
		
		System.out.println("IntStack");
		
		test.push(1);
		test.push(2);
		test.push(3);
		test.push(4);
		test.push(5);
		test.push(6);
		test.push(7);
		test.push(8);	
		test.push(9);
		test.push(10);
		test.push(11);
		
		System.out.println(test.toString());
		test.pop();
		System.out.println(test.toString());
		test.pop();
		System.out.println(test.toString());
		test.pop();
		System.out.println(test.toString());
		test.pop();
		System.out.println(test.toString());
		test.pop();
		System.out.println(test.toString());
		test.pop();
		System.out.println(test.toString());
		test.pop();
		System.out.println(test.toString());
		
		
		System.out.println();
		
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		System.out.print("IntList: ");
		System.out.println(intList.toString());
		
		System.out.print("\nRemove index 3:");
		intList.remove(3);
		System.out.println(intList.toString());
		
		System.out.print("\nAdd 9 on index 3:");
		intList.addAt(9, 3);
		System.out.println(intList.toString());
		
		
		System.out.print("\nAdd 6 on index 1:");
		intList.addAt(6, 1);
		System.out.println(intList.toString());

		
		System.out.print("\nAdd 7 on index 0:");
		intList.addAt(7, 0);
		System.out.println(intList.toString());
		
		
		System.out.print("\nRemove index 1:");
		intList.remove(1);
		System.out.println(intList.toString());
		
		System.out.print("\nRemove index 2:");
		intList.remove(2);
		System.out.println(intList.toString());
		
		
		System.out.print("\nIndex of 9: ");
		System.out.println(intList.indexOf(9));
		
	}

}
