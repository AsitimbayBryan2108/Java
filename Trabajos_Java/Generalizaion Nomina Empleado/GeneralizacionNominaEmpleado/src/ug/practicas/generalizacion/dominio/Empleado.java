package ug.practicas.generalizacion.dominio;

public abstract class Empleado 
{

    protected final static double PORCENTAJE_APORTACION_SEGURO=9.35/100;
    private int codigo;
    private String cedula;
    private String nombres;
    protected double montoAportacion;
    protected double montoSalarioNeto;


    public Empleado(int codigo, String cedula, String nombres) 
    {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombres = nombres;
    }

    public void presentarDatosFiliatorios()
    {
        System.out.printf("\t\t%s\n","Datos del Empleado");
        System.out.printf("Codigo:%d\n",this.codigo);
        System.out.printf("Cedula:%s\t Nombres:%s\n",this.cedula,this.nombres);
    }
    protected abstract double calcularSalarioNeto();  

    protected double calcularMontoAportacionSeguro(double salarioBase, double porcentajeAportacion)
    {
        montoAportacion=salarioBase*porcentajeAportacion;
        return montoAportacion;

    } 
    
}
