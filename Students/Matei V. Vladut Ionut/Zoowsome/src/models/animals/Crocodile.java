package models.animals;

public class Crocodile extends Reptile{

	public Crocodile() {
		name = "Croco";
		nrOfLegs = 4;
		layEggs = true;
	}
	
	public Crocodile(String name, int nrOfLegs, boolean layEggs){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setLayEggs(layEggs);
	}
}
