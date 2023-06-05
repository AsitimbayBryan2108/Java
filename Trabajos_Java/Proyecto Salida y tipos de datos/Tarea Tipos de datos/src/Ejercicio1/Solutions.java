package Ejercicio1;

public class Solutions 
{
      //todo Declaramos las constantes
      static String EMPRESA = "SOLUTIONS S.A.";
      static float DESCUENTO_PAGO = 0.0945f;
      static String PROCESO = "ROL DE PAGO";
      static String LINEA= "================================================";
  
  
      public static void main (String[] args)
      {
  
          //todo Declaracion de valores de ingreso
  
          String mes= "Junio" ;
          String nombres= "Bryan Asitimbay";
          byte edad= 18;
          String porcentaje= "9,45";
          double sueldo=400;
          double aporteSeguro=sueldo*DESCUENTO_PAGO;
          double valorRecibir=sueldo-aporteSeguro; 
  
  
  
          //todo Muestra en la consola
          System.out.println("\t \t "+EMPRESA);
          System.out.println("\t \t  "+PROCESO);
          System.out.println(LINEA);
  
          System.out.println("Mes:" + mes);
          System.out.printf("Empleado:%s  \t  Edad:%s \n " , nombres, edad);
          System.out.println(LINEA);
          System.out.println("Sueldo:"+sueldo );
          System.out.printf("Aporte seguro:%.2f \t    Aporte:%s \n ",aporteSeguro,porcentaje);
  
          
          System.out.printf("Valor a Recibir:%.2f \n ",valorRecibir);
  
          System.out.println(LINEA);

      }
  
    
}
