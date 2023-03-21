
public class infiniti {

	public static void main(String[] args) {

	System.out.println(average(1,2,3,4,5));
		
		}
	
	public static int average(int...numbers) {
		
		int totalt = 0;
		
		for(int x: numbers)
			totalt +=x;			
			return totalt/numbers.length;
		

	}

}