
public class SystemTime {

	public static void main(String[] args) {
		
		// Converting current Millis to min and s.
		
		long totalMillis = System.currentTimeMillis();
		
		long seconds = totalMillis/(1000);
		
		
		long minutes = (seconds/60);
				
		long currentS = (seconds % 60);
		

		
		System.out.print("The current time online is: " +minutes +" minutes and " +currentS +" seconds.");
		

	}

}
