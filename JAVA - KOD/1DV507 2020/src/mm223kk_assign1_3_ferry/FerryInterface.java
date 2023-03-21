package mm223kk_assign1_3_ferry;

/* 

Studentmail: mmm223kk@student.lnu.se
Username: mmm223kk
Namn: Sami Mwanje.                     */


public interface FerryInterface  {
	   int countPassengers();             // Number of passengers on board
	   int countVehicleSpace();           // Correctly rounded off vehicle space. One car is 1
	   int countMoney();                  // Earned money
	   Vehicle[] getAllVehicles();        // An array containing all embarked vehicles   
	   void embark(Vehicle v);            // Embark vehicle, exception if not enough space
	   void embark(Passenger p);          // Embark passenger, exception if not enough room
	   void disembark();                  // Clear (empty) ferry. The money earned remains, 
	                                      // i.e., is not reset to zero 
	   boolean hasSpaceFor(Vehicle v);    // true if we can embark vehicle v
	   boolean hasRoomFor(Passenger p);   // true if we can embark passenger p
	   String toString();                 // Nice looking ferry status print out

	}