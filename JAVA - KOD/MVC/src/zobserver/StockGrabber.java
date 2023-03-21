package zobserver;

import java.util.ArrayList;

public class StockGrabber implements Subject{
	
	
	private ArrayList<Observer> observers;
	private  double imbPrice;
	private double applePrice;
	private double googlePrice;
	
	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}
	

	@Override
	public void register(Observer newObserver) {
		
		observers.add( newObserver );
		
	}

	@Override
	public void unRegister(Observer deleteObserver) {
		
		int observerIndex = observers.indexOf(deleteObserver);
		observers.remove(observerIndex);
		System.out.println("Observer " + (observerIndex+1) +" deleted");
		
	}

	@Override
	public void notifyObserver() {
		for(Observer observer : observers) {
				observer.update(imbPrice, applePrice, googlePrice);
		}
	}
	
	public void setIBMPrice(double newIBMPrice) {
		this.imbPrice = newIBMPrice;
		notifyObserver();
		
	}
	
	public void setApplePrice(double newApplePrice) {
		this.imbPrice = newApplePrice;
		notifyObserver();
		
	}
	
	public void setGooglePrice(double newGooglePrice) {
		this.imbPrice = newGooglePrice;
		notifyObserver();
		
	}
	

}
