package models.animals;


public class Shark extends Aquatic{

	public Shark() {
		name = "Shark";
		nrOfLegs = 0 ;
		avgSwimDepth = 79;
		waterType = water.saltwater;
	}

	public Shark(String name, int nrOfLegs, int avgSwimDepth, water waterType){
		this.name = name;
		this.nrOfLegs = nrOfLegs;
		this.avgSwimDepth = avgSwimDepth;
		this.waterType = waterType;
	}
}
