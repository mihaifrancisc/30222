package models.animals;

public class Lizzard extends Reptile{
	
	private int color ;
	
	public Lizzard(){
		nrOfLegs = 4;
		name = "Lizzard";
		laysEggs =true;
		color = 250; 
	}
	
	public Lizzard(int color, boolean laysEggs){
		this();
		this.color = color;
		this.laysEggs = laysEggs;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
}
