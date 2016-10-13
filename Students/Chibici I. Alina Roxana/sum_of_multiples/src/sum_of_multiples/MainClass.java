package sum_of_multiples;
//apelam clasa pentru a putea lua numarul de la tastatura
import java.util.Scanner;

//suma multiplilor lui 3 si 5 pana la 1000
public class MainClass {

	public static void main(String[] args) {
		//cream 2 numere pe care sa aplicam metoda de calculare a sumei multiplilor
		MultipleOfX firstNumber = new MultipleOfX(3);
		MultipleOfX secondNumber = new MultipleOfX(5);
		//cream obiectul tastatura pe care sa apelam metoda de citire a urmatoarului simbol 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Multiplii pana la: ");
		long n = keyboard.nextLong();
		long sum = firstNumber.sumOfMultiples(n) + secondNumber.sumOfMultiples(n);
		System.out.println(sum);
		
	}

}
//ultimul numar de tipul int pentru n ce da un rezultat corect e 89739 - rezultat: 2 147 418 374
// the maximum of int is 2 147 483 647 
//  the maximum of long is 9,223,372,036,854,775,807
// it takes way too much time to find out the last value that gives the right answer