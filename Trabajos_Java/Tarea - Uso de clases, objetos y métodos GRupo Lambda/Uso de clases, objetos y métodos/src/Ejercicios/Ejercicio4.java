package Ejercicios;
// Implementar la clase Cuenta que tendrá los siguientes atributos: cédula, titular y cantidad (puede tener
// decimales).
// La cédula y el titular será obligatorio y la cantidad es opcional. Se crearán dos constructores: un
// constructor por defecto y un constructor con la cédula, el titular y cantidad con valor por defecto.
// Crear los métodos get() y set() necesarios para poder acceder y modificar todos los atributos.
public class Ejercicio4 
{
    private String titular;
    private double cantidad;
    private int cedula;
 


    public String getTitular() 
    {
        return titular;
    }
 
    public void setTitular(String titular) 
    {
        this.titular = titular;
    }
 
    public double getCantidad() 
    {
        return cantidad;
    }
 
    public void setCantidad(double cantidad) 
    {

        this.cantidad = cantidad;
    }

    public int getCedula() 
    {
        return cedula;
    }

    public void setCedula(int cedula) 
    {
        this.cedula = cedula;
    }

    
 
    public Ejercicio4(String titular) 
    {
        this(titular,0,0); 
    }
 
    public Ejercicio4(String titular,int cedula, double cantidad) 
    {
        this.titular = titular;
        this.cedula = cedula;
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    public void ingresar(double cantidad) 
    {
        if(cantidad > 0){
            this.cantidad += cantidad;   
        }
    }
 
    public void retirar(double cantidad) 
    {
        if (this.cantidad - cantidad < 0) 
        {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    public String toString() 
    {
        return "El titular " + titular + " \nSu cedula es: "+cedula+"\nTiene " + cantidad + " dolares en la cuenta\n";
    }

    

}
