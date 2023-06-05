package ug.practicas.dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Documento 
{
    protected String codigo;
    protected String titulo;
    
    public Documento(String codigo, String titulo) 
    {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    // List<Documento> documentos= new ArrayList<Documento>();

    // public void documentos()
    // {
    // }
    // public List<Documento> getDoc() 
    // {
    //     return documentos;
    // }
    
    // public void setAsignaturas(List<Documento> documentos) 
    // {
    //     this.documentos = documentos;
    // }
    


    // public void mostrarDocumentos()
    // {
    //     System.out.println("------------------DATOS DEL DOCUMENTO------------------");
    //     System.out.println("Codigo:"+codigo);
    //     System.out.println("Titulo:"+titulo);

    // }

    // public String getCodigo() {
    //     return codigo;
    // }

    // public void setCodigo(String codigo) {
    //     this.codigo = codigo;
    // }

    // public String getTitulo() {
    //     return titulo;
    // }

    // public void setTitulo(String titulo) {
    //     titulo = titulo;
    // }




    
    
    
}
