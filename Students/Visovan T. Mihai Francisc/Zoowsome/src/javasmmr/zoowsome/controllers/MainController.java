package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.services.factories.*;
import java.util.Random;
import javasmmr.zoowsome.models.animals.*;

public class MainController {

	public static void main(String[] args)  { 
		  AnimalFactory abstractFactory = new AnimalFactory();  
		  SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);  
		  Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);  
		  System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());  
		  
		  int numberOfAnimals = 50, i, numberOfSpecies = 5, numberOfTypes = 15;
	

		 String randomSpecies = "Bird Insect Mammal Reptile Aquatic";
		 String randomTypes = "Ant Butterfly Cow Crocodile Crow Dolphin Eagle Monkey Parrot Shark Snake Spider Tiger Tortoise Whale";
		  
		  String[] wordsAsArray1 = randomSpecies.split(" ");
		  String[] wordsAsArray2 = randomTypes.split(" ");
		  
		  
		  for(i = 0; i < numberOfAnimals; i++){
			  
			  int index1 = new Random().nextInt(wordsAsArray1.length);
			  int index2 = new Random().nextInt(wordsAsArray2.length);

			  String randomWord1 = wordsAsArray1[index1];
			  String randomWord2 = wordsAsArray2[index2];
			  
			  SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.randomWord1);
		      Animal a2 = speciesFactory2.getAnimal(Constants.Animals.randomWord1.randomWord2);
		      System.out.printf("Our animal's name is:", a2.getName());
		      //System.out.println("And it has %d legs!\n", a2.getNrOfLegs()); 
		      
		  }
		  
		  
		  
		 } 
}
