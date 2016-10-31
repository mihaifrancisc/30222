package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal{
	
	boolean layEggs;

	public boolean isLayEggs() {
		return layEggs;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}
}
