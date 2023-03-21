
public class Population {


	public static void main(String[] args) {
		double sec = 31556926.0;
		double now = 31203486.0;
		double year = 5.0;
		
		System.out.println( "Population now: "+ now);

		System.out.print( "\nPopulation for each of the next five years: " );
		System.out.print(now + year*( (sec/45) + (sec/7) - (sec/13)) );
		
	}

}
