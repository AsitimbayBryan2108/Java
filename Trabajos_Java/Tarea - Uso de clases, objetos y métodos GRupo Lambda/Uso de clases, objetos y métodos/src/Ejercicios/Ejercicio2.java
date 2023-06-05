package Ejercicios;
// Crear una clase Auto, a través de la cual se pueda conocer el color del auto, la marca, el modelo, el
// número de chasis, el número de puertas y la matrícula. Crear el constructor del auto, así como los
// métodos get() y set() que considere necesarios. Crear la clase pruebaAuto que instancie varios autos,
// cambiándole el color, la marca, modelo, chasis, número de puertas y matricula a lo largo de la vida a
// algunos de ellos y mostrándolo por pantalla.
public class Ejercicio2 
{
    private String color;
    private String marca;
    private String modelo;
    private String numeroChasis;
    private int numeroPuertas;
    private String matricula;

    public String getColor()
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }
    
    public String getMarca() 
    {
        return marca;
    }


    public void setMarca(String marca) 
    {
        this.marca = marca;
    }


    public String getModelo() 
    {
        return modelo;
    }


    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }


    public String getnumeroChasis()
    {
        return numeroChasis;
    }


    public void setnChasis(String numeroChasis) 
    {
        this.numeroChasis = numeroChasis;
    }


    public int getnumeroPuertas() 
    {
        return numeroPuertas;
    }


    public void setnPuertas(int numeroPuertas) 
    {
        this.numeroPuertas = numeroPuertas;
    }


    public String getMatricula() 
    {
        return matricula;
    }


    public void setMatricula(String matricula) 
    {
        this.matricula = matricula;
    }


    public void mostrarAuto()
    {
        getMarca();
        System.out.printf("La marca del auto es: %s \n",marca);

        getModelo();
        System.out.printf("El modelo del auto es: %s \n",modelo);

        getColor();
        System.out.printf("El color del auto es: %s \n",color);

        getMatricula();
        System.out.printf("La matricula del auto es: %s \n",matricula);

        getnumeroChasis();
        System.out.printf("El numero del chasis del auto es: %s \n",numeroChasis);

        getnumeroPuertas();
        System.out.printf("El numero de puertas del auto es: %s \n",numeroPuertas);
        System.out.println("");
    }
    
    public void cambiarauto(String color, String marca1, String modelo1, String Numerochasis, int Numeropuertas, String matriculaA)
    {

        System.out.printf("Se cambio los datos de este auto\n");
        System.out.printf("La marca del auto es: %s \n",marca1);
        System.out.printf("El modelo del auto es: %s \n",modelo1);
        System.out.printf("El color del auto es: %s \n",color);
        System.out.printf("La matricula del auto es: %s \n",matriculaA);
        System.out.printf("El numero del chasis del auto es: %s \n",Numerochasis);
        System.out.printf("El numero de puertas del auto es: %s \n",Numeropuertas);
        System.out.println("");
    }
    
}
