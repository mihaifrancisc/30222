package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	private enum waterType {
		ocean, sea, lake, river
	}
	
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth( int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	

}
