package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {  
	 //@Override  
	 public Animal getAnimal(String type) {   
		 if (Constants.Animals.Birds.Eagle.equals(type)) {   
			 return new Eagle();   } 
		 else if (Constants.Animals.Birds.Crow.equals(type)) {   
				 return new Crow();   } 
		 else if (Constants.Animals.Birds.Parrot.equals(type)){
			 return new Parrot();	}
		 else {
			 return null;
		 }
			 //throw new Exception("Invalid animal exception!");   } 
		 }  
	}
	
