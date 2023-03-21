import java.util.Scanner;


public class Test {
	
	
	
	
	public static void main(String args[]) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter name: ");
		
		String name = input.nextLine();
		
		System.out.print("Enter age: ");
		
		int age = input.nextInt();
		

		first firstobj = new first(name, age); 								// Skapar objekt.
	 
		
		System.out.println("The name is: " +firstobj.alias());
		
		System.out.println("The age is: " +firstobj.age());

		
		input.close();
		
		}
	
}
