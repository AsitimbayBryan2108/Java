package practicascuentas;

public class Cliente 
{
    //! atributos de instancia

    private int codigo;
    private String nombres;
    private String cedula;

    //! metodo de acceso
    public int getCodigo()
    {
        return codigo;

    }
    public String getNombres()
    {
        return this.nombres;

    }
    //!Constructores

    public Cliente ()
    {
        
    }
    public Cliente(int codigo, String nombres)
    {
        this.codigo = codigo;
        this.nombres = nombres;
    }
}
