/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */

package mm223kk_assign1_3_ferry;

	public class Vehicle extends Ferry{
	
	private String  type = "standard";					// Type of vehicle
	
	private  String  ID = "standard";					// ID so not same vehicle can embark twice.
	
	private static int currentVehicleSpace = 0;			// Current space for vehicles that is going to embark.
	
	private static long vehicleSpace = 0;				// Vehicle space used.
	
	@SuppressWarnings("unused")
	private static int vehiclesEmbarked = 0;			// Vehicles embarked.
	
	private int currentPassengers = 0;					// Passengers embarked.
	
	
		// Constructor used to create vehicle with passengers.
	
	
		protected Vehicle(String type, String ID, int passengers) throws Exception {
		
			currentPassengers = passengers;					// Set passengers on vehicle 
			
		if(type.equals("car")) {							// Check for vehicle type.
			this.ID = ID;									// Set id. Used so same vehicle can't embark twice.
			this.type = "car";								// Set type to car.
			currentVehicleSpace = 1;						// Change currentVehicleSpace to same as the vehicle type.
			loadCar(passengers);							// loadvehicle.
			
		}
		else if(type.equals("bus")) {
			this.type = "bus";
			this.ID = ID;
			currentVehicleSpace = 4;
			loadBus(passengers);
			
		}
		
		else if(type.equals("lorry")) {
			this.type = "lorry";
			this.ID = ID;
			currentVehicleSpace = 8;
			loadLorry(passengers);
			
		}
		else {
			throw new Exception("Wrong vehicle type.");				// If type does not match then throw Exception.
			
		}
		
		
	
	}
	
			
		// Constructor used to create vehicle with NO passengers.
		
		
		protected Vehicle(String type, String ID) throws Exception {
			
			currentPassengers = 0;
				
			if(type.equals("car")) {
				this.type = "car";
				this.ID = ID;
				currentVehicleSpace = 1;				
				loadCar(0);
				
			}
			else if(type.equals("bicycle")) {					// Bike is implemented here because bike comes with only one passenger allways.
				this.type = "bicycle";
				this.ID = ID;
				currentPassengers = 1;
				currentVehicleSpace = 1/5;
				loadBicycle();
				
			}
			else if(type.equals("bus")) {
				this.type = "bus";
				this.ID = ID;
				currentVehicleSpace = 4;
				loadBus(0);
				
			}
			
			else if(type.equals("lorry")) {
				this.type = "lorry";
				this.ID = ID;
				currentVehicleSpace = 8;
				loadLorry(0);
				
			}
			else {
				throw new Exception("Wrong vehicle type.");
				
			}	
	
			}
	
		
		// Constructor used by ferry to control if ferry has space for Vehicle.
		
		protected Vehicle(String type) throws Exception {
			
			currentPassengers = 0;
			
			if(type.equals("car")) {
				currentVehicleSpace = 1;			// Change currentVehicleSpace to same as the vehicle type.
				this.type = "car";
				
			}
			else if(type.equals("bicycle")) {
				
				currentVehicleSpace = 1/5;		
				this.type = "bicycle";
				
			}
			else if(type.equals("bus")) {
				
			
				currentVehicleSpace = 4;
				this.type = "bus";
			}
			
			else if(type.equals("lorry")) {
				currentVehicleSpace = 8;
				this.type = "lorry";
				
			}
			else {
				throw new Exception("Wrong vehicle type.");
				
			}
			
		}
		
		
	
		
			//Set up vehicle object with id and type. Also load passengers.
		
			private void loadCar(int passengers) throws Exception {
				
				currentPassengers = passengers;
			
				if( !getInfoVehicle() ) {										// Exception  if there is no space for car.
					
					throw new Exception("The ferry does not have space for this car.");			
				}
				
				
				if( passengers > 4 || passengers < 0) {							// Exception if car doesn't fill up to the rules (maximum 4 passengers).
					
					throw new Exception("The car can max carry 4 passengers."); 
					}
				
					else {													// Embark the amount of passengers, each one with an unique id.
						
					String ID2 = ID;
					for(int x = 0; x < passengers; x++) {					// If more then one passenger, load one at the time.
					ID2 += x;
					embark(new Passenger(ID2,0));							
					}
					vehicleSpace += currentVehicleSpace;					// Increase used space in "garage".
					loadMoney( 100 + passengers*20);							// Add money.
					vehiclesEmbarked++;										// Increase embarked vehicles.
					
					}
					}
		
		
			private void loadLorry(int passengers) throws Exception {

			if( !getInfoVehicle() ) {										// Exception  if there is no space for Lorry.
				
				throw new Exception("The ferry does not have space for this lorry.");			
			}
			
			
			
			if( passengers > 2 || passengers < 0) {							// Exception if Lorry doesn't fill up to the rules (maximum 2 passengers).
				
				throw new Exception("A lorry can maximum hold 2 passengers."); 
				
				}
				else {														// Embark the amount of passengers, each one with an unique id.
				String ID2 = ID;
				for(int x = 0; x < passengers; x++) {	
				ID2 += x;
				embark(new Passenger(ID2,0));
				}
				vehicleSpace += currentVehicleSpace;
				loadMoney(300 + passengers*20);								// Change money.
				vehiclesEmbarked ++;
				}
			}

			private void loadBicycle() throws Exception {


				if( !getInfoVehicle() ) {										// Exception  if there is no space for car.
					
					throw new Exception("The ferry does not have space for this lorry.");			
				}
				else {
					String ID2 = ID;
				
					embark(new Passenger(ID2,1));
					vehicleSpace += currentVehicleSpace;
					loadMoney(15);
					vehiclesEmbarked ++;
				}
				}
	

			private void loadBus(int passengers) throws Exception {
				
				if( !getInfoVehicle() ) {										// Exception  if there is no space for car.
					
					throw new Exception("The ferry does't have space for " +passengers +" passengers on this " +type +".");			
				}
				
				
				
				if( passengers > 20 || passengers < 0) {							// Exception if car doesn't fill up to the rules (maximum 4 passengers).
					
					throw new Exception("A bus can't carry more then 20 passengers."); 
					}
				
					else {
					String ID2 = ID;
					for(int x = 0; x < passengers; x++) {	
					ID2 += x;
					embark(new Passenger(ID2,0));
					}
					vehicleSpace += currentVehicleSpace;
					loadMoney(200 + passengers*15);
					vehiclesEmbarked++;
					
					}
			
		}
			
					
			
			
			// Methods used by ferry.
			
		

			protected static void disembarkAll() {			// Reset values for embarked Vehicles,vehicleSpace and currentVehicleSpace...
			
				
				currentVehicleSpace = 0;
				 
				vehicleSpace = 0;
				
				vehiclesEmbarked = 0;
				
	
				
			}

			
			protected static long getVehicles() {
				
				return vehicleSpace;					// Return space used.
				
			}
			
	
			protected static boolean getInfoVehicle() {

				if(vehicleSpace+currentVehicleSpace > 40)			// Check if "current vehicles size" + "garage space left" is larger than 40.
				return false;
				else
				return true;
				
			}
									
			protected String getInfo() { 					// String used when we embark a vehicle.
			return  "**" +type.toUpperCase() +" EMBARKED**          **ID: "  +ID +"**        **PASSENGERS EMBARKED: " +currentPassengers  +"**";
				
		}
			
			public String toString() {						// Info about current vehicle obecjt.
				return type +" ID: " +ID;
				
				
				
			}

		}