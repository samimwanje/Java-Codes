/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */

package mm223kk_lab3;

public class Arrays {
		
public static void main(String[] args) {
	

	int numbers[] = {3, 4, 5, 6, 7};
	
	int unsorted[] = {4, 7, 5, 6, 3};

	
	//1.
	System.out.println(sum(numbers));
	
	
	//2.
	
	System.out.println(toString(numbers));
	
	
	//3. FIXED TO STRING... Arrays.toString
	
	
	System.out.println(Arrays.toString(addN(numbers, 3)));
	
	//4. FIXED TO STRING... Arrays.toString
	
	
	System.out.println(Arrays.toString(reverse(numbers)));
	
	
	//5.
	
	
	System.out.println(hasN(numbers, 1));
	
	//6.

	replaceAll(numbers, 7, 8);
	
	
	//7.
	
	System.out.println(Arrays.toString(sort(unsorted)));
	
	
	
	

	}
	
     //////1.
	
	private static int sum(int[] arr) {
		
	int current = 0;

	for(int i = 0; i < arr.length; i++) {
	
	current += arr[i];
	
	}
		
		
	return current;
		
	}
	
	
	//////2.
	
	private static String toString(int [] arr) {
		
		
		String converted = "";
		
		for(int i = 0; i < arr.length; i++) {

			converted  += arr[i]+",";

		}
		
		return converted;
	}
	
	
	//////3.

	
	private static int[] addN(int[] arr, int n) {
		
		
		int newarr [] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			
		newarr[i] = arr[i] + n;
		
		}
		
		return newarr;
			
			
		}
		
		
	//////4.

		
	private static int [] reverse( int[] arr)  {
		
		
		int[] reversarr = new int[arr.length];
		
		
		for(int i=0, y = arr.length-1; i < arr.length && y >= 0; i ++, y--) {
		
		reversarr[y] = arr[i];
		
		}
		
		return reversarr;
	}
	
	
	//////5.

	private static boolean hasN(int [] arr, int n) {
		
		int a = 0;

		
		for( int i = 0; i < arr.length; i++) {
			
			if(arr[i] == n) {
				
			a++;	
			}	
				
		}
			
			if(a > 0) {
				
			return true;
		
			}
			
			else {
			
			return false;
			
			}
	
			}
	

	//////6.
		
	
	private static void replaceAll(int [] arr, int old, int nw) {
		
		
	for(int i = 0; i < arr.length; i++ ) {
			
			if(arr[i] == old) {
				
			arr[i] = nw;	
			
			}
	
	}
	
	System.out.println(Arrays.toString(arr));
	}
	
		
	
	//////7.
	
	private static int[] sort(int[] arr) {
		
		int [] newarr = arr;
		
		int current;
		
		boolean sorted = false;
		
		while(sorted == false) {
			
		sorted = true;
		
		for(int i = 0; i < arr.length-1; i++) {
			
		if(arr[i] > arr[i+1]) {
			
		current = arr[i+1];
		
		newarr[i+1] = arr[i];
		
		newarr[i]= current;
		
		sorted = false;
		
		}

		}
		
		}
		
		return newarr;	
		}

}