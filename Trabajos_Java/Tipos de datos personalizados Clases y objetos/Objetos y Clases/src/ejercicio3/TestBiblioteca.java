package ejercicio3;

public class TestBiblioteca 
{
    static final String BIBLIOTECA = "BIBLIOTECA UNIVERSITARIA";
    static final String LINEA = "===========================================";

    public static void main(String[] args) {

        Biblioteca Libro1 = new Biblioteca();

        System.out.println(LINEA);
        System.out.println("\t " + BIBLIOTECA);
        System.out.println(LINEA);

        System.out.println("CODIGO: " + Libro1.codigo);
        System.out.println("TITULO: " + Libro1.titulo);
        System.out.println("AUTOR: " + Libro1.autor);

        System.out.println(LINEA);

        System.out.println("ISBN: " + Libro1.isbn + "\t AÑO PUBLICADO: " + Libro1.anioPublicacion);
        System.out.println("# EJEMPLARES: " + Libro1.ejemplares);

        System.out.println(LINEA);

    }
    
}
