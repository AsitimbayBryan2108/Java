package metodos;

import java.util.Scanner;

public class Serie1 
{

    public static void main (String[] args)
    {
        Scanner ingreso=new Scanner(System.in);
        Scanner ingresoSerie = new Scanner(System.in);
        int n;
        String continuar="SI";
        
        while (continuar.equals("SI"))
        {
            System.out.print("Ingrese numero: ");
            n = ingreso.nextInt();
    
            String serie1 = serieUlam(n);
            System.out.printf("Serie: %s", serie1);
    
            System.out.print("\nDesea realizar otra serie [SI] o [NO]:");
            continuar = ingresoSerie.nextLine();
        }


    }
        
        private static String serieUlam(int numero)
        {
            String cadenaSerie = " " + numero;
            final int LIMITE=1;
            //todo aqui va el proceso

            while(numero > LIMITE)
            {
                if(numero %2==0)
                    numero =numero/2;
                else
                    numero = numero *3+1;
                
                cadenaSerie = cadenaSerie   + " "+ numero;
            }
           
            return cadenaSerie;

        }
}