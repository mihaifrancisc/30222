package javasmmr.zoowsome.models.animals;

public class Tuna extends Aquatic{
	//constructors
	public Tuna(){
		this (1000, typesOfWater.SALTWATER, "Tuna", 0);
	}
	
	public Tuna(int avgSwimDepth, typesOfWater waterType, String name, int nrOfLegs) {
		super.setAvgSwimDepth(avgSwimDepth);
		super.setWaterType(waterType);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);	
	}
}

