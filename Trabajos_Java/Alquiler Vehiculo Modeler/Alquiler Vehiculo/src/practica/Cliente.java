package practica;

public class Cliente 
{
    private int codigo;
    private String nombre;
    private String cedula;
    
    //#region 
    public Cliente() 
    {
    }


    public Cliente(int codigo, String nombre, String cedula) 
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
    }
    //#endregion

    public void presentarDatos()
    {
        System.out.printf("Codigo: %d \t\t Cedula:%s \t\t Nombres:%s\n",this.codigo,cedula,nombre);

    }

    

    
    
}
