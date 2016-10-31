package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {

	int avgSwimDepth;
	public enum waterType {
		
		saltwater, freshwater
	}
	
	
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
}
