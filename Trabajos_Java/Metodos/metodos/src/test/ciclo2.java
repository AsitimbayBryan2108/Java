package test;
import java.util.Scanner;

public class ciclo2 
{
    // Realizar un programa, que, dado un número entero positivo ingresado por el usuario, cuente y muestre
    // por pantalla todos sus divisores enteros positivos.
    public static void main(String[]args)
    {
    Scanner ingreso= new Scanner(System.in);
    int num;
    System.out.println("DIVISORES DE NUMEROS ENTEROS POSITIVOS");
    System.out.printf("Ingrese el numero:");
    num = ingreso.nextInt();   
    System.out.println("Los numeros divisores positivos son:");
    String divisor = divisores(num);    
    }
    

    public static String divisores(int num)
    {
        String divisor = " " + num;
        int resultado;
        int contador=0;
        for (int i=1; i<=num; i++)
    {
        resultado=num%i;
        if (resultado==0)
        {
            contador++;           
            System.out.println(i);
        }
    }		  
        return divisor;

    }
}
