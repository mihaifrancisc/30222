
public abstract class Reptile { //nu se poate face new Reptile();
	
	public int numberOfLegs;
	
												
	public Reptile(){
		System.out.println("The number of legs is:");
		numberOfLegs = 4;
		System.out.println(numberOfLegs);
	}
	
	public abstract void move();		//nu putem sa punem body la metoda abstracta
										//nu putem avea metode abstracte daca clasa nu e abs.
		//System.out.println("The reptile is moving!");
	
}
