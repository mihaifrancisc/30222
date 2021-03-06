package javasmmr.zoowsome.models.employees;
import javasmmr.zoowsome.services.factories.*;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;

public  class Caretaker extends Employee implements Caretaker_I{

	public Caretaker(String name, long id, BigDecimal salary, boolean isDead) {
		super(name, id, salary, isDead);
		// TODO Auto-generated constructor stub
	}

	public String TakeCareOf(Animal animal){
		
		if (animal.kill()){
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours< animal.getMaintenanceCost()){
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		animal.setTakenCareOf(true);
		this.setWorkingHours(workingHours-animal.getMaintenanceCost());
		
		return Constants.Employees.Caretakers.TCO_SUCCES;
	}
	
	public Caretaker(){
		super("John Doe",1,BigDecimal.ZERO,false);
		
	}
	private double workingHours;

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	
	
}
