package Ejercicio2;

public class Cambio 
{
          //todo Declaramos las constantes
          static float CAMBIO_DIVISA = 0.95f;
          static String EMPRESA = "El Cambio.com";
          static String PROCESO = "CAMBIO DE DIVISA";
          static String LINEA= "================================================";
      
      
          public static void main (String[] args)
          {
      
              //todo Declaracion de valores de ingreso
      
              String cedula= "0968252615" ;
              String nombres= "Bryan Asitimbay";
              String porcentaje= "0.95";
              double valorDolares=400;
              double entregaEuros=valorDolares*CAMBIO_DIVISA;
 
    
      
              //todo Muestra en la consola
              System.out.println("\t \t "+PROCESO);
              System.out.println("\t \t "+EMPRESA);
              System.out.println(LINEA);
      
              System.out.println("Cedula:" + cedula);
              System.out.println("Cliente:" + nombres);
              System.out.println(LINEA);

              System.out.printf("Valor en Dolares:%.2f \t    Cambio:%s \n ",valorDolares,porcentaje);
              System.out.printf("Valor a Recibir:%.2f \n ",entregaEuros);
      
              System.out.println(LINEA);
    
          }
}
