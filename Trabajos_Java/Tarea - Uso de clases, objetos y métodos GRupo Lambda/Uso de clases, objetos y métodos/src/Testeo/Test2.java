package Testeo;

import Ejercicios.Ejercicio2;

public class Test2 
{
    public static void main(String[] args) 
    {
        Ejercicio2 auto = new Ejercicio2();
        auto.setColor("Verde");
        auto.setMarca("Chevrolet");
        auto.setMatricula("GLV - 499");
        auto.setModelo("Super Carry");
        auto.setnChasis("1244452H");
        auto.setnPuertas(5);
        auto.mostrarAuto();
        auto.cambiarauto("Blanco", "Chevrolet", "Captiva", "12442F", 5, "GIV - 1992");

        Ejercicio2 auto2 = new Ejercicio2();
        auto2.setColor("Negro");
        auto2.setMarca("Toyota");
        auto2.setMatricula("GTG - 1234");
        auto2.setModelo("Hilux");
        auto2.setnChasis("1233412K");
        auto2.setnPuertas(4); 
        auto2.mostrarAuto();
        auto2.cambiarauto("Rojo", "Toyota", "Hilux", "1241244T", 2, "GHN - 2108");


        
    }
    
}
