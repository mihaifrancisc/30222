package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	public Cockroach(Boolean canFly, Boolean isDangerous, String name, int nrOfLegs) {
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}
	public Cockroach() {
		this(true, true, "Gandi", 8);
	}
}
