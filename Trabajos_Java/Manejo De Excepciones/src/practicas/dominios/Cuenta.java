package practicas.dominios;

import practica.excepciones.CuentaBancariaException;

public class Cuenta 
{
    static final double SALDO_MINIMO = 50.00;
    
    private double saldoActual;


    public double apertura(double monto)throws CuentaBancariaException
    {
        if (monto<  SALDO_MINIMO)
        //System.out.print("Excepcion !!! El saldo minimo para aperturar una cuenta es "+ SALDO_MINIMO);
        //throw new Exception("el monto es menor al saldo minimo de apertura permitido!!!");
        throw new CuentaBancariaException("O");
        else
            saldoActual = monto;

        return saldoActual;
    
    }

}
