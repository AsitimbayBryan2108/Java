package detectives.dominio;

public class Casos extends Agente{

    private static String apellidos;
    private int numCaso;
    private int fechaApertura;
    private String descripcion;
    private String Estado;

    

    public Casos(String cedula, int codigo, int numCaso, int fechaApertura, String descripcion, String estado) {
        super(cedula, nombres, apellidos, telefono, alias, direccion, codigo);
        this.numCaso = numCaso;
        this.fechaApertura = fechaApertura;
        this.descripcion = descripcion;
        Estado = estado;
    }


    @Override
    public void presentarDatosFiliatorios()
    {
        System.out.println("------------------------------------------");
        System.out.printf("Numero de caso: %s \t Alias: %s ", this.numCaso, this.alias);
        System.out.printf("\nDescripcion:"+this.descripcion);
        System.out.printf("\nFecha apertura: %s \t Estado: %s \n", this.fechaApertura, this.Estado);
        System.out.println("------------------------------------------");

    }
    
}
