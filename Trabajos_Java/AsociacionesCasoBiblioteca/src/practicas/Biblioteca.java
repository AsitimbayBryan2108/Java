package practicas;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca 
{
    private String usuario;
    private int documento;

    
    

    // Cuando el usuario solicita un documento, se comprueba si
    // está disponible y si no hay problemas por documentos no devueltos para realizar el préstamo,
    // quedando constancia de la fecha de alquiler y la fecha máxima de entrega; de forma que cuando el
    // usuario devuelva el documento se podrá comprobar si se le tiene que aplicar una multa.


    private List<ClienteOcasionales>listaLibros;
    private String codigo;

    public Biblioteca(int codigo, String nombre) 
    {
        listaLibros = new ArrayList<ClienteOcasionales>();
        this.documento = codigo;
        this.codigo = nombre;
    }
    public void agregarLibro(ClienteOcasionales libro)
    {
        listaLibros.add(libro);
    }

    


}
