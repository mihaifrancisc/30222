package underworld.models;

public class Miner {
	private String name;
	private int[] backpack;
	private int backpackIndex;

	public Miner(String name) { // constructor

	}

	public String getName() { // preia un string
		return name;
	}

	public void setName(String name) {// il seteaza

	}

	public int dig() {
		return backpackIndex;// sau 0
	}

	public int sleep() {
		return 0;
	}

	private boolean isBackpackFull() {
		return false;
	}

	public void showBackpack() {

	}

	private int getNumberOfBackpackSlots() {// lipseste tipul care nu e specificat
		return 0;
	}
}
