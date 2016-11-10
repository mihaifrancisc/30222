package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider(Boolean canFly, Boolean isDangerous, String name, int nrOfLegs) {
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setName(name); 
		this.setNrOfLegs(nrOfLegs);
	}
	public Spider() {
		this(true, true, "Spidy", 8);
	}
}
