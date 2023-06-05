package Array1;

//Llenar dos vectores A y B de 45 elementos cada uno, 
//sumar el elemento uno del vector A con el elemento 
//uno del vector B y así sucesivamente hasta 45, almacenar
//el resultado en un vector C, e imprimir el vector resultante.
public class Vector1 
{
	public static void main(String[] args)
	{
		int[]vector=new int[45];
		vector	[0]	=	1	;
		vector	[1]	=	2	;
		vector	[2]	=	3	;
		vector	[3]	=	4	;
		vector	[4]	=	5	;
		vector	[5]	=	6	;
		vector	[6]	=	7	;
		vector	[7]	=	8	;
		vector	[8]	=	9	;
		vector	[9]	=	10	;
		vector	[10]=	11	;
		vector	[11]=	12	;
		vector	[12]=	13	;
		vector	[13]=	14	;
		vector	[14]=	15	;
		vector	[15]=	16	;
		vector	[16]=	17	;
		vector	[17]=	18	;
		vector	[18]=	19	;
		vector	[19]=	20	;
		vector	[20]=	21	;
		vector	[21]=	22	;
		vector	[22]=	23	;
		vector	[23]=	24	;
		vector	[24]=	25	;
		vector	[25]=	26	;
		vector	[26]=	27	;
		vector	[27]=	28	;
		vector	[28]=	29	;
		vector	[29]=	30	;
		vector	[30]=	31	;
		vector	[31]=	32	;
		vector	[32]=	33	;
		vector	[33]=	34	;
		vector	[34]=	35	;
		vector	[35]=	36	;
		vector	[36]=	37	;
		vector	[37]=	38	;
		vector	[38]=	39	;
		vector	[39]=	40	;
		vector	[40]=	41	;
		vector	[41]=	42	;
		vector	[42]=	43	;
		vector	[43]=	44	;
		vector	[44]=	45	;
		
		int[]vector2=new int[45];
		vector2	[0]	=	1	;
		vector2	[1]	=	2	;
		vector2	[2]	=	3	;
		vector2	[3]	=	4	;
		vector2	[4]	=	5	;
		vector2	[5]	=	6	;
		vector2	[6]	=	7	;
		vector2	[7]	=	8	;
		vector2	[8]	=	9	;
		vector2	[9]	=	10	;
		vector2	[10]=	11	;
		vector2	[11]=	12	;
		vector2	[12]=	13	;
		vector2	[13]=	14	;
		vector2	[14]=	15	;
		vector2	[15]=	16	;
		vector2	[16]=	17	;
		vector2	[17]=	18	;
		vector2	[18]=	19	;
		vector2	[19]=	20	;
		vector2	[20]=	21	;
		vector2	[21]=	22	;
		vector2	[22]=	23	;
		vector2	[23]=	24	;
		vector2	[24]=	25	;
		vector2	[25]=	26	;
		vector2	[26]=	27	;
		vector2	[27]=	28	;
		vector2	[28]=	29	;
		vector2	[29]=	30	;
		vector2	[30]=	31	;
		vector2	[31]=	32	;
		vector2	[32]=	33	;
		vector2	[33]=	34	;
		vector2	[34]=	35	;
		vector2	[35]=	36	;
		vector2	[36]=	37	;
		vector2	[37]=	38	;
		vector2	[38]=	39	;
		vector2	[39]=	40	;
		vector2	[40]=	41	;
		vector2	[41]=	42	;
		vector2	[42]=	43	;
		vector2	[43]=	44	;
		vector2	[44]=	45	;
		
		int[]vector3=new int[45];
		for (int v1=0;v1<45;v1++) 
		{
		vector3[v1]=vector[v1]+vector2[v1];
		}
		System.out.println("Suma de los vectores 1 y 2");
		for (int v1=0;v1<45;v1++)
		{
			System.out.println("["+vector3[v1]+"]");
		}
	}

}











//for (int v1=0;v1<45;v1++) 
//{ 	 
//	vector1[v1]=(int)(Math.random()*100);
//	vector2[v1]=(int)(Math.random()*100);
//}
