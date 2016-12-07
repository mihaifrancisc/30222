package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.services.factories.EmployeeFactory;
import javasmmr.zoowsome.models.employees.*;
import java.math.BigDecimal;
import java.util.Random;


public class CaretakerFactory extends EmployeeFactory {  
	 //@Override  

	Random random = new Random();
	
	 public Employee getEmployee(String type){
		 			int name = random.nextInt(Constants.EMPLOYEES.length);
		 			int salaries = random.nextInt(Constants.SALARIES.length);
		 			BigDecimal salary = Constants.SALARIES[salaries];
		 			int workinghours = random.nextInt(Constants.WORKINGHOURS.length);
		 			return new Caretaker(Constants.EMPLOYEES[name], salary, false, Constants.WORKINGHOURS[workinghours]);
		 	
		 	
	 }
}