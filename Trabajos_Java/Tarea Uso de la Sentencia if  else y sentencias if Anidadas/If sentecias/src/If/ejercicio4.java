package If;
import java.util.Scanner;
public class ejercicio4 
//Una frutería ofrece las manzanas con descuento según la siguiente tabla:
// Numero de kilos comprados % Descuento
// 0 − 2 0%
// 2.01 − 5 10%
// 5.01 − 10 15%
// 10.01 en adelante 20%
//Determinar cuánto pagara una persona que compre manzanas es esa frutería.

{
    public static void main(String[] args) {

        float manzana;
        float precio=1.25f;
        Scanner kilos = new Scanner(System.in);
        float descuento;
        float total;
 
        System.out.print("Ingrese cuantas Kilos de manzana desea: ");
        manzana = kilos.nextFloat();

        if (manzana > 2.1 && manzana <5)
        {         
            descuento=(float) ((manzana*precio)*0.10);
            total=(manzana*precio)-descuento;
            System.out.printf("Tiene un Descuento de 10: %.2f  \n",descuento);
            System.out.println("Total a pagar es: "+total);
        }             
        else if (manzana > 5.1 && manzana <10)
        {
            descuento=(float) ((manzana*precio)*0.15);
            total=(manzana*precio)-descuento;
            System.out.printf("Tiene un Descuento de 15: %.2f  \n",descuento);
            System.out.println("Total a pagar es: "+total);
        }
        else if (manzana > 10.1)
        {
            descuento=(float) ((manzana*precio)*0.20);
            total=(manzana*precio)-descuento;
            System.out.printf("Tiene un Descuento de 20: %.2f  \n",descuento);
            System.out.println("Total a pagar es: "+total);
        }
        else
            total=manzana*precio;
            System.out.println("No tiene descuento, total a pagar:"+total);
    }
    
}
