package Matriz;

public class EjercicioDiagonal 
{
	public static void main(String[] args) 
	{
	int [][] matrix= new int [][] {
        {15,46,18,19,21},
        {10,63,81,41,12},
        {28,90,23,11,13},
        {15,61,41,11,11},
        {25,37,18,19,10},
    };
    for(int i=0;i<matrix.length;i++) 
    {
        for(int j=0;j<matrix[i].length;j++) 
        {
            System.out.print(matrix[i][j] + "\t");
        }
        System.out.println();
    }
    {
    int [] matrizDiagonal1 = new int [5];
    for (int a = 0; a < 5; a++)
        matrizDiagonal1 [a] = matrix [a][a];
    System.out.println("La diagonal principal es: "+ matrizDiagonal1[0]+"\t" + matrizDiagonal1[1]+"\t" + matrizDiagonal1[2]+"\t" + matrizDiagonal1 [3]+"\t" + matrizDiagonal1[4]);
    }
    int matrizDiagonal= 0;
    matrizDiagonal= matrix[0][0]+ matrix[1][1]+matrix[2][2]+matrix[3][3]+matrix[4][4];
    System.out.println("La suma de la diagonal principal es: "+matrizDiagonal);
	}
}
