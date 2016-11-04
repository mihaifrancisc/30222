package models.animals;

public class Chicken extends Bird{

	public Chicken() {
		name = "KFC survivor";
		nrOfLegs = 2;
		migrates = false;
		avgFlightAltitude = 1;
		}

	public Chicken(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude) {
		setName(name);
		setNrOfLegs(nrOfLegs);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		}
}
