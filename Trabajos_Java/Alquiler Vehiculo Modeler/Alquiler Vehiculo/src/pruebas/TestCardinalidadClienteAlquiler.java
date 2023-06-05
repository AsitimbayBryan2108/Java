package pruebas;

import practica.Empresa;
import practica.Cliente;
import practica.Vehiculo;
import practica.Alquiler;

public class TestCardinalidadClienteAlquiler 
{
    public static void main(String[] args)
    {
        Empresa empresa =  new Empresa(1, "STOP RENTA CAR");
    
        Cliente cliente01 = new Cliente (10, "0958590754","Bryan Asitimbay");
        Cliente cliente02 = new Cliente (12, "0958132513","Josue Mancilla");
        
        Vehiculo camioneta = new Vehiculo (25,"RENAULT", "OROCH");
        Vehiculo sedan =     new Vehiculo (42,"CHEVROLET", "AVEO");
    
        Alquiler alquiler10 = new Alquiler ( 689, empresa, cliente01, camioneta);
        Alquiler alquiler20 = new Alquiler ( 578, empresa, cliente02, sedan);
    }
    


}
    

