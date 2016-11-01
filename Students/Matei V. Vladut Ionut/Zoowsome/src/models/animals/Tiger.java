package models.animals;

public class Tiger extends Mammal {
	
	public Tiger() {
		name = "Tiger";
		nrOfLegs = 4;
		normalBodyTemp = 50f;
		percBodyHair = 1f;
	}

	public Tiger(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
