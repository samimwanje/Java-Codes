import java.util.Random;
public class mattetest {
	
	
	
	
	public static void main(String[] args) {
		
		
		Random dice = new Random();
		
		int number;
		
		for(int i = 0; i < 10; i++) {
		
			number = 10 + dice.nextInt(11);
			
			System.out.print(number +" "); 
		
		}
		
	
	}
	
}
