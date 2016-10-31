package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {  
	 //@Override  
	 public Animal getAnimal(String type) {   
		 if (Constants.Animals.Aquatics.Shark.equals(type)) {   
			 return new Shark();  } 
		 else if (Constants.Animals.Aquatics.Dolphin.equals(type)) {   
				 return new Dolphin();   } 
		 else if(Constants.Animals.Aquatics.Whale.equals(type)){
			 return new Whale();	}
		 else {   
			 return null;
			 //throw new Exception("Invalid animal exception!");   } 
		 }
		 }  
	}
	 
	 
