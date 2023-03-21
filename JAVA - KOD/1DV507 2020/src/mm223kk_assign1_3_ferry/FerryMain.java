/* 

		Elevmail: mmm223kk@student.lnu.se

		Namn: Sami Mwanje.                     */
package mm223kk_assign1_3_ferry;

public class FerryMain {

	public static void main(String[] args) throws Exception {

		Ferry test = new Ferry();																	// Create new Ferry object.

		
		
				// Embark 20 passengers.
		
				for(int x = 0; x < 20; x++) {
				test.embark(new Passenger("FreePassenger",1)); 										// Passenger( "ID/name", withVehicle? )
				}
				
				System.out.println(test.toString());												// Print string of ferry status.
				System.out.println();
			
		
				test.disembark();																	// Disembark all passengers and vehicles.
				System.out.println("Earned money: " +test.countMoney());
				System.out.println("Number of passengers on board: " +test.countPassengers());							// Count passengers on board.
				System.out.println("Correctly rounded off vehicle space: " +test.countVehicleSpace());							// Count vehicles on board.
				
				System.out.println();
				test.embark(new Vehicle("car","xyz",4)); 											// create embark a new Vehicle( "car/bicycle/ferry..." , "ID" , Passengers on board) 							
				test.embark(new Vehicle("bus","xyz",4)); 											// Totalt 8 passengers.
				
				
				
				System.out.println();
				System.out.println("Number of passengers on board: " +test.countPassengers());							// Count passengers on board.
				System.out.println("Correctly rounded off vehicle space: " +test.countVehicleSpace());							// Count vehicles on board.
				
				
				
				System.out.println();
				test.disembark();
				System.out.println("Earned money: " +test.countMoney());
				System.out.println("Number of passengers on board: " +test.countPassengers());							// Count passengers on board.
				System.out.println("Correctly rounded off vehicle space: " +test.countVehicleSpace());							// Count vehicles on board.
				
				
				
				
				System.out.println();
				test.embark(new Vehicle("car","XYZ1",1)); 
				test.embark(new Vehicle("car","XY7Z2",1));
				test.embark(new Vehicle("bicycle","XYZ3")); 
				test.embark(new Vehicle("car","XYZ4",1)); 
				test.embark(new Vehicle("lorry","XYZ5",1)); 
				test.embark(new Vehicle("bicycle","XYZ6")); 											// Bicycle is always with passenger.
				test.embark(new Vehicle("bicycle","XYZ7")); 											// Bicycle is always with passenger.
				
				
				for(int x = 0; x < test.getAllVehicles().length; x++ )
				System.out.println(test.getAllVehicles()[x]);
				
				
				System.out.println(test.toString());	


	}
	
	
}
