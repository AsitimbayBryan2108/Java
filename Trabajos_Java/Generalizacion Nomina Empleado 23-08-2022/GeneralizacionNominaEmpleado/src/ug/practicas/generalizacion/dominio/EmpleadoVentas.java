package ug.practicas.generalizacion.dominio;

public class EmpleadoVentas extends Empleado implements IBonificacion
{

    protected final static double PORCENTAJE_COMISION_VENTA=0.08;
    protected final static double SALARIO_MINIMO=420.00;

    protected double montoVenta;
    protected double montoComisionVenta;

    public EmpleadoVentas(int codigo, String cedula, String nombres, double montoVenta) {
        super(codigo, cedula, nombres);
        this.montoVenta=montoVenta;

    }

    private double calcularMontoComisionEnVenta(double totaldeVentas, double porcentajeComision)

    {
        montoComisionVenta=totaldeVentas*porcentajeComision;
        return montoComisionVenta;

    }
   
    protected double calcularSalarioNeto() 

    {
        //! Salario Neto -->SALARIO_MINIMO - super.montoAportacion+ montoComisionVenta
        super.montoSalarioNeto=SALARIO_MINIMO-super.montoAportacion+this.montoComisionVenta;
        return montoSalarioNeto;
    }
  
    public void presentarDatosFiliatorios() {

        super.presentarDatosFiliatorios();
        System.out.printf("\t%s\n","----------Datos Salario-------------");
        System.out.printf("Salario basico: %.2f\n",SALARIO_MINIMO);
        System.out.printf("Monto Aportacion IESS: %.2f\n",super.calcularMontoAportacionSeguro(SALARIO_MINIMO,PORCENTAJE_APORTACION_SEGURO));
        System.out.printf("total de ventas: $ %.2f\tPorc.Comision: %.2f\n",this.montoVenta,PORCENTAJE_COMISION_VENTA);
        System.out.printf("Monto comision: %.2f\n",calcularMontoComisionEnVenta(montoVenta, PORCENTAJE_COMISION_VENTA));
        System.out.printf("\t%s\n","------------------------------------");
        System.out.printf("Salario Neto: %.2f\n",this.calcularSalarioNeto());
    }

    public double calcularBonificacion() 
    {
        return SALARIO_MINIMO*PORCENTAJE_BONIFICACION;
    }

    
    
}
