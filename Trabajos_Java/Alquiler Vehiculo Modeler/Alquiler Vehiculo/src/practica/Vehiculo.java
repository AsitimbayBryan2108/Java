package practica;

public class Vehiculo 
{
    private int codigo;
    private String marca;
    private int anioFabricacion;
    private String modelo;
    private int numeroPasajeros;
    private String placa;
    
    //#region
    public Vehiculo() 
    {
    }
    public Vehiculo(int codigo, String marca, String modelo) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
    }


    public Vehiculo(int codigo, String marca, int anioFabricacion, String modelo, int numeroPasajeros, String placa) {
        this.codigo = codigo;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.modelo = modelo;
        this.numeroPasajeros = numeroPasajeros;
        this.placa = placa;
    }
    //#endregion

    public void presentarDatos()
    {
        System.out.printf("Codigo: %d \n",this.codigo);
        System.out.printf("Marca:%s \t\t Modelo:%s\n",this.marca,modelo);

    }
    
    
    
}
