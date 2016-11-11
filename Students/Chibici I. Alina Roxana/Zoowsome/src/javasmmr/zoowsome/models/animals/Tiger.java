package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{
	//constructors
	public Tiger(){
		this ( (float)37.5, 95, "Tiger", 4);	
	}
	
	public Tiger(float normalBodyTemp, float percBodyHair, String name, int nrOfLegs) {
		super.setNormalBodyTemp(normalBodyTemp);
		super.setPercBodyHair(percBodyHair);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);			
	}
}

