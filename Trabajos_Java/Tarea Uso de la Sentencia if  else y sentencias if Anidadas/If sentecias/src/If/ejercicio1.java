package If;
import java.util.Scanner;
public class ejercicio1

// Una compañía de seguros ha establecido un programa para captar clientes, que consiste en lo
// siguiente: Si el monto por el que se contrata el seguro es menor que $4500 la cuota a pagar será por
// el 3.5% del monto, y si el monto es mayor que $4500 la cuota a pagar será el 2.5% del monto. La
// compañía de seguros desea determinar cuál será la cuota que debe pagar un cliente. El programa debe
// realizar el ingreso de valores a las variables respectivas por consola, calcular el valor de la cuota a pagar
// por el cliente y mostrar por pantalla la información requerida.

{
    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);
        int costoSeguro;
        int precioMinimo = 4500;
        int precioFinal;


        System.out.print("Cuanto va a pagar: ");
            costoSeguro = ingreso.nextInt();

        if (costoSeguro > precioMinimo)
            precioFinal = (int) (costoSeguro * 0.025);
        else 
            precioFinal = (int) (costoSeguro * 0.035);

        System.out.println("El valor a pagar es: " + precioFinal);

    }
    
}
