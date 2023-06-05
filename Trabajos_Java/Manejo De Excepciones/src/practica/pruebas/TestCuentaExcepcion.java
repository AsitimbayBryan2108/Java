package practica.pruebas;

import practica.excepciones.CuentaBancariaException;
import practicas.dominios.Cuenta;

public class TestCuentaExcepcion 
{
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();

        try
        {
        miCuenta.apertura(35);
        }
        catch(NumberFormatException e)
        {
        System.out.print(e.getMessage());    
        }
        catch(CuentaBancariaException cbe)
        {
            System.out.print(cbe.getMessage());
        }    
    }    
}
