package services.factories;

public final class Constants {

	public static final int noOfSpecies = 5;
	public static final int noOfAnimalsOfEachType = 3;
	public static final int noOfAnimals = 50;
	
	public static final class Species {
		public static final String MAMMALS = "Mammals";
		public static final String REPTILES = "Reptiles";
		public static final String BIRDS = "Birds";
		public static final String AQUATICS = "Aquatics";
		public static final String INSECTS = "Insects";
	}
	
	public static final class Animals{
		
		public static class Mammals {
			public static final String LION = "LION";
			public static final String COW = "COW";
			public static final String HORSE= "HORSE";
		}
		
		public static class Reptiles {
			public static final String SNAKE = "SNAKE";
			public static final String CROCODILE = "CROCODILE";
			public static final String LIZZARD = "LIZZARD";
		}
		
		public static class Birds {
			public static final String EAGLE = "EAGLE";
			public static final String WOODPECKR = "WOODPECKER";
			public static final String CROW = "CROW";
		}
		
		public static class Aquatics {
			public static final String FROG = "FROG";
			public static final String TUNA = "TUNA";
			public static final String SOMON = "SOMON";
		}
		
		public static class Insects {
			public static final String ANT = "ANT";
			public static final String FLY = "FLY";
			public static final String MOSQUITO = "MOSQUITO";
		}
	}
}
