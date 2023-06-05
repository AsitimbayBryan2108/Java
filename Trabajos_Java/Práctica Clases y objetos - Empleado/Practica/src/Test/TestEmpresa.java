package Test;

import practicasEmpleado.Cuenta;
import practicasEmpleado.Empleado;
import practicasEmpleado.Empresa;

public class TestEmpresa 
{
    public static void main (String []args)
    {
        Empresa miEmpresa = new Empresa(546, "SOLUTIONS S.A.");
        Empleado empleado = new Empleado("0952164358", "Bryan Anthony","Asitimbay Sagñay");
        Cuenta miCuenta = new Cuenta();

        //todo Asociacion con entidad banco y entidad cliente
        miCuenta.setEmpresas(miEmpresa);
        miCuenta.setEmpleados(empleado);
        miCuenta.aportacionSeguro(400);
        miCuenta.comisionVenta(730);
        miCuenta.salarioTotal(400);

        miCuenta.consultaRol();
    }    
    
}
