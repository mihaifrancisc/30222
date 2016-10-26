package underworld.models;

public class Map {
	private int[] resources = { 1, 5, 9, 25, 40 }; // The declaration allocates
													// only enough space for

	// a reference to an array (typically 4 bytes),
	// but doesn't create the actual array object.
	// numele array-ului e pointer la un obiect al sau

	public Map() { // constructor
		// Inside here you should make sure you have some default values inside
		// your resources array.
		int[] resources = new int[100];
	}

	public void generateResources() {

	}

	public boolean consumeResource(int resource) {
		return false;
	}

	public void showResources() {

	}

}
