package javasmmr.zoowsome.models.animals;

public class Lion extends Mammal{
	//constructors
	public Lion(){
		this( (float)38, 95, "Lion", 4);	
	}
	
	public Lion(float normalBodyTemp, float percBodyHair, String name, int nrOfLegs) {
		super.setNormalBodyTemp(normalBodyTemp);
		super.setPercBodyHair(percBodyHair);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);		
	}
}

