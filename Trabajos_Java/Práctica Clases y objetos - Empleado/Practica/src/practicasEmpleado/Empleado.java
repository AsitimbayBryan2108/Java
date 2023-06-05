package practicasEmpleado;

public class Empleado 
{
    private String apellido;
    private String nombres;
    private String cedula;

    
    public String getapellido()
    {
        return apellido;

    }
    public String getnombres()
    {
        return this.nombres;

    }
    public String getcedula ()
    {
        return this.cedula;
    }
    public Empleado(String cedula, String nombres, String apellido)
    {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellido = apellido;
    }
    
}
