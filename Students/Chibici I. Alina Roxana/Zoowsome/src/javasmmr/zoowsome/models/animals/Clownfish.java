package javasmmr.zoowsome.models.animals;

public class Clownfish extends Aquatic{
	//constructors
	public Clownfish(){
		this (30, typesOfWater.SALTWATER, "Clownfish", 0);
	}
	
	public Clownfish(int avgSwimDepth, typesOfWater waterType, String name, int nrOfLegs) {
		super.setAvgSwimDepth(avgSwimDepth);
		super.setWaterType(waterType);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);		
	}
}
