package Clases;

public class Monitor 
{
    //!Declar los atributos
    private String marca;
    private int tamanio;
    private String color;

    //!Metodos --->Metodos Acceso - Metodos de Negocio
    //*           Acceso escritura  -set
    //*           Acceso de lectura -get


    public void setMarca(String pMarca)
    {
        marca = pMarca;
    }

    public String getMarca()
    {
        return marca;
    }

    public int getTamanio() 
    {
        return tamanio;
    }

    public void settamanio(int tamanio) 
    {
        this.tamanio = tamanio;
    }

    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    @Override
    public String toString() 
    {
        return ("Monitor---> marca: "+this.marca+ " Color:" +this.color);
    }

    

    // @Override
    // public String toString()
    // {
    //     return("Monitor---> marca: "+marca+" "+color+" "+tamanio);

    // }

    

    
}






