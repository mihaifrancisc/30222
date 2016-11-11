package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile{
	//constructors
	public Snake(){
		this ( true, "Snake", 0);
	}
	
	public Snake(Boolean laysEggs, String name, int nrOfLegs) {
		super.setLaysEggs(laysEggs);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);		
	}
}
