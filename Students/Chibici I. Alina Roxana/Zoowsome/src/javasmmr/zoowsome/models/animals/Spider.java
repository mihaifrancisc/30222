package javasmmr.zoowsome.models.animals;

public class Spider extends Insect{
	//constructors
	public Spider(){
		this (true, true, "Spider", 8);	
	}
	
	public Spider(Boolean canFly, Boolean isDangerous, String name, int nrOfLegs) {
		super.setCanFly(canFly);
		super.setIsDangerous(isDangerous);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);		
	}
}
