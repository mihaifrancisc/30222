package models.animals;



public class Salmon extends Aquatic{

	public Salmon() {
		nrOfLegs = 0 ;
		avgSwimDepth = 7;
		waterType = water.freshwater;
	}

	public Salmon(String name, int nrOfLegs, int avgSwimDepth, water waterType){
		this.name = name;
		this.nrOfLegs = nrOfLegs;
		this.avgSwimDepth = avgSwimDepth;
		this.waterType = waterType;
	}
}
