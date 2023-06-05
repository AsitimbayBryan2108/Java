package Testeo;

import Ejercicios.Ejercicio1;

public class Test1 
{
    public static void main(String[] args) 
    {
        Ejercicio1 objeto1 = new Ejercicio1();

        objeto1.setAltura(10);
        objeto1.setBase(65);
        objeto1.areaPerimeto();
    

        Ejercicio1 objeto2 = new Ejercicio1();
        objeto2.setAltura(35);
        objeto2.setBase(90);
        objeto2.areaPerimeto();

        Ejercicio1 objeto3 = new Ejercicio1();
        objeto3.setAltura(30);
        objeto3.setBase(70);
        objeto3.areaPerimeto();


        
    }
    
}
