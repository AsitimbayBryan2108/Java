package ug.practicas.dominio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClienteOcasional extends Usuario{
    protected List<Documento> listaDocumentos;

    public ClienteOcasional(String cedula, String nombres, String telefono, String correo, String direccion,boolean socio
            ) 
    {
        super(cedula, nombres, telefono, correo, direccion,socio);
        listaDocumentos= new ArrayList<Documento>(2);
    }

    public void mostrarDatos()
    {
        super.datosUsuario();
   

    }

    public void agregarLibro(String codigo, String titulo, int anioPublicacion){
        Libro libro= new Libro(codigo, titulo, anioPublicacion);
        listaDocumentos.add(libro);
    }

    public void agregarRevista(String codigo, String titulo){
        Revista revista= new Revista(codigo, titulo);
        listaDocumentos.add(revista);
    }
}
