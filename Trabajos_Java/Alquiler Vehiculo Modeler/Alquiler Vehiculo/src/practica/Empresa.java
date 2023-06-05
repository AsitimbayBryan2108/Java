package practica;

public class Empresa 
{
    private int codigo;
    private String nombre;
    
    //#region
    public Empresa()
    {
    }
        public Empresa(int codigo, String nombre)
        {
            this.codigo = codigo;
            this.nombre = nombre;

        }
    //#endregion

    public void presentacionDatos()
    {
        System.out.printf("\t\t %d - %s\n",this.codigo,nombre);

    }

}
