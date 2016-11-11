package javasmmr.zoowsome.models.animals;

public class Flamingo extends Bird {
	public Flamingo(Boolean migrates, int avgFlightAltitude, String name, int nrOfLegs) {
		this.setAvgFlightAltitude(avgFlightAltitude); 
		this.setMigrates(migrates); 
		this.setName(name);
		this.setNrOfLegs(nrOfLegs); 
	}
	public Flamingo() {
		this(false, 150, "Flamy", 2);
	}

}
