package basics;

public class Variabler {
	
	public static void main(String arg[]) {
		
		int x = 10;		// Integer heltal.
		
		System.out.println("Integer: " +x );	// Printar ut x.
		
		float z = 1/2;							// Decimaltal och heltal.
		
		System.out.println(z);					// Printar ut z.
		
		double y = 3.5;								// Double är som float men använder mer minne. Du kan skriv som en decimal.
		
		System.out.println(y);						// Printar ut y.
		
		boolean test = true;						// boolean kan antingen vara true eller false. Alternativ 1 eller 0
		
		System.out.println(test);					// Printar ut test variablen.
		
		test = false;								// Ändra test till false.
		
		System.out.println(test);					// Printar ut test variablen.
		
		
		char letter = 'g';							// Håller i enskilda v boksträver och siffror.	
		
		
		System.out.println(letter);
		
		String name = "Hassan";						// Håller i text.	
		String aftername = "Jundi";					// Håller i text.
		String fullName = "Hassan Jundi";
		
		System.out.println(name);
		System.out.println(aftername);
		System.out.println(fullName);
		
		
		System.out.println(name +" " +aftername);
		System.out.println("Hassan Hamid " +test +letter);
		
		int age = 23;
		
		String info = "Jag är ";
		
		System.out.print(info +age +" år gammal");

		
		
	}
	

}
