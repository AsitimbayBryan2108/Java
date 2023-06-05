package examen.dominio;



public class Cliente {

    private String cedula;
    private String nombres;
    private int edad;
   

    public Cliente() {
    }



    public Cliente(String cedula, String nombres, int edad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.edad = edad;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
        result = prime * result + edad;
        result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (cedula == null) {
            if (other.cedula != null)
                return false;
        } else if (!cedula.equals(other.cedula))
            return false;
        if (edad != other.edad)
            return false;
        if (nombres == null) {
            if (other.nombres != null)
                return false;
        } else if (!nombres.equals(other.nombres))
            return false;
        return true;
    }



    public String getCedula() {
        return cedula;
    }



    public void setCedula(String cedula) {
        this.cedula = cedula;
    }



    public String getNombres() {
        return nombres;
    }



    public void setNombres(String nombres) {
        this.nombres = nombres;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    @Override
    public String toString() {
        return "Cliente [cedula=" + cedula + ", edad=" + edad + ", nombres=" + nombres + "]";
    }


   

    

    
}
