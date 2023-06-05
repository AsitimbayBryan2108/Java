package ug.practicas.dominio;

public class Libro extends Documento{
    protected int anioPublicacion;

    public Libro(String codigo, String titulo, int anioPublicacion) {
        super(codigo, titulo);
        this.anioPublicacion = anioPublicacion;
    }

    // public int getAnioPublicacion() {
    //     return anioPublicacion;
    // }

    // public void setAnioPublicacion(int anioPublicacion) {
    //     this.anioPublicacion = anioPublicacion;
    // }
    
    // public void mostrarLibro()
    // {
    //     super.mostrarDocumentos();
    //     System.out.println("Año de publicacion:"+anioPublicacion);

    // }

}
