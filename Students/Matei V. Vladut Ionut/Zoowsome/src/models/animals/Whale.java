package models.animals;

public class Whale extends Aquatic {

	public Whale() {
		name = "Whale";
		nrOfLegs = 0 ;
		avgSwimDepth = 132;
		waterType = water.saltwater;
		
	}
	
	public Whale(String name, int nrOfLegs, int avgSwimDepth, water waterType){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}

}
