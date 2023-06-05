package metodos;
import java.util.Scanner;

public class Seriemenu {
    

    public static void main(String[] args) {
        
        Scanner ingresoMenu = new Scanner(System.in);
        Scanner ingreso = new Scanner(System.in);
        Scanner ingresoSerie = new Scanner(System.in);
        int numero;
        final int LIMITE = 1;
        String continuar = "SI";
        int menu = 1;
        while (menu != 4){
                System.out.print("Series \n1) Serie Ulam \n2) Serie de Fibonacci \n3) Serie X \n4) Cerrar \n DIgite la serie:");
                menu = ingresoMenu.nextInt();
            switch (menu) {
                
                case 1:
                    while (continuar.equals("SI"))
                    {
                        System.out.print("Ingrese numero: ");
                        numero = ingreso.nextInt();
                
                        String serie1 = serieUlam(numero);
                        System.out.printf("Serie: %s", serie1);
                
                        System.out.print("\nDesea realizar otra serie [SI] o [NO]:");
                        continuar = ingresoSerie.nextLine();

                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
            

            }

        }
    }


private static String serieUlam(int numero){
    
    String cadenaSerie = " " + numero;
    final int LIMITE = 1;

    for (;numero > LIMITE;){
            if(numero % 2 == 0)
            numero = numero / 2;
            else
            numero = (numero * 3) + 1;
            
            cadenaSerie = cadenaSerie + " " + numero;
        }        

        return cadenaSerie;
    }


    
}