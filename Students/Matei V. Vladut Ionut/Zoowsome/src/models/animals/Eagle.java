package models.animals;

public class Eagle extends Bird {
	
	public Eagle() {
		name = "Eagle";
		nrOfLegs = 2;
		migrates = false;
		avgFlightAltitude = 589;
	}

	public Eagle(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude) {
		setName(name);
		setNrOfLegs(nrOfLegs);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		}
}
