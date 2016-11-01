package models.animals;

public class Woodpecker extends Bird{

	private int noOfEggs;
	
	public Woodpecker(){
		nrOfLegs = 4;
		name = "Wookpecker";
		avgFlightAltitude = 10;
		migrate = false;
		setNoOfEggs(4);
	}
	
	public Woodpecker(int noOfEggs, boolean migrate, int avgFlightAltitude){
		this();
		this.setNoOfEggs(noOfEggs);
		this.migrate = migrate;
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public int getNoOfEggs() {
		return noOfEggs;
	}

	public void setNoOfEggs(int noOfEggs) {
		this.noOfEggs = noOfEggs;
	}
}
