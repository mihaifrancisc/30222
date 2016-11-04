package models.animals;

public class Frog extends Aquatic{

	private boolean isPoisonous;
	
	public Frog(){
		nrOfLegs = 4;
		name = "Frog";
		avgSwimDepth = 1;
		setPoisonous(false);
	}
	
	public Frog(boolean isPoisonous, int avgSwimDepth ){
		this();
		this.setPoisonous(isPoisonous);
		this.avgSwimDepth = avgSwimDepth;
	}

	public boolean isPoisonous() {
		return isPoisonous;
	}

	public void setPoisonous(boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
	}
}
