package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird{
	//constructors
	public Eagle(){
		this (1200, true, "Eagle", 2);
	}
	
	public Eagle(int avgFlightAltitude, Boolean migrates, String name, int nrOfLegs) {
		super.setAvgFlightAltitude(avgFlightAltitude);
		super.setMigrates(migrates);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
	}
}
