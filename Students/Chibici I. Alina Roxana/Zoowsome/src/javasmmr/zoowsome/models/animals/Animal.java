package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	//attributes
	private int nrOfLegs = 0;
	private String name = "Undefined";
	
	//methods
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrOfLegs(int nrOfLegs){
		this.nrOfLegs = nrOfLegs;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}	
}
