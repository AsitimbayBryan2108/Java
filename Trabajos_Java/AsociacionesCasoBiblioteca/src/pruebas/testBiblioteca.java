package pruebas;

import practicas.Socios;
import practicas.Biblioteca;
import practicas.ClienteOcasionales;

public class testBiblioteca 
{
    public static void main(String[] args)
    {
      Biblioteca biblioteca =new Biblioteca(1, "BIBLIOTE CENTRAL");
      Socios autor=new Socios(1, "Bryan Asitimbay", "Ecuatoriana");
      ClienteOcasionales pythonlibro=new ClienteOcasionales(12133, "Fundamentos", autor);

     pythonlibro.agregarCapitulo(1, "Introduccion", 48);
     pythonlibro.agregarCapitulo(2, "Empezando a programar", 64);
     pythonlibro.agregarCapitulo(3, "Elementos fundamentales", 75);
     pythonlibro.agregarCapitulo(4, "Programacion Fundamental", 98);

     biblioteca.agregarLibro(pythonlibro);
    }
    
}
