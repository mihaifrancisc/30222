package MyPacakge;
import java.lang.Object;
public class Matrix {

	
	
	private int[][] matrix;
	private int row;
	private int col;
	
	public Matrix(int[][] matrix){
		this.matrix = matrix;
		this.row = matrix.length;
		this.col = matrix[0].length;
	}
	
	public int valueAt(int row, int col){
		if(outOfBounds(row,col) == false)
		return matrix[row][col];
		else 
			return 0;
	}
	
	public boolean outOfBounds(int row, int col){
		if(row < 0 || row > this.row){
			return true;}
		else{
			return false;}
	}
	
	public boolean put(int row, int col, int value){
		if(outOfBounds(row, col) == true){
			return false;}
		else{
			this.matrix[row][col] = value;
			return true;}
	}
		
	public int getNoOfRows(){
		return this.row;
	}
	
	public int getNoOfCols(){
		return this.col;
	}
		
	public Matrix add(Matrix matrix){
		int [][] m = new int[getNoOfRows()][getNoOfCols()];
		if(outOfBounds(matrix.getNoOfRows(), matrix.getNoOfCols()) == false)
			for(int i = 0; i < getNoOfRows(); i++){
				for(int j = 0; j < getNoOfCols(); j++){
					m[i][j] = this.valueAt(i,j) + matrix.valueAt(i,j);
				}
				}
			return new Matrix(m);	
	}
	
	public String toString(){
		int i, j;
		String string = new String();
		for(i = 0; i < this.row; i++){
			string += "\n";
			for(j = 0; j < this.col; j++){
				string += this.valueAt( i, j) + " ";
			}
		}
		return string;
	}
	
	
	
	
}
