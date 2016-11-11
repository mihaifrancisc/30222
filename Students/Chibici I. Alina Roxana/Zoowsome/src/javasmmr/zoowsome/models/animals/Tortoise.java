package javasmmr.zoowsome.models.animals;

public class Tortoise extends Reptile{
	//constructors
	public Tortoise(){
		this (true, "Tortoise", 4);	
	}
	
	public Tortoise(Boolean laysEggs, String name, int nrOfLegs) {
		super.setLaysEggs(laysEggs);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);		
	}
}
