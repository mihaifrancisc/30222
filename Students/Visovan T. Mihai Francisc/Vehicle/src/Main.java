
public class Main {

	public static void main(String[] args){
		
		Car car = new Car("Lamborghini", "Albastru");
		
		float acc;
		car.setSpeed(35.2f);
		acc = car.Acceleration(car.getSpeed());
			System.out.println(car.brand +"  " +  car.getColor() + "  " + car.getSpeed() + "  " + acc);
		}
	}
	
	

