package javasmmr.zoowsome.models.animals;

public class Turacos extends Bird {
	public Turacos(Boolean migrates, int avgFlightAltitude, String name, int nrOfLegs) {
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setMigrates(migrates); 
		this.setName(name); 
		this.setNrOfLegs(nrOfLegs);
	}
	public Turacos() {
		this(false, 500, "Tury", 2);
	}


}
