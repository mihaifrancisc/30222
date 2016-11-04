package javasmmr.zoowsome.models.animals;

public class Gull extends Bird {
	public Gull(Boolean migrates, int avgFlightAltitude, String name, int nrOfLegs) {
		this.setAvgFlightAltitude(avgFlightAltitude); 
		this.setMigrates(migrates); 
		this.setName(name); 
		this.setNrOfLegs(nrOfLegs);
	}
	public Gull() {
		this(false, 3000, "Gully", 2);
	}


}
