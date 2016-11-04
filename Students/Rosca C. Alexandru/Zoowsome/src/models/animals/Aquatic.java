package models.animals;

public abstract class Aquatic extends Animal {
	
	protected int avgSwimDepth;
	protected enum waterType  {saltWater, freshwater}
	
	public int getAvgSwinDepth() {
		return avgSwimDepth;
	}
	public void setAvgSwinDepth(int avgSwinDepth) {
		this.avgSwimDepth = avgSwinDepth;
	}
	
	
	
}
