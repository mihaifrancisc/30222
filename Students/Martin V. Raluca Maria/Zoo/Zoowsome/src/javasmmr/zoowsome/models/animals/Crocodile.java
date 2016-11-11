package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile{
	public Crocodile(Boolean laysEggs, String name, int nrOflegs) {
		this.setLaysEggs(laysEggs);
		this.setName(name);
		this.setNrOfLegs(nrOflegs);
	}
	
	public Crocodile() {
		this(true, "Crocky", 4);
	}

}
