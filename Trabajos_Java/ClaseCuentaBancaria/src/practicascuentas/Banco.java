package practicascuentas;

public class Banco 
{
    //! atributo de instancia

    private int codigo;
    private String nombre;


    //! Metodo de acceso
    public int getCodigo() 
    {
        return codigo;
    }
    public String getNombre() 
    {
        return nombre;
    }
    

    //!Constructores
    
    public Banco()
    {

    }
    public Banco(String nombre)
    {
        this.nombre = nombre;
    }
    public Banco(int codigo, String nombre)
    {
        this.codigo = codigo;
        this.nombre = nombre;


    }
}
