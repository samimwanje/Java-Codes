/* 

		Elevmail: mmm223kk@student.lnu.se

		Namn: Sami Mwanje.                     */
package mm223kk_assign1_3_ferry;



	public class Passenger extends Ferry {
	
		@SuppressWarnings("unused")
		private String idPassenger;						// Id for passengers
		
		private static int  passengers = 0;				// Number of embarked passengers.
		
		protected Passenger(String idPassenger, int singlePassenger) throws Exception{
				
		if( !getInfoPassengers()) {				// Check if passengers can fit.
			
		throw new Exception("The ferry can only take: " +(200-passengers) +" more passengers.");

		}
			else {
				
		passengers += 1;															// increase passenger variable.
		this.idPassenger = idPassenger;												// Set passenger ID.
		if( singlePassenger == 1)													// Checks if passenger is alone or with vehicle.
			loadMoney(25);																// 

			}
		
			
		}
		
		
		protected  int getPassengers() {												// Used by ferry to get embarked passengers.
			return passengers;
		}
		
			
		protected  boolean getInfoPassengers() {										// Check if there is space for more passenger.
			
			if(passengers+1 >= 200)
				return false;
				else 
				return true;
			}


		public static void disembarkPassengers() {										// Reset passengers.
			passengers = 0;
			
		}
			
			
		}
		
