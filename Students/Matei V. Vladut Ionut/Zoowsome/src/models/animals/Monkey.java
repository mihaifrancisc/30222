package models.animals;

public class Monkey extends Mammal{
	
	
	public Monkey() {
		name = "Monkey";
		nrOfLegs = 2;
		normalBodyTemp = 31.9f;
		percBodyHair = 0.88f;
	}
	
	public Monkey(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}

}
