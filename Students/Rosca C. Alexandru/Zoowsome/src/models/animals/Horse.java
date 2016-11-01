package models.animals;

public class Horse extends Mammal{

	private boolean isRaceHorse;
	
	public Horse(){
		nrOfLegs = 4;
		name = "Horse";
		normalBodytemp = 38;
		percBodyHair = 90; 
		isRaceHorse = true;
	}
	public Horse(boolean isRaceHorse, float normalBodytemp, float percBodyHair){
		this();
		this.setRaceHorse(isRaceHorse);
		this.normalBodytemp = normalBodytemp;
		this.percBodyHair = percBodyHair;
	}
	public boolean isRaceHorse() {
		return isRaceHorse;
	}
	public void setRaceHorse(boolean isRaceHorse) {
		this.isRaceHorse = isRaceHorse;
	}
	
}
