package models.animals;

public class Lizzard extends Reptile {

	public Lizzard() {
		name = "Lizzard";
		nrOfLegs = 4;
		layEggs = true;
	}

	public Lizzard(String name, int nrOfLegs, boolean layEggs){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setLayEggs(layEggs);
	}

}
