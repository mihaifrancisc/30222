package controllers;

import services.factories.*;
import models.animals.*;

public class MainController {

	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.TIGER);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		
		
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
		Animal a2 = speciesFactory2.getAnimal(Constants.Animals.Birds.EAGLE);
		System.out.printf("We have an animal with %d legs!\n", a2.getNrOfLegs());

		}
}
