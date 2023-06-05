package Matriz;

public class Main1 
{
	public static void main(String[] args) 
	{
		int[][]matrix = new int[2][2];
		matrix[0][0]=1;
		matrix[1][1]=10;
		
		//System.out.println(matrix.length);
		
		for(int i=0;i<matrix.length;i++) 
		{
			for(int j=0;j<matrix[i].length;j++) 
			{
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		int[] vec1=matrix[1];
		for(int i=0;i<vec1.length;i++) 
		{
			System.out.println(vec1[i]);
		}
		
		int buscar=2;
		boolean control =false;
		for(int i=0;i<matrix.length;i++) 
		{
			for(int j=0;j<matrix[i].length;j++) 
			{
				if(matrix[i][j]==buscar) 
				{
					control=true;
					break;	
				}
			}
		}
		if(control) 
		{
			System.out.println("Valor encontrado");			
		}
		else 
		{
			System.out.println("Valor no encontrado");		
		}		
	}

}
