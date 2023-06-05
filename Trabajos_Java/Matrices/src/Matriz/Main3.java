package Matriz;

public class Main3 
{
	public static void main(String[] args)
	{
		int [][] matrix= new int [][] 
		{
	        {1,2,3,4,5},
	        {1,1,1,2,2},
	        {3,2,4,1,1},
	        {4,1,1,4,1},
	        {1,2,4,5,1},
	    };
	    
	    int filas=5;
	    int []sumas =new int[filas];
	    
	    for(int col=0;col<filas;col++) 
	    {
	    	sumas[col]=matrix[0][col]+matrix[1][col]+matrix[2][col]+matrix[3][col]+matrix[4][col];	
	    }
	    int mayor = Math.max(sumas[0],Math.max(sumas[1],Math.max(sumas[2],Math.max(sumas[3],sumas[4]))));
	    System.out.println("Suma:"+mayor);
	  
//      int col=0;
// 	    int sumaCol0=matrix[0][col]+matrix[1][col]+matrix[2][col]+matrix[3][col]+matrix[4][col];
// 	    col=1;
// 	    int sumaCol1=matrix[0][col]+matrix[1][col]+matrix[2][col]+matrix[3][col]+matrix[4][col];
// 	    col=2;
// 	    int sumaCol2=matrix[0][col]+matrix[1][col]+matrix[2][col]+matrix[3][col]+matrix[4][col];
// 	    col=3;
// 	    int sumaCol3=matrix[0][col]+matrix[1][col]+matrix[2][col]+matrix[3][col]+matrix[4][col];
// 	    col=4;
// 	    int sumaCol4=matrix[0][col]+matrix[1][col]+matrix[2][col]+matrix[3][col]+matrix[4][col];
	    
// 	    System.out.println(sumaCol0);
// 	    System.out.println(sumaCol1);
// 	    System.out.println(sumaCol2);
// 	    System.out.println(sumaCol3);
// 	    System.out.println(sumaCol4);
		
// 	    int mayor1 = Math.max(sumaCol0,Math.max(sumaCol1,Math.max(sumaCol2,Math.max(sumaCol3,sumaCol4))));
// 	    System.out.println("Suma:"+mayor);

	    
	    for(int i=0;i<matrix.length;i++)
	    {
	    	for(int j=0;j<matrix[i].length;j++) 
	    	{
	    		
	    		System.out.print(matrix[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
	}
}
