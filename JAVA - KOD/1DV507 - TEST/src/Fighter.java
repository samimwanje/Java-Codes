
public class Fighter extends Starship{
	
	private int noOfWeapons;
	
	
	public Fighter() {}
	
	public Fighter(int noOfWeapons) {
		this.noOfWeapons = noOfWeapons;
		
	}
	
	public int getNoOfWeapons() {
		
		return noOfWeapons;
	}
	
	public void setNoOfWeapons(int noOfWeapons) {
		
		this.noOfWeapons = noOfWeapons;
		
	}
	

}