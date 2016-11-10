package javasmmr.zoowsome.models.animals;

public class Piranha extends Aquatic{
	//constructors
	public Piranha(){
		this (50, typesOfWater.SALTWATER, "Piranha", 0);
	}
	
	public Piranha(int avgSwimDepth, typesOfWater waterType, String name, int nrOfLegs) {
		super.setAvgSwimDepth(avgSwimDepth);
		super.setWaterType(waterType);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);	
	}
}
