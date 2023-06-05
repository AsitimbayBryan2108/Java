package Ejercicio4;

public class Area 
{
          //todo Declaramos las constantes
          static float PI = 3.1416f;
          static String EMPRESA = "AREA Y PERIMETRO DE UN CÍRCULO";
          static String LINEA= "================================================";
      
      
          public static void main (String[] args)
          {
      
              //todo Declaracion de valores de ingreso
      
              double radio=23;
              double area=PI*Math.pow(radio,2);
              double perimetro=2*PI*radio;
      
              //todo Muestra en la consola
              System.out.println("\t"+EMPRESA);
              System.out.println(LINEA); 
              System.out.printf("Radio:%s\t    PI:%s \n ",radio,PI);
              System.out.println(LINEA);
              System.out.printf("Area:%.2f \t    Perimetro:%.2f \n ",area,perimetro);
              System.out.println(LINEA);
    
          }
}
    

