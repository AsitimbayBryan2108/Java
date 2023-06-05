package Ejercicios;
// Crear una clase Rectángulo, con atributos base y altura. Crear también el constructor de la clase, crear
// los métodos get() y set() necesarios para poder acceder y modificar todos los atributos. y los métodos
// para calcular el área y el perímetro. Crear la clase pruebaRectangulo que pruebe varios objetos
// rectángulos y muestre por pantalla sus áreas y perímetros.

public class Ejercicio1 
{
    private int base;
    private int altura;
    private int area;
    private int perimetro;


    public int getBase() 
    {
        return base;
    }


    public void setBase(int base)
    {
        this.base = base;
    }


    public int getAltura() 
    {
        return altura;
    }


    public void setAltura(int altura) 
    {
        this.altura = altura;
    }
    
    
    public void areaPerimeto()
    {
        getBase(); 
        getAltura();
        area = base * altura;
        perimetro = 2 * base  + 2 * altura;
        System.out.printf("La base del rectangulo es: %s y de altura: %s \nEl area es: %s \nEl Perimetro: %s\n",base,altura,area,perimetro);
        System.out.println("");
    }



    
}
