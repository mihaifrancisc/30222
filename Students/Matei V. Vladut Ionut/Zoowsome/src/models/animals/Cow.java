package models.animals;

public class Cow extends Mammal {
	
	
	public Cow() {
		name = "Cow";
		nrOfLegs = 4;
		normalBodyTemp = 35.8f;
		percBodyHair = 0.7f;
	}

	public Cow(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
