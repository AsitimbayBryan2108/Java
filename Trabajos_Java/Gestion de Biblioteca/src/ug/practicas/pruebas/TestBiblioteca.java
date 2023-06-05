package ug.practicas.pruebas;
import java.util.List;
import java.util.Scanner;
import ug.practicas.dominio.ClienteOcasional;
import ug.practicas.dominio.Documento;
import ug.practicas.dominio.Socio;

public class TestBiblioteca {

    private List<Documento>listaDocumenotos;

    public static void main(String[] args) 
    {

        ClienteOcasional ocasional = new ClienteOcasional("0952164358", "Bryan Asitimbay",
         "0968252615", "asitimbaybryan@gmail.com", "avenida 25 de julio",false);
        Socio socio = new Socio("0952164358", "Bryan Asitimbay", "0968252615",
        "asitimbaybryan@gmail.com", "avenida 25 de julio", true);

        socio.agregarLibro("A2A2","La odisea",2021);
        socio.agregarRevista("B1B1","La Roja");

        ocasional.agregarLibro("C3C3","El sistemas operativo",2011);
        ocasional.agregarRevista("D4D4","En contacto");

    

       ocasional.mostrarDatos();
       socio.mostrarDatos();


    }
}
