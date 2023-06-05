package Matriz;

public class Ejerciciomatriz 

//Hacer un programa que llene una matriz de 5 * 5. Sumar las columnas e imprimir la máxima suma de esa columna.


{
	public static void main(String[] args) 
	{
		int[][] matrix = new int[5][5];
		matrix[0][0] = 10;
		matrix[0][1] = 10;
		matrix[0][2] = 20;
		
		matrix[1][0] = 30;
		matrix[1][1] = 20;
		matrix[1][2] = 40;
		matrix[1][3] = 50;
		matrix[1][4] = 10;
		
		matrix[2][0] = 3;
		matrix[2][1] = 2;
		matrix[2][2] = 14;
		matrix[2][3] = 41;
		matrix[2][4] = 24;
		
		matrix[3][0] = 63;
		matrix[3][1] = 42;
		matrix[3][2] = 14;
		matrix[3][3] = 13;
		matrix[3][4] = 112;
		
		matrix[4][0] = 31;
		matrix[4][1] = 23;   
		matrix[4][2] = 41;
		matrix[4][3] = 44;
		matrix[4][4] = 11;
		
		int columna = 0;
		int columnaMax = 0;
		int sumaColumna = 0;
		int sumaColumnaMax = 0;
		for(int i=0;i<matrix.length;i++, columna++) 
		{		
				sumaColumna =matrix[0][columna] + matrix[1][columna] + matrix[2][columna];
				if (sumaColumna > sumaColumnaMax)
					sumaColumnaMax = sumaColumna;
					columnaMax = columna;
		}
		System.out.println("La suma maxima de las columnas es: " + sumaColumnaMax + " en la columna " + columnaMax);

	}
}
