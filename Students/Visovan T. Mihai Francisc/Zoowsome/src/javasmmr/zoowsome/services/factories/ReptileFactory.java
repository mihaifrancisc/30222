package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {  
	 
	 public Animal getAnimal(String type) {   
		 if (Constants.Animals.Reptiles.Snake.equals(type)) {   
			 return new Snake(); } 
		 else if (Constants.Animals.Reptiles.Tortoise.equals(type)) {   
				 return new Tortoise();   } 
		 else if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			 return new Crocodile(); }
	 	 else{
	 		 return null;}
			// throw new Exception("Invalid animal exception!");   }  
		 }
}
	

	 
	 