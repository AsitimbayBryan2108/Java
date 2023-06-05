package Arreglo;

public class Arreglos1 
{
	public static void main(String[] args) 
	{
		int contadorPositivo=0;
		int contadorNegativo=0;
		int contadorCero=0;
		
		//int[] numeros = new int [5];
		//numeros[0]= 1;
		//numeros[1]= 10;
		//numeros[2]= 5;
		//numeros[3]= 0;
		//numeros[4]= 0;
		
		//for (int i =0;i<numeros.length;i++) 
		//{
		//	if (numeros[i]>0)
		//		contadorPositivo++;
		//	else if (numeros[i]<0)
		//		contadorNegativo++;
		//	else
		//		contadorCero++;
		//}
		//System.out.println("Positivos:"+contadorPositivo);
		//System.out.println("Negativos:"+contadorNegativo);
		//System.out.println("Ceros:"+contadorCero);
		
		int[] numeros1=new int[300];
		for(int i=0;i<numeros1.length;i++){
			int n = (int)(Math.random()*100);
			numeros1[i]=n;
		}
		
		for (int i =0;i<numeros1.length;i++) 
		{
			if (numeros1[i]>0)
				contadorPositivo++;
			else if (numeros1[i]<0)
				contadorNegativo++;
			else
				contadorCero++;
		}
		System.out.println("Positivos:"+contadorPositivo);
		System.out.println("Negativos:"+contadorNegativo);
		System.out.println("Ceros:"+contadorCero);
	}
}
