package fibonacci;

public class Even{
	//metoda statica ca sa vada daca un numar e par
	//sa o aplicam direct pe clasa sa nu avem nevoie de obiect
	 public static Boolean isEven (int n) {
		 if(n % 2 == 0){
		 	return true;
		 }
		 else{
		 	return false;
		 }
	}
}
