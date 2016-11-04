package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(Boolean canFly, Boolean isDangerous, String name, int nrOfLegs) {
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}
	public Butterfly() {
		this(true, true, "Zimi", 8);
	}
	
	
		

}
