package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
	public Cow(float normalBodyTemp, float percBodyHair, String name, int nrOfLegs) {
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setNrOfLegs(nrOfLegs);
		this.setPercBodyHair(percBodyHair);
	}
	
	public Cow() {
		this(15, 40, "Stella", 4);
	}
}
