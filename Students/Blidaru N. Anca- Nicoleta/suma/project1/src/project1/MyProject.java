package project1;

import java.util.*;

public class MyProject {
	public static void main (String[] args) {
		
		SumaMultipli();
	}


	public static void SumaMultipli() {
		
		Integer nr;
		Scanner in = new Scanner(System.in);
		System.out.println("Cititi numarul nr: ");
		nr = in.nextInt();
		
		int s = 0, i;
		for(i = 1; i<= nr; i++)
			 if(i%3 == 0 || i%5 == 0)
				  s += i;
	   
		System.out.println("Suma multiplilor de 3 si 5 este " + s);
	}
}

