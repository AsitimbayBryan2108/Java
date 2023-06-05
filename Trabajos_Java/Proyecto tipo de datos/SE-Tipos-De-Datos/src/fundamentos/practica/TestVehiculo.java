package fundamentos.practica;
import fundamentos.pruebas.Vehiculo;

public class TestVehiculo 
{
        public static void main(String[] args) {
    
            Vehiculo v1 = new Vehiculo();
            Vehiculo v2 = new Vehiculo();
    
            //! ingresar datos al objeto
            v1.marca = "TOYOTA";
            v1.color = "negro";
            v1.anioFabricacion = 2015;
    
            System.out.println(Vehiculo.VELOCIDAD_MAXIMA);
    
        }
    
}
