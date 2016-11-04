package javasmmr.zoowsome.models.animals;

public class Lizzard extends Reptile{
	public Lizzard(Boolean laysEggs, String name, int nrOflegs) {
		this.setLaysEggs(laysEggs); 
		this.setName(name); 
		this.setNrOfLegs(nrOflegs);
	}
	
	public Lizzard() {
		this(true, "Lizzy", 4);
	}
}
