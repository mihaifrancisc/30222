package models.animals;

public class Spider extends Insect {

	public Spider() {
		name = "Spider";
		nrOfLegs = 8;
		canFly = false;
		isDangerous = true;
	}

	public Spider(String name, int nrOfLegs, boolean canFly, boolean isDangerous){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
