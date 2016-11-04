package models.animals;

public abstract class Aquatic extends Animal {
	public int avgSwimDepth;
	public enum water {
		saltwater, freshwater
	}
	public water waterType;
	
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	public water getWaterType() {
		return waterType;
	}
	public void setWaterType(water waterType) {
		this.waterType = waterType;
	}
}
