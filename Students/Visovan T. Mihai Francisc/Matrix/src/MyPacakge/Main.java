package MyPacakge;
//import java.util.Scanner;
import MyPacakge.Matrix;

public class Main {
	
	public static void main(String[] args){
	
	
	int [][] m1 = {{1,0}, {2,3}};
	int [][] m2 = {{1,0}, {2,3}};
	int [][] m3 = new int[2][2];
		
	Matrix matr1 = new Matrix(m1);
	Matrix matr2 = new Matrix(m2);
	Matrix matr3 = new Matrix(m3);
	
	//Scanner scan = new Scanner(System.in);
	
	/*int i, j, value;
	for(i = 0; i < mymatrix.getNoOfRows() ; i++){
		for(j = 0; j < mymatrix.getNoOfCols(); j++){
			value = scan.nextInt();
			m1.put(i, j, value);
			m2.put(i, j, value);
	}
	}*/
	
	matr3 = matr2.add(matr1);
	System.out.println(matr3.toString());
	
}
}
