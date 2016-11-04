package models.animals;

public class Waxwing extends Bird {
	

	public Waxwing() {
		name = "Waxwing";
		nrOfLegs = 2;
		migrates = true;
		avgFlightAltitude = 121;
	}
	
	public Waxwing(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude) {
		setName(name);
		setNrOfLegs(nrOfLegs);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		}
}
