package ug.practicas.dominio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matricula
{

    public static final char[] matri = null;
    private int codigo;
    private List<Asignatura> listaAsignaturas;
   
   
    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public Matricula(int codigo) 
    {
    listaAsignaturas= new ArrayList<Asignatura>(); 
    
    this.codigo=codigo;     
    }
    
    public boolean agregarAsignaturas(int codigo, String nombre, String profesor, String curso)
    {
        Asignatura asignatura= new Asignatura(codigo, nombre, profesor, curso);
        return listaAsignaturas.add(asignatura);
        
    }

    public void mostrarAsignaturas(Asignatura asignatura, boolean codigo) 
    {       
        Asignatura result = this.buscarPorCodigo(asignatura.getCodigo());     
        if(result == null) 
        {
        System.out.println( asignatura.getCodigo() + " no fue encontrado");
        return;          
        }    
    }
        
    public Asignatura buscarPorCodigo(int codigo) 
    {
        for(Asignatura a: listaAsignaturas) 
        {
        if(a.getCodigo() == codigo)
            return a;
        }
            return null;
    }

    public char[] mostrarAsignaturas(Scanner asignatura) 
    {
        return null;
    }

}
 