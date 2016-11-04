package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	private Boolean laysEggs;
	
	public Boolean getLaysEggs() {
		return this.laysEggs;
	}
	
	public void setLaysEggs(Boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
}
