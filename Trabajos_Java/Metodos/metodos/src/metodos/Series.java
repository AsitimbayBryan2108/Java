package metodos;
import java.util.Scanner;
public class Series 
{
    public static Scanner ingreso;
    public static void main(String[] args) 
    {
       
       ingreso = new Scanner(System.in);
    
       //uiSerieUlam();
       //serieFibonacci(5);
        int limite=7;
        int b=3;

        int res=potencia(b, limite);
        System.out.println("Potencia base: 2 expo 3=> " + res);
    }
 
    private static void uiSerieUlam()
    {
       String continuar = "S";
       int n;
       
       while (continuar.equals("S"))
       {
          System.out.print("Ingresar numero: "); 
          n = Integer.parseInt(ingreso.nextLine());
 
          //! llamada al método
          String serie1 = serieUlam(n);
          System.out.printf("\n Serie: %s ", serie1);
 
          System.out.print("\n Desea generar otra secuencia: [S/N]: " );
          continuar = ingreso.nextLine();
       }
    }
          
    public static String serieUlam(int numero)
    {
       String cadenaSerie = " " + numero;
       final int LIMITE = 1;
 
        //! Generar el sgte numero -- Regla
       while(numero > LIMITE)
       {
          if(numero % 2 == 0)
             numero = numero / 2;
          else
              numero = numero * 3 + 1;
       
          cadenaSerie = cadenaSerie + " " + numero;
       }
 
       return cadenaSerie;
    }
    
    public static String serieFibonacci(int limite)
    {
        int x=1;
        int y=1;
        int suma=0;
        String cadenaSerie = "" + x + " " + y;

        //! generar la primera secuencia y alternar valores de x,y
        suma=x+y;
        x=y;
        y=suma;

        cadenaSerie=cadenaSerie+" "+suma;

        return cadenaSerie;
    }
    private static int potencia(int base, int exponente)
    {
        int resultado=1;
 
        for(int i=1;i<= exponente;i++)
           resultado=resultado*base;
 
         return resultado;
    }
    
}
