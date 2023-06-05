package condicionales;

import java.util.Scanner;

public class Juego1 
{
     //!Juego piedra papel o tijera
     public static void main(String[] args)
     {
         Scanner ingreso = new Scanner(System.in);
         String eleccionUsuario="";
         String eleccionComputadora="";
         String resultado="";


     
         //pedir por consola que ingrese el usuario su opcion
         // system.out.print("Ingresar opciones -- piedra papel tijera:");
         //eleccionUsuario = ingreso.nextLine();
         System.out.println("Ingresar opcion  \n piedra \n papel \n tijera");
         eleccionUsuario=ingreso.nextLine();
         //generar la opcion de la computadora -- clase math
         int numeroAleatorio= (int)Math.floor(Math.random()*3)+1;
         //System.out.print("Numero:"+numeroAleatorio);
    
         //! realizado con sentencia simples
         //if (numeroAleatorio==1)
         //   eleccionComputadora= "Piedra";
         //if (numeroAleatorio==2)
         //   eleccionComputadora= "Papel";
         //if (numeroAleatorio==3)
         //   eleccionComputadora= "Tijera";
    
         //! realizado con sentencias anidadas
        //  if (numeroAleatorio==1)
        //     eleccionComputadora= "Piedra";
        //  else if (numeroAleatorio==2)
        //     eleccionComputadora= "Papel";
        //  else
        //     eleccionComputadora= "Tijera";
        
         //!realizado con un switch
         switch(numeroAleatorio)
         {
             case 1:
                eleccionComputadora="piedra";
                break;
             case 2:
                eleccionComputadora="papel";
                break;
             case 3:
                eleccionComputadora="tijera";
                break;
    
         }
         System.out.println("Eleccion de la computadora:" + eleccionComputadora);

         //Indicar el resultado
         //switch evaluando una cadena

         //Cuando se realice comparacion de cadenas usar el operador equals
         switch(eleccionComputadora)
        {
            case "piedra":
                if(eleccionUsuario.equals("piedra"))
                    resultado= "Es un empate!";
                else if(eleccionUsuario.equals("papel"))
                    resultado = "Tu ganas!";
                    else 
                    resultado = "Tu pierdes!";
                break;
            case "papel":
                if(eleccionUsuario.equals("piedra"))
                    resultado = "Tu pierdes!!";
                else if (eleccionUsuario.equals("papel"))
                    resultado = "Es un empate!!";
                else
                    resultado = "Tu ganas!!";
                break;
            case "tijera":
                if(eleccionUsuario.equals("piedra"))
                    resultado = "tu ganas!!!";
                else if (eleccionUsuario.equals("papel"))
                    resultado = "Tu pierdes!!!";
                else
                    resultado = "Es un empate!!!";
                break;
        } 
        System.out.println("Resultado:"+resultado);   
     }
}
