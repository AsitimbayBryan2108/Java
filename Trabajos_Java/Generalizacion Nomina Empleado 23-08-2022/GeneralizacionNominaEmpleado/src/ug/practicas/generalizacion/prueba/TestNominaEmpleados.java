package ug.practicas.generalizacion.prueba;

import ug.practicas.generalizacion.dominio.Empleado;
import ug.practicas.generalizacion.dominio.EmpleadoAdministrativo;
import ug.practicas.generalizacion.dominio.EmpleadoVentas;

public class TestNominaEmpleados 
{

    public static void main(String[] args) 
    {
        Empleado contador=new EmpleadoAdministrativo(2108,"0968252615","Bryan Asitimbay Sagñay",500);
        Empleado vendedor=new EmpleadoVentas(704, "0968252615", "Bryan Asitimbay",1500.00);


        contador.presentarDatosFiliatorios();
        vendedor.presentarDatosFiliatorios();
    }
    
}
