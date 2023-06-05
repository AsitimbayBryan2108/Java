package ciclos;

import java.util.Scanner;

public class JuegoAdivinarFor 
{
    public static void main(String[]args) 
    {
        //!Declaracion de variables
        Scanner ingreso = new Scanner(System.in);
        int numeroAleatorio;
        int numeroIngresado;
        String mensaje;
        int numeroIntentos=5;
        boolean adivinastes=false;
        int totalIntentos=1;

        //! Desarrollo
        numeroAleatorio = (int)(Math.random()*20)+1;

        //for(int i=1;i==1;numeroIntentos--)//todo Variable de control del ciclo
        //for(numeroIntentos=0;numeroIntentos>=1;numeroIntentos--)
        for(int i=0; i<5;i++)
        {
             System.out.print("Ingreso numero:");
             numeroIngresado = ingreso.nextInt();
        
        
            if(numeroIngresado < numeroAleatorio)
                mensaje="numero es demasiado bajo!!! Intente otra vez...";
            else if(numeroIngresado > numeroAleatorio)
                mensaje="numero es demasiado Alto!!! Intente otra vez...";
            else 
            {
                adivinastes =true;
                mensaje="Adivinastes!!!";
                break;
            }
            System.out.println(mensaje);
            numeroIntentos=numeroIntentos-1; //todo actualizar la variable de control
            totalIntentos +=1;
        }
        //!Mostrar los resultados
        if(!adivinastes)
            System.out.println("Perdistes!!! No pudise adivinar el numero...");
        else
            System.out.printf("Ganastes!!! adivinastes en %d intentos...\n",totalIntentos);
    }

   
}
