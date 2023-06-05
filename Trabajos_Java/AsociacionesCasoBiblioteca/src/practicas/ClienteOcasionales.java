package practicas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClienteOcasionales 
{


        private String cedula;
        private String nombres;
        private String direccion;
        private String correoElectronico;
        private String telefono;
        private int limiteLibros=2;
        private int duracionMaxima=15;
    
    
        public ClienteOcasionales(String cedula, String nombres, String direccion, String correoElectronico, String telefono)
        {
            this.cedula = cedula;
            this.nombres = nombres;
            this.direccion = direccion;
            this.correoElectronico = correoElectronico;
            this.telefono = telefono;
        }


        public ClienteOcasionales(int i, String string, Socios autor) {
        }


        public void agregarCapitulo(int i, String string, int j) {
        }
    
    

}
