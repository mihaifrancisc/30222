package controllers;

import models.animals.Animal;
import java.util.*;
import services.factories.AnimalFactory;
import services.factories.Constants;
import services.factories.SpeciesFactory;

public class MainController {

	public static void main(String[] args){
		
		Random random1 = new Random();
		Random random2 = new Random();
		Animal[] a2 = new Animal[Constants.noOfAnimals];
		
		AnimalFactory abstractFactory = new AnimalFactory();
		
		for( int i = 0; i < Constants.noOfAnimals; i++){
			int speciesType = random1.nextInt(Constants.noOfSpecies ) + 1;
			int animalType  = random2.nextInt(Constants.noOfAnimalsOfEachType ) + 1;
			
			switch (speciesType){
				case 1: 
					SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS); 
					switch(animalType){
						case 1: a2[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.COW);
						break;
						
						case 2: a2[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.HORSE);
						break;
						
						case 3: a2[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.LION);
						break;
						
						default: System.out.println("error");
					}
					break;
				case 2:
					SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);
					switch(animalType){
						case 1: a2[i] = speciesFactory2.getAnimal(Constants.Animals.Reptiles.CROCODILE);
						break;
					
						case 2: a2[i] = speciesFactory2.getAnimal(Constants.Animals.Reptiles.LIZZARD);
						break;
					
						case 3: a2[i] = speciesFactory2.getAnimal(Constants.Animals.Reptiles.SNAKE);
						break;
					
						default: System.out.println("error");
				}
					break;
				case 3: 
					SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
					switch(animalType){
						case 1: a2[i] = speciesFactory3.getAnimal(Constants.Animals.Insects.ANT);
						break;
					
						case 2: a2[i] = speciesFactory3.getAnimal(Constants.Animals.Insects.FLY);
						break;
					
						case 3: a2[i] = speciesFactory3.getAnimal(Constants.Animals.Insects.MOSQUITO);
						break;
					
						default: System.out.println("error");
				}
					break;
				case 4: 
					SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);
					switch(animalType){
						case 1: a2[i] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.FROG);
						break;
					
						case 2: a2[i] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.SOMON);
						break;
					
						case 3: a2[i] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.TUNA);
						break;
					
						default: System.out.println("eror");
				}
					break;
				case 5: 
					SpeciesFactory speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
					switch(animalType){
						case 1: a2[i] = speciesFactory5.getAnimal(Constants.Animals.Birds.CROW);
						break;
				
						case 2: a2[i] = speciesFactory5.getAnimal(Constants.Animals.Birds.EAGLE);
						break;
				
						case 3: a2[i] = speciesFactory5.getAnimal(Constants.Animals.Birds.WOODPECKR);
						break;
				
					default: System.out.println("error");
			}
					break;
				default: System.out.println("error");
			}			
		
	}
		
		for(int i = 0; i < Constants.noOfAnimals; i++){
			System.out.println("Animal " + a2[i].getName() + " has " +a2[i].getNrOfLegs()+ " legs ");
			
		}
}
}