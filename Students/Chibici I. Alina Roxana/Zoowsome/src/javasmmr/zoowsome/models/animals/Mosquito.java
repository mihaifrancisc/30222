package javasmmr.zoowsome.models.animals;

public class Mosquito extends Insect{
	public Mosquito(){
		this (true, true, "Mosquito", 6);	
	}
	
	public Mosquito(Boolean canFly, Boolean isDangerous, String name, int nrOfLegs) {
		super.setCanFly(canFly);
		super.setIsDangerous(isDangerous);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);		
	}
}

