package mypackage;
import java.util.Scanner;
import mypackage.Matrice;

public class Main {

	Scanner scan = new Scanner(System.in);
	public Main(){
		
	}

	public static void main(String[] args){
		
		int m = 3;
		int n = 2;
		
		int a[][] = new int[m][n];
		Matrice obj = new Matrice();
		
		obj.Citire(m, n, a);
		obj.Afisare(m, n, a);
	}
}
