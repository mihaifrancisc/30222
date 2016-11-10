package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{
	//constructors
	public Butterfly(){
		this (true, false, "Butterfly", 6);
	}
	
	public Butterfly(Boolean canFly, Boolean isDangerous, String name, int nrOfLegs) {
		super.setCanFly(canFly);
		super.setIsDangerous(isDangerous);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);		
	}
}
