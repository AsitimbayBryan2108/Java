package ug.practicas.dominio;

public class Persona 
{
    protected String cedula;
    protected String nombre; 
    protected String direccion;
    protected String estadoCivil;

    public Persona(String cedula, String nombre, String direccion, String estadoCivil)
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
    } 
}
