package Array1;

public class Vector2 
{
	//Llenar un vector de 20 elementos, imprimir la posición 
	//y el valor del elemento mayor almacenado en el vector. 
	//Suponga que todos los elementos del vector son diferentes.

	public static void main(String[] args)
	{
		int[]vector1=new int[20];
		vector1	[0]	=	100	;
		vector1	[1]	=	231	;
		vector1	[2]	=	312	;
		vector1	[3]	=	441	;
		vector1	[4]	=	53	;
		vector1	[5]	=	641	;
		vector1	[6]	=	745	;
		vector1	[7]	=	812	;
		vector1	[8]	=	93	;
		vector1	[9]	=	101	;
		vector1	[10]=	114	;
		vector1	[11]=	12	;
		vector1	[12]=	135	;
		vector1	[13]=	143	;
		vector1	[14]=	15	;
		vector1	[15]=	165	;
		vector1	[16]=	175	;
		vector1	[17]=	181	;
		vector1	[18]=	195	;
		vector1	[19]=	20	;

		int puesto=0;
		int mayor=vector1[0];
		for (int e=0;e<vector1.length;e++) 
		{
			System.out.println("Vector["+e+"]="+vector1[e]);
			if(vector1[e]>mayor) 
			{
				mayor=vector1[e];
				int valor=1;
				if(valor==1) 
				{
					puesto=e;			
				}
			}
		}
		
		System.out.println("El vector mayor es: ["+puesto+"]:"+mayor);
	}
}




















//for (int e=0;e<20;e++) 
//{
//	vector1[e]=(int)(Math.random()*100);
//}
//System.out.println("Posicion y Valor de los elementos");
