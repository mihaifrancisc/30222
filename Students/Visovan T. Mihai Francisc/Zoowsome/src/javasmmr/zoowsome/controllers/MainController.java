package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.repositories.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.services.factories.Constants;



public class MainController{
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, XMLStreamException{
		
		
		Random random = new Random();
        ArrayList <Animal> arrayAnimals = new ArrayList <Animal>();
        ArrayList <Caretaker> arrayCaretakers = new ArrayList <Caretaker>();

        AnimalRepository animalRepository = new AnimalRepository();
        EmployeeRepository employeeRepository = new EmployeeRepository();
		
		
		String[] animals = {Constants.Animals.Aquatics.DOLPHIN, Constants.Animals.Aquatics.SHARK, Constants.Animals.Aquatics.WHALE,
							Constants.Animals.Mammals.COW, Constants.Animals.Mammals.MONKEY, Constants.Animals.Mammals.TIGER,
							Constants.Animals.Birds.CROW, Constants.Animals.Birds.EAGLE, Constants.Animals.Birds.PARROT,
							Constants.Animals.Insects.ANT, Constants.Animals.Insects.BUTTERFLY, Constants.Animals.Insects.SPIDER,
							Constants.Animals.Reptiles.CROCODILE, Constants.Animals.Reptiles.SNAKE, Constants.Animals.Reptiles.TORTOISE 
							};
		
		int numberOfAnimals = 30;		//creating 30 animals and 10 caretakers for our zoo
		int numberOfCaretakers = 10;
		
		Caretaker[] c = new Caretaker[31];
		EmployeeAbstractFactory emp = new EmployeeAbstractFactory();
        EmployeeFactory caretakerFactory = emp.getEmployeeFactory(Constants.Employee.CARETAKER);
        
        
		Animal[] a = new Animal[51];
		AnimalFactory an = new AnimalFactory(); 
		
		
		
        for(int i = 0; i < numberOfCaretakers; i++){
        	
        	int intType = random.nextInt(Constants.TYPES.length);
    		String typeEmployee = Constants.TYPES[intType];
            c[i] = (Caretaker) caretakerFactory.getEmployee(typeEmployee);
        }
        //let's see out kind of species is our animal    
        for(int j = 0; j < numberOfAnimals; j++){
        	
        	int intAnimals = random.nextInt(animals.length);
    		String typeAnimals = animals[intAnimals];
    		
    		String typeSpecies = " ";
    		
    		if(intAnimals <= 2 && intAnimals >=0){
    			typeSpecies = Constants.Species.AQUATICS;}
    		else if(intAnimals <= 5 && intAnimals >2){
    			typeSpecies = Constants.Species.MAMMALS;}
    		else if(intAnimals <= 8 && intAnimals >5){
    			typeSpecies = Constants.Species.BIRDS;}
    		else if(intAnimals <= 11 && intAnimals >8){
    			typeSpecies = Constants.Species.INSECTS;}
    		else if(intAnimals <=14 && intAnimals >11){
    			typeSpecies = Constants.Species.REPTILES;}
        	else{
        		typeSpecies = " ";
        	}
    		SpeciesFactory sp = an.getSpeciesFactory(typeSpecies); 
    		a[j] = sp.getAnimal(typeAnimals);
    		
    		}
        boolean dead, care;

        String result = " ";
        
        //let's take care of as many as possible animals 
        
        for(int i = 0; i < numberOfCaretakers; i++){
        	int nr = 0;
        	for(int j = 0; j < numberOfAnimals; j++){
        		dead = c[i].getisDead();
        		care = a[j].isTakenCareOf();
        		if(!dead && !care){
        			result = ((Caretaker)c[i]).takeCareOf(a[j]);
        			if(c[i].getWorkingHours() < 1.0){
        				break;
        			}
        			if(result.equals(Constants.Employee.Caretaker.TCO_KILLED)){
        				c[i].setDead(true);
        			}
        			else if(result.equals(Constants.Employee.Caretaker.TCO_NO_TIME)){
        				continue;
        			}
        			else{
        				a[j].setTakenCareOf(true);
        				c[i].setNumberOfTakenCareOf(++nr);
        			}
        			
        		}
        	}
        }
        //print some informations about out employees and animals
      /* for(int i = 0; i < numberOfCaretakers; i++){
        	if(c[i].getisDead() == true){
        		System.out.println("Our caretaker " + c[i].getName() + " has " + c[i].getWorkingHours() + " working hours left" 
        		+ " and with a salary of " + c[i].getSalary()+ " dollars has fallen on duty" + " and he took care of " +
        		c[i].getNumberOfTakenCareOf() +  " animals");
        				
        	}
        	else{
        		System.out.println("Our caretaker " + c[i].getName() + " has " + c[i].getWorkingHours() + " working hours left" + 
        		" and with a salary of dollars " + c[i].getSalary()+ " dollars has succeseded the job"
        		+ " and he took care of " + c[i].getNumberOfTakenCareOf() + " animals");
        	}
        }
        	for(int j = 0; j < numberOfAnimals; j++){
        		if((a[j].takenCareOf) == true){
        			System.out.println("Our " + a[j].getName() + " has been taken care of and it's very happy ");
        		}
        		else{
        			System.out.println("Our " + a[j].getName() + " has been not taken care of and it's quite sad");
        			
        		}
        	}*/
        
        	
       //AnimalRepository
      
        for(int i = 0; i < numberOfAnimals; i++){
        	arrayAnimals.add(a[i]);
       }
        	
      		animalRepository.save(arrayAnimals);
      		//animalRepository.load();
      		
	    //EmployeeRepository
      	
      	for(int j = 0; j < numberOfCaretakers; j++){
      		arrayCaretakers.add(c[j]);
      	}
      		
      		employeeRepository.save(arrayCaretakers);
      		//employeeRepository.load(); 
      		     		
	      
	}

	
	
}

