package fundamentos.pruebas;

public class Vehiculo 
{
        //! atributos de clase 
        public static final int VELOCIDAD_MAXIMA = 160;

        //! Requerimiento - colores especificos Blanco, Negro, Vino

        final String COLOR_BLANCO = "BLANCO";
        final String COLOR_NEGRO = "NEGRO";
        final String COLOR_VINO = "VINO";
        //*Se puede hacer uso de enumeraciones */


        //! atributos de instancia
        public String marca;
        public String color;
        public int anioFabricacion;

        public Color miColor = Color.VINO;
    
}
