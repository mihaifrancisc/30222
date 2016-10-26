package underworld.utils;

import java.util.Random;

public class Resources {
	private static Random random = new Random();

	/**
	 * Generate a random number between 0 and Constants.MAP_RESOURCES_NUMBER;
	 * limits included.
	 * 
	 * @return
	 */
	public static int generateValuableResource() { // o metoda statica se
													// apeleaza folosind numele
													// clasei

		int i;
		int[] randomValue;
		randomValue = new int[100];
		for (i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++) {
			randomValue[i] = (int) (Math.random() * 100);// return a value
															// between 0-99
		}

		return randomValue[i];
	}

	/**
	 * Generate a random number between 0 and Constants.MAP_RESOURCES_NUMBER * 2;
	 * limits included.
	 * 
	 * @return
	 */
	public static int generateResource() {
		int i;
		int[] randomValue;
		randomValue = new int[100];
		for (i = 0; i < (Constants.MAP_RESOURCES_NUMBER * 2); i++) {
			randomValue[i] = (int) (Math.random() * 200);// return a value
															// between 0-99
		}

		return randomValue[i];
	}

}
