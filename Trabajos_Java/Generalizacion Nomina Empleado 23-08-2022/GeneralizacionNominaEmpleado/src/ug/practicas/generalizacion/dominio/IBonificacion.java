package ug.practicas.generalizacion.dominio;

public interface IBonificacion
{
    static final double PORCENTAJE_BONIFICACION=0.05;

    public abstract double calcularBonificacion();
    
}
