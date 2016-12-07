package mypackage;
import java.util.Scanner;

public class Matrice {

	int i, j, x;
	Scanner scan = new Scanner(System.in);
	
	public void Citire(int m, int n, int a[][]){
		
		for( i = 0; i < m; i++){
			for( j = 0; j < n; j++){
				x = scan.nextInt();
				a[i][j] = x;
			}
		}
	}
	
	public void Afisare(int m, int n, int a[][]){
		for( i = 0; i < m; i++){
			for( j = 0; j < n; j++){
				System.out.print(a[i][j] + " ");
		
	}
		}
	}

}