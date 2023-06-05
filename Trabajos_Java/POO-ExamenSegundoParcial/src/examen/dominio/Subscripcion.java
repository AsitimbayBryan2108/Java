package examen.dominio;

import java.time.LocalDate;

public class Subscripcion {

    private int numero;
    private LocalDate fecha;
    private double costo;
    private double descuento;
    private double total;


    public Subscripcion() {
    }


    public Subscripcion(int numero, LocalDate fecha, double costo, double descuento, double total) {
        this.numero = numero;
        this.fecha = fecha;
        this.costo = costo;
        this.descuento = descuento;
        this.total = total;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(costo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(descuento);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        result = prime * result + numero;
        temp = Double.doubleToLongBits(total);
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
        Subscripcion other = (Subscripcion) obj;
        if (Double.doubleToLongBits(costo) != Double.doubleToLongBits(other.costo))
            return false;
        if (Double.doubleToLongBits(descuento) != Double.doubleToLongBits(other.descuento))
            return false;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        if (numero != other.numero)
            return false;
        if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
            return false;
        return true;

    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public LocalDate getFecha() {
        return fecha;
    }


    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    public double getCosto() {
        return costo;
    }


    public void setCosto(double costo) {
        this.costo = costo;
    }


    public double getDescuento() {
        return descuento;
    }


    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }


    public double getTotal() {
        return total;
    }


    public void setTotal(double total) {
        this.total = total;
    }


    @Override
    public String toString() {
        return "Subscripcion [costo=" + costo + ", descuento=" + descuento + ", fecha=" + fecha + ", numero=" + numero
                + ", total=" + total + "]";
    }
    



    

    
    

    
}
