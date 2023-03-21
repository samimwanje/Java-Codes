
import java.util.Scanner;

public class Youtube {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Mwanjes test1 = new Mwanjes();
		
		
		System.out.print("Enter you name here: ");
		
		String myname = input.nextLine();
		
		test1.sayhello(myname);
		
		input.close();

	}
	

}
