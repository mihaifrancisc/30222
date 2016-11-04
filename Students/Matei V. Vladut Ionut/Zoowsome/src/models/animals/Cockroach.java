package models.animals;

public class Cockroach extends Insect {

	public Cockroach() {
		name = "Cockroach";
		nrOfLegs = 4;
		canFly = false;
		isDangerous = true;
	}

	public Cockroach(String name, int nrOfLegs, boolean canFly, boolean isDangerous){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
