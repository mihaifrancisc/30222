package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	public Shark(int avgSwimDepth, String name, int nrOfLegs) {
		this.setAvgSwimDepth(avgSwimDepth);
		this.setName(name); 
		this.setNrOfLegs(nrOfLegs);
	}
	
	public Shark() {
		this(110, "Sharky", 3);
	}

}
