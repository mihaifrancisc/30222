package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal{
	//attributes
	private Boolean migrates;
	private int avgFlightAltitude;
	
	//methods
	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}
	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
	public Boolean getMigrates() {
		return migrates;
	}
	public void setMigrates(Boolean migrates) {
		this.migrates = migrates;
	}
}
