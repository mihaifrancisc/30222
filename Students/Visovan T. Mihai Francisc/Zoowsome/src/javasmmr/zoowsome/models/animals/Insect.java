package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {

	boolean canItFly;
	boolean isDangerous;
	
	public boolean isCanItFly() {
		return canItFly;
	}
	public void setCanItFly(boolean canItFly) {
		this.canItFly = canItFly;
	}
	
	public boolean isDangerous() {
		return isDangerous;
	}
	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
}
