package examen.dominio;


public class Serie {

    private int codigo;
    private String nombre;
    private String temporada;
    private double totalCapitulos;

    public Serie() {
    }

    public Serie(int codigo, String nombre, String temporada, double totalCapitulos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.temporada = temporada;
        this.totalCapitulos = totalCapitulos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((temporada == null) ? 0 : temporada.hashCode());
        long temp;
        temp = Double.doubleToLongBits(totalCapitulos);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Serie other = (Serie) obj;
        if (codigo != other.codigo)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (temporada == null) {
            if (other.temporada != null)
                return false;
        } else if (!temporada.equals(other.temporada))
            return false;
        if (Double.doubleToLongBits(totalCapitulos) != Double.doubleToLongBits(other.totalCapitulos))
            return false;
        return true;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public double getTotalCapitulos() {
        return totalCapitulos;
    }

    public void setTotalCapitulos(double totalCapitulos) {
        this.totalCapitulos = totalCapitulos;
    }

    @Override
    public String toString() {
        return "Serie [codigo=" + codigo + ", nombre=" + nombre + ", temporada=" + temporada + ", totalCapitulos="
                + totalCapitulos + "]";
    }

    


    

    
    
    
}
