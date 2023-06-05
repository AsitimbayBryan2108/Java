package ug.practicas.generalizacion.prueba;

import ug.practicas.generalizacion.dominio.*;


public class TestNominaEmpleado 
{
    public static void main(String[] args) 
    {
        Empleado contador = new EmpleadoAdministrativo(21, "0968252615", "Bryan Asitimbay", true , 500);
        Empleado vendedor = new EmpleadoVenta(2003, "0989503221", "Shirley Gomez",true, 1500.00);
        Empleado proyecto = new EmpleadoProyecto(8, "0952164358", "Kevin Guerrero",false, 48);
        
        contador.presentarRol();        
        vendedor.presentarRol();
        proyecto.presentarRol();
    }

}
