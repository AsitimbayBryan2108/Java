package fundamentos.tipos;
import java.util.Scanner;


public class EntradaSalida 
{
    //! Declaracion de constantes
    static final String CONMPANIA="SU LLANTA CIA";
    static final float DESCUENTO_VENTA= 0.07f;
    static final String PROCESO="VENTA";
    static final String LINEA="==================================";
    static Scanner ingreso;

    public static void main (String[] args)
    {
        
        ingreso = new Scanner(System.in);

        //! Declarar las variables de ingreso
        String nombres;
        String cedula;
        int cantidad;
        float precio;
        //todo Variables de trabajo
        double subtotal=0;
        double valorDescuento=0;
        double valorPagar=0;

        //todo Ingresar por teclado(entrada de datos)
        System.out.print("Ingresar cedula:");
        cedula = ingreso.nextLine();
        System.out.print("Ingresar los nombres:");
        nombres = ingreso.nextLine();
        System.out.print("Ingresar cantidad:");
        cantidad = Integer.parseInt(ingreso.nextLine());
        System.out.print("Ingresar precio:");
        precio = Float.parseFloat(ingreso.nextLine());
        //todo Mostrar por consola

        System.out.println(CONMPANIA);
        System.out.println(PROCESO);
        System.out.println(LINEA);
        System.out.println("Cedula:" + cedula);
        System.out.println("Cliente:" + nombres);
        System.out.println(LINEA);

        System.out.printf("cantidad: %d \n", cantidad);
        System.out.printf("precio: %.2f \t          Subtotal: %.2f \n", precio, subtotal);
        System.out.printf("Total Descuento: %.2f \t Descuento: %.2f \n", valorDescuento, DESCUENTO_VENTA);
        System.out.printf("Valor a Pagar: %.2f \n", valorPagar);

        System.out.println(LINEA);


    }
    
    
}
