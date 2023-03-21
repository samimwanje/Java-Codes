/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign1_3_ferry;

import java.util.ArrayList;

import java.util.Collections;

@SuppressWarnings("unused")
public class Ferry implements FerryInterface {
	
	
	private static ArrayList<Passenger> passengersArray = new ArrayList<Passenger>();				// ArrayList that holds passengers embarked.
	private static  ArrayList<Vehicle> vehicleArray = new ArrayList<Vehicle>();						// ArrayList that holds vehicles embarked.
	private static int money = 0;																	// Money earned
	
	public Ferry() {
		
	}

	
	protected void loadMoney(int $) {
		money += $;
		
	}
	
	public int countPassengers() {
		return passengersArray.size();				// Return loaded passengers.
	}

	@Override
	public int countVehicleSpace() {
		return 40-Math.round(Vehicle.getVehicles());					// Return rounded number of space left.
	}

	@Override
	public int countMoney() {
		
		return money;				// Return money earned.
	}

	@Override
	public Vehicle[] getAllVehicles() {
		
		Vehicle vArray[] = new Vehicle[vehicleArray.size()];			// Load vehicles embarked into a "Normal array".
		
		for(int x = 0; x < vehicleArray.size(); x++) {
	
			vArray[x] = vehicleArray.get(x);
			
		}
		
		return vArray;													// Return "normal" array.
	}
	

	@Override
	public void embark(Vehicle v) {
		
		for(int x = 0; x < vehicleArray.size(); x++) {					//  Check if embarked vehicle description (ID and vehicle-type) already exist in vehicle array.
		
		if((vehicleArray.get(x).toString()).equals(v.toString())) {	// Tell user and close program.
		
			System.out.println(v.toString().toUpperCase() +" is already embarked.");
			System.exit(0);
			}
		
		}
		
		vehicleArray.add(v);		// Otherwise embark vehicle to array.									
	
		
	}

	@Override
	public void embark(Passenger p) {
		passengersArray.add(p);							// Load passenger to array.
		
	}

	@Override
	public void disembark() {
		
		
		passengersArray = new ArrayList<Passenger>();					// Reset passengers loadad in array (ferry).
		
		vehicleArray = new ArrayList<Vehicle>();						// Reset vehicled loaded in array (ferry).
		
		Passenger.disembarkPassengers();								// Reset passengers embarked.
		
		Vehicle.disembarkAll();											// Reset vehicles embarked.
		
		System.out.println("**All the vehicles and passengers have now disembarked.**");  // Display success message.
	
		
		
	}

	@SuppressWarnings("static-access")
	@Override
	public boolean hasSpaceFor(Vehicle v) {	
		return v.getInfoVehicle();				// Check if there is space of a specific type of vehicle.
		
	}

	
	@Override
	public boolean hasRoomFor(Passenger p) {			// Check if there is room for one passanger.
		return p.getInfoPassengers();
		
	}
	
	
	public String toString() {							// String of ferry status.
	return "\n**********************" +"\nVehicles embarked: " +vehicleArray.size() +"\n**********************"  +"\nPassengers embarked: " +passengersArray.size() +"\n**********************" +"\nRounded space left: " +countVehicleSpace() +"\n**********************"  +"\nMoney earned: " +money +"\n**********************";
		
	}

	
}