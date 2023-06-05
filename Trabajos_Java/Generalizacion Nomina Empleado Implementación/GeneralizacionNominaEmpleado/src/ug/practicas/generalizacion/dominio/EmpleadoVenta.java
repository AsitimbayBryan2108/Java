package ug.practicas.generalizacion.dominio;


public class EmpleadoVenta extends Empleado implements IBonificacion 
{


    protected final static double PORCENTAJE_COMISION_VENTA = 0.08;
    protected final static double SALRIO_MINIMO = 420.00;

    protected double montoVentas;
    protected double montoComisionVenta;


    public EmpleadoVenta(int codigo, String cedula, String nombres, boolean seguro, double montoVenta) 
    {
        super(codigo, cedula, nombres, seguro);
        this.montoVentas = montoVenta;
    }
    
    private double calcularMontoComisionEnVenta(double totalVentas, double porcentajeComision)
    {
        montoComisionVenta = totalVentas * porcentajeComision;
        return montoComisionVenta;
    }
    
    public double calcularBonificacion() 
    {
        return SALRIO_MINIMO * PORCENTAJE_BONIFICACION;
    }
    
    protected double calularSalarioNeto() 
    {
        super.montoSalarioNeto = SALRIO_MINIMO - super.montoAportacion + montoComisionVenta + calcularBonificacion();
        return montoSalarioNeto;
    }
    
    public void presentarRol()
    {
        super.presentarRol();
        System.out.printf("\t%s\n", "---------- Datos Salario -----------");
        System.out.printf("Salario Basico: $ %.2f \t\t Bonificacion: $ %.2f\n", SALRIO_MINIMO, calcularBonificacion());
        System.out.printf("Monto Aportacion IEES: $ %.2f\n", calcularMontoAportacionSeguro(SALRIO_MINIMO, PORCENTAJE_APORTACION_SEGURO) );
        System.out.printf("Total Ventas: $ %.2f \t\t Porc. Comision: %.2f \n", this.montoVentas, PORCENTAJE_COMISION_VENTA);
        System.out.printf("Monto Comision: $ %.2f\n", calcularMontoComisionEnVenta(montoVentas, PORCENTAJE_COMISION_VENTA));
        System.out.printf("\t%s\n", "-----------------------------------");
        System.out.printf("Neto a Recibir: $ %.2f\n\n", this.calularSalarioNeto());
    }
}
