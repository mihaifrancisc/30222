package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird{
	//constructors
	public Parrot(){
		this( 97, false, "Parrot", 2);
	}
	
	public Parrot(int avgFlightAltitude, Boolean migrates, String name, int nrOfLegs) {
		super.setAvgFlightAltitude(avgFlightAltitude);
		super.setMigrates(migrates);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);	
	}
}
