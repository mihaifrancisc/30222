package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	
	public Tiger( float normalBodyTemp, float percBodyHair, String name, int nrOfLegs) {
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setNrOfLegs(nrOfLegs);
		this.setPercBodyHair(percBodyHair);
	}
	
	public Tiger() {
		this(15, 80, "Tigy", 4);
	}

}
