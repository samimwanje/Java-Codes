import java.util.Scanner;



public class metodik2 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		metodik test2 = new metodik();
		
		
		System.out.print("Please type the girls name: ");
		
		
		String girlsname = input.nextLine();
		
		
		test2.SetName(girlsname);
		
		test2.saying();
		
		input.close();


	}
	
}
