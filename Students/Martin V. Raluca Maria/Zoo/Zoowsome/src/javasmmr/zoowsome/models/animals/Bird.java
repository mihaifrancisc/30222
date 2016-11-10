package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {
	private Boolean migrates;
	private int avgFlightAltitude;
	
	public Boolean getMigrates() {
		return this.migrates;
	}
	
	public void setMigrates( Boolean migrates ) {
		this.migrates = migrates;
	}
	
	public int getAvgFlightAltitude() {
		return this.avgFlightAltitude;
	}
	
	public void setAvgFlightAltitude( int avgFlightAltitude ) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

}
