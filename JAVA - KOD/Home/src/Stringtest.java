

import java.util.Scanner; // Hamta Scanner fran klassbiblioteket 

public class Stringtest {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

// legth
	System.out.print("Type the legth = ");
	double legth = input.nextDouble();
	
// width	
	System.out.print("Type the width = ");
	double width = input.nextDouble();
	
	System.out.println("The area of the rektangel is: " +legth*width);
	input. close();
	}

}
