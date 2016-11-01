package models.animals;

public class Snake extends Reptile{

	private boolean isPoisonous; 
	
	public Snake(){
		nrOfLegs = 0;
		name = "Snake";
		laysEggs = true;
		isPoisonous = true;
	}
	
	public Snake(boolean isPoisonous, boolean laysEggs){
		this();
		this.setPoisonous(isPoisonous);
		this.laysEggs = laysEggs;
		
	}

	public boolean isPoisonous() {
		return isPoisonous;
	}

	public void setPoisonous(boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
	}
	
}
