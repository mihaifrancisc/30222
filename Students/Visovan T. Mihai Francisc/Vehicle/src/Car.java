
public class Car {
	
	
	public String brand;
	private String color;
	private float speed;
	public static int value;
	public final int CONST = 2;
	
	public Car(String brand, String color){
		this.brand = brand;
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	public float Acceleration(float speed){
		speed /= 2;
		return speed;
	}

	
}
