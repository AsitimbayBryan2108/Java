package test;

import java.util.Scanner;

public class ciclo4 
{
    //Realizar un programa que imprime los números múltiplos de cuatro menores o iguales que 100.


    public static void main(String []args)
    {
        int num=100;
        System.out.println("lOS MULTLIPLOS DE CUATRO DE 100 SON:");
        String mutlipo = multipos(num); 
    }


    public static String multipos(int num)
    {

        String multiplo = " " + num;
        for (int i=0; i<=num;i++)
        {
            if (i % 4==0)
            {
                System.out.println(i);
            }
        }
        return multiplo;
    }    
}
