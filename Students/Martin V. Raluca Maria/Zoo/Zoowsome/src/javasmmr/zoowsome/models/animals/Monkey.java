package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	public Monkey(float normalBodyTemp, float percBodyHair, String name, int nrOfLegs) {
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setNrOfLegs(nrOfLegs);;
		this.setPercBodyHair(percBodyHair);
	}
	
	public Monkey() {
		this(15, 80, "Monkyy", 4);
	}

}
