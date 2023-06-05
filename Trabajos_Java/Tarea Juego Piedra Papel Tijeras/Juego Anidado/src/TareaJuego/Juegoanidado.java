package TareaJuego;

import java.util.Scanner;

public class Juegoanidado 
{
         //!Juego piedra papel o tijera
         public static void main(String[] args)
         {
             Scanner ingreso = new Scanner(System.in);
             String eleccionUsuario="";
             String eleccionComputadora="";
             String resultado="";
    
             System.out.println("Ingresar opcion  \n >piedra \n >papel \n >tijera");
             eleccionUsuario=ingreso.nextLine();
    
             int numeroAleatorio= (int)Math.floor(Math.random()*3)+1;
    
             //! realizado con sentencias anidadas
             if (numeroAleatorio==1)
                eleccionComputadora= "piedra";
    
             else if (numeroAleatorio==2)
                eleccionComputadora= "papel";
             else
                eleccionComputadora= "tijera";
    
             System.out.println("Eleccion de la computadora:" + eleccionComputadora);
    
             //!Switch
    
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
    

