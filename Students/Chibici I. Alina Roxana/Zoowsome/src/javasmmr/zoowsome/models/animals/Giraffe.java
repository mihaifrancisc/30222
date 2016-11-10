package javasmmr.zoowsome.models.animals;

public class Giraffe extends Mammal{
	//constructors
	public Giraffe(){
		this ( (float)38.5, 95, "Giraffe", 4);
	}
	
	public Giraffe(float normalBodyTemp, float percBodyHair, String name, int nrOfLegs) {
		super.setNormalBodyTemp(normalBodyTemp);
		super.setPercBodyHair(percBodyHair);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);		
	}
}
