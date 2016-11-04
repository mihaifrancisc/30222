package models.animals;

public class Turtle extends Reptile{

	public Turtle() {
		name = "Mutant Ninja Turtle";
		nrOfLegs = 4;
		layEggs = true;
	}
	
	public Turtle(String name, int nrOfLegs, boolean layEggs){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setLayEggs(layEggs);
	}

}
