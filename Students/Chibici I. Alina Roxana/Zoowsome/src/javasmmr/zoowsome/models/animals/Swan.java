package javasmmr.zoowsome.models.animals;

public class Swan extends Bird{
	//constructors
	public Swan(){
		this (4000, true, "Swan", 2);	
	}
	
	public Swan(int avgFlightAltitude, Boolean migrates, String name, int nrOfLegs) {
		super.setAvgFlightAltitude(avgFlightAltitude);
		super.setMigrates(migrates);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);	
	}
}
