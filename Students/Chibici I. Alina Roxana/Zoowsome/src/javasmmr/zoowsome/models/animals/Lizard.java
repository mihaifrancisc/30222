package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile{
	//constructors
	public Lizard(){
		this (true, "Lizard", 4);	
	}
	
	public Lizard(Boolean laysEggs, String name, int nrOfLegs) {
		super.setLaysEggs(laysEggs);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);		
	}
}

