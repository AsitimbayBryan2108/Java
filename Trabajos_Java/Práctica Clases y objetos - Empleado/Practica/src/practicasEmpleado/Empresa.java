package practicasEmpleado;

public class Empresa 
{
    private int rol;
    private String nombre;

    public int getrol() 
    {
        return rol;
    }
    public String getNombre() 
    {
        return nombre;
    }

    public Empresa()
    {

    }
    public Empresa(String nombre)
    {
        this.nombre = nombre;
    }
    public Empresa(int rol, String nombre)
    {
        this.rol = rol;
        this.nombre = nombre;


    }
}
