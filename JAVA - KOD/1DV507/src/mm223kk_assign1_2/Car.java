package mm223kk_assign1_2;

import java.util.Iterator;

public class Car extends Vehicle implements Ferry {

	@Override
	public int countPassengers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countVehicleSpace() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countMoney() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<Vehicle> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void embark(Vehicle v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void embark(Passenger p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disembark() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasSpaceFor(Vehicle v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasRoomFor(Passenger p) {
		// TODO Auto-generated method stub
		return false;
	}

}
