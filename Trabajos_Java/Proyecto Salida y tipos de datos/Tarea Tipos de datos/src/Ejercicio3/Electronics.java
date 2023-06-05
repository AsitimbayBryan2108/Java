package Ejercicio3;

public class Electronics 
{
              //todo Declaramos las constantes
              static float CUOTA = 0.08f;
              static String EMPRESA = "ELECTRONICS S.A.";
              static String PROCESO = "VENTA TV LED";
              static String LINEA= "================================================";
          
          
              public static void main (String[] args)
              {
          
                  //todo Declaracion de valores de ingreso
          
                  String codigoCliente= "0968252615" ;
                  String Cliente= "Bryan Asitimbay";
                  byte cuotas=12;
                  String entrada= "%8";
                  double precio=400;
                  double cuotaEntrada=precio*CUOTA;
                  double cuotaMensual=(precio-cuotaEntrada)/12;

     
        
          
                  //todo Muestra en la consola
                  System.out.println("\t \t "+EMPRESA);
                  System.out.println("\t \t "+PROCESO);
                  System.out.println(LINEA);
          
                  System.out.println("Codigo del Cliente:" + codigoCliente);
                  System.out.println("Cliente:" + Cliente);
                  System.out.println(LINEA);
    
                  System.out.println("Precio:" + precio);
                  System.out.printf("Cuota de Entrada:%.2f \t    Entrada:%s \n ",cuotaEntrada,entrada);
                  System.out.printf("Cuota Mensual:%.2f \t    Cuotas:%s \n ",cuotaMensual,cuotas);
                  System.out.println(LINEA);      
              }
    
}
