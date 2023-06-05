package detectives.dominio;

public class Agente {
    protected String cedula;
    protected static String nombres;
    protected String Apellidos;
    protected static String telefono;
    protected static String alias;
    protected static String direccion;
    protected int codigo;
    public int numCaso;



    public Agente(String cedula, String nombres, String apellidos, String telefono, String alias, String direccion,
            int codigo) {
        this.cedula = cedula;
        this.nombres = nombres;
        Apellidos = apellidos;
        this.telefono = telefono;
        this.alias = alias;
        this.direccion = direccion;
        this.codigo = codigo;
    }



    public void presentarDatosFiliatorios()
    {
        System.out.printf("%s\n", "-------------CONSULTA DE CASOS-------------");
        System.out.printf("Detective: %s \t Cedula: %s \n", this.codigo, this.cedula);
        System.out.printf("Nombres: %s \t Apellidos: %s \n", this.nombres, this.Apellidos);
        System.out.printf("Alias: %s \t Telefono: %s \n", this.alias, this.telefono);
        System.out.printf("Direccion: %s \n", this.direccion);
    }
    
}
