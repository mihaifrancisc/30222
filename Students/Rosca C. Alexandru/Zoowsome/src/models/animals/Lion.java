package models.animals;

public class Lion extends Mammal{
	
	private float weight;
	
	public Lion(){
		nrOfLegs = 4;
		name = "Lion";
		normalBodytemp = 37;
		percBodyHair = 100; 
		weight = 70;
	}
	
	public Lion(float weight, float normalBodytemp, float percBodyHair){
		this();
		this.setWeight(weight);
		this.normalBodytemp = normalBodytemp;
		this.percBodyHair = percBodyHair;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
}
