package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile{
	public Snake(Boolean laysEggs, String name, int nrOflegs) {
		this.setLaysEggs(laysEggs); 
		this.setName(name); 
		this.setNrOfLegs(nrOflegs);
	}
	
	public Snake() {
		this(true, "Snicky", 0);
	}

}
