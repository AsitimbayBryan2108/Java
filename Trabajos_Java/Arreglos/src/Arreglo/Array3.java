package Arreglo;

public class Array3 
{
	//Almacenar 150 números en un vector, almacenarlos en otro vector 
	//en orden inverso al vector original e imprimir el vector resultante.
	public static void main(String[] args) 
	{
		int[] numeros=new int[150];
		System.out.println("Vector en Orden");
		for(int i=0;i<150;i++)
		{
			numeros[i]=(int)(Math.random()*26);
			System.out.println("["+i+"]:"+numeros[i]);
		}
		System.out.println("Vector en Orden Contrario");
		for(int i=numeros.length-1;i>=0;i--) 
		{
			System.out.println("["+i+"]:"+numeros[i]);
		}	
	}

}
