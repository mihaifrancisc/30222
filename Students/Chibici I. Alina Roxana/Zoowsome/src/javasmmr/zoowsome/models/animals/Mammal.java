package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal{
	//attributes
	private float normalBodyTemp;
	private float percBodyHair;
	
	//methods
	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}
	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}
	public float getPercBodyHair() {
		return percBodyHair;
	}
	public void setPercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}

}
