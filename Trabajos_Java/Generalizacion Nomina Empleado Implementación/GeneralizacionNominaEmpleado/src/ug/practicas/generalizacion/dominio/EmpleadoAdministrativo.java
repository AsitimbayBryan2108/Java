package ug.practicas.generalizacion.dominio;

public class EmpleadoAdministrativo extends Empleado 
{  
    private double salario;

    public EmpleadoAdministrativo(int codigo, String cedula, String nombres, boolean seguro, double salario) 
    {
        super(codigo, cedula, nombres, seguro);
        this.salario = salario;
    }

    protected double calularSalarioNeto() 
    {
        super.montoSalarioNeto = this.salario - super.montoAportacion;
        return montoSalarioNeto;
    }

    public void presentarRol() 
    {
        super.presentarRol();
        System.out.printf("\t%s\n", "------------ Datos Salario -------------");
        System.out.printf("Salario: $ %.2f \t\t Porc. Aportacion: %.4f\n", salario , PORCENTAJE_APORTACION_SEGURO);
        System.out.printf("Monto Aportacion: %.2f\n", calcularMontoAportacionSeguro(salario, PORCENTAJE_APORTACION_SEGURO));
        System.out.printf("\t%s\n", "---------------------------------");
        System.out.printf("Neto a Recibir: $ %.2f\n\n", this.calularSalarioNeto());
    }
}
