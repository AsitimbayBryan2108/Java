package If;
import java.util.Scanner;
public class ejercico2 

// Una empresa inmobiliaria ofrece viviendas para un programa social, bajo los siguientes términos: Si
// los ingresos del comprador son menores de $5000, la entrada será del 10% del costo de la vivienda y
// el resto se distribuirá en pagos mensuales, a pagar en 15 años. Si los ingresos del comprador son igual
// o mayores de $5000, la entrada será del 20% del costo de la vivienda y el resto se distribuirá en pagos
// mensuales a pagar en 10 años. La empresa quiere obtener cuanto debe pagar un comprador por
// concepto de entrada y cuanto por cada pago mensual.

{
    static Scanner ingreso;

    public static void main(String[] args) 
    {
        int valorVivienda;
        float comprador;
        double entrada;
        ingreso = new Scanner(System.in);
        double entradaMenor = 10;
        double entradaMayor = 20;
        double pagoMensual;

        System.out.print("Ingresar valor de la vivienda ");
        valorVivienda = Integer.parseInt(ingreso.nextLine());

        System.out.print("Escribe tu ingreso ");
        comprador = Integer.parseInt(ingreso.nextLine());

        if(comprador < 5000)
        {
            entrada = (valorVivienda * entradaMenor)/100;
            pagoMensual = (valorVivienda - entrada) / (12 * 15);
            System.out.println("La entrada que se aplico es del 10%");
        }
        else 
        {
            entrada = (valorVivienda * entradaMayor)/100;
            pagoMensual = (valorVivienda - entrada) / (12 * 10);
            System.out.println("La entrada que se aplico es del 20%");
        }

        System.out.println("El valor de la entrada a pagar es de: " + entrada);
        System.out.println("El valor de los pagos mensuales seran de: " + pagoMensual);



    }
    
    
}
