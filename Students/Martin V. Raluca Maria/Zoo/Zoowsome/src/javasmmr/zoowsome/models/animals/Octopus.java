package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic {
	public Octopus(int avgSwimDepth, String name, int nrOfLegs) {
		this.setAvgSwimDepth(avgSwimDepth); 
		this.setName(name); 
		this.setNrOfLegs(nrOfLegs); 
	}
	
	public Octopus() {
		this(100, "Octy", 8);
	}
}
