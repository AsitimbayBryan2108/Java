package practicaspruebas;

import practicascuentas.Banco;
import practicascuentas.Cuenta;
import practicascuentas.Cliente;
public class TestCuenta 
{
    public static void main (String []args)
    {
        Banco miBanco = new Banco(10, "Banco Mercantil");
        Cliente cliente = new Cliente(21, "BRYAN ASITIMBAY");
        Cuenta miCuenta = new Cuenta();

        //todo Asociacion con entidad banco y entidad cliente
        miCuenta.setBanco(miBanco);
        miCuenta.setTitular(cliente);


        miCuenta.apertura(30);
        miCuenta.apertura(85);
        miCuenta.deposito(680);
        
        miCuenta.consultaSaldo();
    }    
}


