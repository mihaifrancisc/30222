package javasmmr.zoowsome.controllers;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {

	public static void main(String[] args) throws Exception {
		/*
		AnimalFactory abstractFactoryOne = new AnimalFactory();  
		SpeciesFactory speciesFactory1 = abstractFactoryOne.getSpeciesFactory(Constants.Species.Aquatic);   
		Animal a1 = speciesFactory1.getAnimal(Constants.Animal.Aquatic.Tuna);   
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		*/
		
		//twist1
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactoryMammal = abstractFactory.getSpeciesFactory(Constants.Species.Mammal);
		SpeciesFactory speciesFactoryAquatic = abstractFactory.getSpeciesFactory(Constants.Species.Aquatic);
		SpeciesFactory speciesFactoryBird = abstractFactory.getSpeciesFactory(Constants.Species.Bird);
		SpeciesFactory speciesFactoryInsect = abstractFactory.getSpeciesFactory(Constants.Species.Insect);
		SpeciesFactory speciesFactoryReptile = abstractFactory.getSpeciesFactory(Constants.Species.Reptile);
	
		Random random = new Random();
		Animal[] zoowsomeAnimals = new Animal[Constants.NUMBER_OF_ANIMALS];
		int randomAnimalCreator;
	
		for(int i = 0; i< Constants.NUMBER_OF_ANIMALS; i++){
			randomAnimalCreator = random.nextInt(15);
			switch (randomAnimalCreator){
				case 0:
					zoowsomeAnimals[i] = speciesFactoryMammal.getAnimal(Constants.Animal.Mammal.Giraffe);
					break;
				case 1: 
					zoowsomeAnimals[i] = speciesFactoryMammal.getAnimal(Constants.Animal.Mammal.Lion);
					break;
				case 2:
					zoowsomeAnimals[i] = speciesFactoryMammal.getAnimal(Constants.Animal.Mammal.Tiger);
					break;
				case 3:
					zoowsomeAnimals[i] = speciesFactoryAquatic.getAnimal(Constants.Animal.Aquatic.Clownfish);
					break;
				case 4:
					zoowsomeAnimals[i] = speciesFactoryAquatic.getAnimal(Constants.Animal.Aquatic.Piranha);
					break;
				case 5:
					zoowsomeAnimals[i] = speciesFactoryAquatic.getAnimal(Constants.Animal.Aquatic.Tuna);
					break;
				case 6:
					zoowsomeAnimals[i] = speciesFactoryBird.getAnimal(Constants.Animal.Bird.Eagle);
					break;
				case 7:
					zoowsomeAnimals[i] = speciesFactoryBird.getAnimal(Constants.Animal.Bird.Parrot);
					break;
				case 8:
					zoowsomeAnimals[i] = speciesFactoryBird.getAnimal(Constants.Animal.Bird.Swan);
					break;
				case 9:
					zoowsomeAnimals[i] = speciesFactoryInsect.getAnimal(Constants.Animal.Insect.Butterfly);
					break;
				case 10:
					zoowsomeAnimals[i] = speciesFactoryInsect.getAnimal(Constants.Animal.Insect.Mosquito);
					break;
				case 11:
					zoowsomeAnimals[i] = speciesFactoryInsect.getAnimal(Constants.Animal.Insect.Spider);
					break;
				case 12:
					zoowsomeAnimals[i] = speciesFactoryReptile.getAnimal(Constants.Animal.Reptile.Lizard);
					break;
				case 13:
					zoowsomeAnimals[i] = speciesFactoryReptile.getAnimal(Constants.Animal.Reptile.Snake);
					break;
				case 14:
					zoowsomeAnimals[i] = speciesFactoryReptile.getAnimal(Constants.Animal.Reptile.Tortoise);
					break;
			}
		}
	}
}
