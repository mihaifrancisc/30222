package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic{
	public Dolphin(int avgSwimDepth, String name, int nrOfLegs) {
		this.setAvgSwimDepth(avgSwimDepth);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}
	
	public Dolphin() {
		this(60, "Dolphy", 3);
	}

}
