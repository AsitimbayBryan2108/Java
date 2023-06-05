package ug.practicas.dominio;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona 
{

    private int codigo;
    private List<Matricula> listaMatriculas;
    private boolean beca;

    public Estudiante(int codigo,String cedula, String nombre, String direccion, String estadoCivil, boolean beca) 
    {
        super(cedula, nombre, direccion, estadoCivil);
        this.codigo = codigo;
        this.beca = beca;
        listaMatriculas = new ArrayList<Matricula>();
    }
    
    public void mostrarDatos()
    {
        System.out.println("------------------DATOS DEL ESTUDIANTE------------------");
        System.out.println("Codigo: "+codigo+"\t\t Cedula: "+cedula);
        System.out.println("Nombre: "+nombre+"\t Estado civil: "+estadoCivil);
        System.out.println("Direccion: "+direccion);
        verificarBeca(beca);
    }
    protected void verificarBeca(boolean beca)
    {
        if (beca)
        {
            System.out.println("El estudiante si es acto para la beca");
        }
        else
        {
            System.out.println("El estudiante no es acto para la beca");
        }
    }
}