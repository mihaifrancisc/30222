package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal{
	//attributes
	private Boolean laysEggs;

	//methods
	public Boolean getLaysEggs() {
		return laysEggs;
	}
	public void setLaysEggs(Boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
}
