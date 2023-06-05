package ejercicico1;
import java.time.LocalDate;
public class TestBanco 
{
    
   static String PROGRAMA = "CONSULTA DE SALDO";
   static String LINEA = "===========================================";
   static String BANCO = "BANCO MERCANTIl";
   
   public static void main(String[] args) 
   {    
      BancoMercantil cuenta1 = new BancoMercantil();
    
       cuenta1.fechaAperturaCuenta = LocalDate.of(2022, 07, 1);

      
      
      System.out.println(LINEA);
      System.out.println("\t \t"+ BANCO);
      System.out.println("\t \t"+ PROGRAMA);
      System.out.println(LINEA);


      System.out.println("Numero de Cuenta: " + cuenta1.numeroCuenta);
      System.out.println("Titular de Cuenta: " + cuenta1.titularCuenta);
      System.out.println("SALDO: " + cuenta1.saldoActualCuenta +  "\t FECHA APERTURA: "+ cuenta1.fechaAperturaCuenta+ "\n" );
      
      System.out.println(LINEA);
      
   }
    
}
