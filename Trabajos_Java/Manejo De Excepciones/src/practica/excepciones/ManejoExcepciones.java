package practica.excepciones;

import java.util.Scanner;

public class ManejoExcepciones {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        int a;
        int b;

        try {
            System.out.print("Ingresar operando 1: ");
            a = Integer.parseInt(ingreso.nextLine());

            System.out.print("Ingresar operando 2: ");
            b = Integer.parseInt(ingreso.nextLine());

            int res = a / b;

            System.out.print("Se ejecutó el print de la linea 17...\n");
        } catch (NumberFormatException e) {
            System.out.print("Excepcion atrapada!!! Debe ingresar datos numericos...\n" + e.getMessage());
        } catch (ArithmeticException aer) {
            System.out.print("Excepcion atrapada !!! divisor no debe ser cero... \n" + aer.getMessage());
        }
        // finally
        // {
        // System.out.print("El bloque finally de sentencias siempre se
        // ejecutará...\n");
        // }
    }
}
