package Matriz;

public class Main2 
{
	public static void main(String[] args) 
	{
		int[][] matrix = new int[3][3];
		matrix[0][0] = 10;
		matrix[0][1] = 10;
		matrix[0][2] = 20;
		
		matrix[1][0] = 30;
		matrix[1][1] = 20;
		matrix[1][2] = 40;
		
		matrix[2][0] = 3;
		matrix[2][1] = 2;
		matrix[2][2] = 4;
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		int fila = 2;
		int sumaFila = 0;
		sumaFila =matrix[fila][0] + matrix[fila][1] + matrix[fila][2];
		
		int columna=1;
		int sumacolumna=0;
		sumacolumna =matrix[0][columna] + matrix[1][columna] + matrix[2][columna];
		
		System.out.println(sumacolumna);
		System.out.println(sumaFila);
	}

}
