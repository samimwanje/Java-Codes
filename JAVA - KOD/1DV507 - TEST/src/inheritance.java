import java.util.*; 

public class inheritance {

	public static void main(String[] args) {
		
		ArrayList<String> test = new ArrayList<String>();

		
		
		
		
		
		test.add("black");
		test.add("white");
		test.add("yellow");
		
		Iterator<String> It = test.iterator();
		
		
		while(It.hasNext()) {
			
			System.out.print(It.next().toUpperCase() +" ");
			
		}
		
		System.out.println();
		
		
		
		for(String e : test) {
			System.out.print(e.toUpperCase() +" ");
			
		}
		
		System.out.println("\nDONE SAMI.");
		
		

	}

}
