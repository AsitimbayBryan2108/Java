package pruebas;

import practica.Cliente;
import practica.Empresa;
import practica.Vehiculo;
import practica.Alquiler;

public class TestAlquilerVehiculo 
{
    public static void main(String[] args) 
    {
        Empresa empresa = new Empresa(10,"STOP RENTA CAR");
        Cliente cliente = new Cliente(21, "Bryan Asitimbay","0968252615");
        Vehiculo auto = new Vehiculo(112,"Chevrolet",2022,"AVEO",5,"GLV-499");
/* 
        empresa.presentacionDatos();
        cliente.presentarDatos();
        auto.presentarDatos();
*/

        Alquiler alquiler =new Alquiler(154,500,empresa,cliente,auto);
        alquiler.presentarDatos();

        
    }
}