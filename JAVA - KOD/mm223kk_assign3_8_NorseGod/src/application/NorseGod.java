package application;

public class NorseGod {
	
	
	private String name = "";
	private String race = "";
	private String desc = "";
	
	
	// No parameter. Constructor.
	NorseGod(){  
		  this.name = "";
		  this.race = "";
		  this.desc = "";
		
		
	}
	
	// Set name, race and desc constructor.
	NorseGod(String name, String race, String desc) {
		
		this.name = name;
		this.race = race;
		this.desc = desc;
	
	}
	
	// Method that return the name.
	public String getName(){
		return this.name;
		
	}
	
	// Method that sets the name.
	public void setName(String name){
		
		this.name = name;
	}
	
	// Method that return the race.
	public String getRace() {
		
	return	this.race = race;
	}
	
	// Method that return information about the Norse God.
	public String getDesc() {
		
		return this.desc;
		
	}
	
	// Set information about the Norse God.
	public void setDesch(String desc) {
		
		
		this.desc = desc;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
	
	