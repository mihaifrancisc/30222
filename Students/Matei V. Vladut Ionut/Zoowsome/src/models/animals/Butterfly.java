package models.animals;

public class Butterfly extends Insect {

	public Butterfly() {
		name = "Butterfly";
		nrOfLegs = 2;
		canFly = true;
		isDangerous = false;
	}
	
	public Butterfly(String name, int nrOfLegs, boolean canFly, boolean isDangerous){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
