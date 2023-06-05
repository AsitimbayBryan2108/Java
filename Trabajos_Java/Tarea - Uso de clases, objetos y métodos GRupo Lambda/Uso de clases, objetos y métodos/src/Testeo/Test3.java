package Testeo;

import Ejercicios.Ejercicio3;

public class Test3 
{
    public static void main(String[] args) 
    {
        Ejercicio3 Tiempo1 = new Ejercicio3(20, 55, 10);
        Tiempo1.mostrarHoraMinuto();
        Tiempo1.mostrarSoloHora();
        Tiempo1.mostrarTodo();
        Tiempo1.aumentarTiempo(2, 4, 30);
        Tiempo1.disminuirTiempo(12, 50, 4);

    }  
}
