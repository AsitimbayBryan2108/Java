package seccion2;

import seccion3.Empleado;
import seccion3.Monitor;

public class presentacion {
    public static void main (String[] args)
    {
        //!Constantes
        final String TITULO = "PRESENTACION DE LA SESION";
        final float TASA_INTERES = 0.05F;

        //! Primitivos

        //* Numericos enteros ----> python int
        byte valor1, valor2, edad=18;
        int numeroCodigo=2356, secuencia;
        short anio=2022;
        long serial = 154569874;

        //* Numericos reales ----> python float
        float interes = 0.15f;
        double monto= 526.93;

        //* booleano ----> python bool
        boolean estaEncendido = true;
        
        //* caracter
        char letra = 'A';

        //! Refereciados ---> String Byte Short Integer Long --- Float Double -- Boolean -- Charcater
        String nombre = "Carlos Paredes Insua"; // python str

        Double saldo = 1852.45;

        //todo crear variables de tipos personalizados 

        Monitor m1;
        Monitor m2;
        Empleado e1;
        
        //============================ PRESENTACION DE LOS TIPOS DE DATOS ===========
        System.out.print("Presentacion de tipo de datos \n\n");

        System.out.println("Numericos");
        System.out.printf("byte: %d \t short: %d \t int: %d \t long:%d", edad, anio, numeroCodigo, serial);

        System.out.println("Reales");
        System.out.printf("float: %.2f \t double: %02f", monto, saldo);

        System.out.printf("cadena: %s \n", nombre);
    }
}

    

