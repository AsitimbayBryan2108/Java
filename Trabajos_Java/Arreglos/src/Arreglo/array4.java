package Arreglo;

import java.util.Scanner;

public class array4 
{
	//Diseñe un programa que lea un número cualquiera y lo busque en el vector X, 
	//el cual tiene almacenados 10 elementos. Escribir la posición donde se encuentra almacenado 
	//el número en el vector o el mensaje “NO” si no lo encuentra. Búsqueda secuencial.
	
	public static void main(String[]args) 
	{
		int [] vectorx = new int [10];
		vectorx[0]=4;
		vectorx[1]=8;
		vectorx[2]=12;
		vectorx[3]=16;
		vectorx[4]=20;
		vectorx[5]=24;
		vectorx[6]=28;
		vectorx[7]=32;
		vectorx[8]=36;
		vectorx[9]=40;
		
		Scanner ingreso = new Scanner(System.in);
		int posicion=-1;		
		
		System.out.print("Ingreso numero:");
        int n = ingreso.nextInt();
        for (int i=0 ; i< vectorx.length; i++)
        {
            if (vectorx [i]== n)
            {
                posicion = i;
            }
        }

        if ( posicion == -1)
        {
            System.out.println("No se ha encontrado el numero en el vector");
        }
        else 
        {
           System.out.printf("La posicion de " +n+  " es: %d"  , posicion); 
        }
    }	
	//System.out.println("["+vector3[v1]+"]");

}
