package models.animals;

public class Crocodile extends Reptile{

	private int length; 
	
	public Crocodile(){
		nrOfLegs = 4;
		name = "Crocodile";
		laysEggs = true;
		length = 4;
	}
	
	public Crocodile(int length, boolean laysEggs){
		this();
		this.setLength(length);
		this.laysEggs = laysEggs;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}
