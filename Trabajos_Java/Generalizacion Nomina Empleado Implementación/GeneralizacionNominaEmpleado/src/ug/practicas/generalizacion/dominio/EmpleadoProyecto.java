package ug.practicas.generalizacion.dominio;

public class EmpleadoProyecto extends Empleado implements IBonificacion
 {

    private final double SALARIO_POR_HORA = 15.00;
    private int horasTrabajadas; 
    private double montoProyecto;

    public EmpleadoProyecto(int codigo, String cedula, String nombres, boolean seguro, int horasTrabajadas) 
    {
        super(codigo, cedula, nombres, seguro);
        this.horasTrabajadas = horasTrabajadas;
    }

    private double calcularMontoProyecto(int horas, double precio)
    {
        montoProyecto = horas * precio;
        return montoProyecto;
    }

    public double calcularBonificacion() 
    {
        return montoProyecto * PORCENTAJE_BONIFICACION;
    }


    protected double calularSalarioNeto() 
    {
        super.montoSalarioNeto = montoProyecto + calcularBonificacion();
        return montoSalarioNeto;
    }
    
    public void presentarRol() 
    {
        super.presentarRol();
        System.out.printf("\t%s\n", "------------ Datos Salario -------------");
        System.out.printf("Salario por Hora: $ %.2f\n", SALARIO_POR_HORA);
        System.out.printf("Horas Trabajadas: %s \t\t Monto Proyectos: $ %.2f  \n", this.horasTrabajadas, calcularMontoProyecto(horasTrabajadas,SALARIO_POR_HORA));
        System.out.printf("Bonificacion: $ %.2f\n", calcularBonificacion());
        System.out.printf("\t%s\n", "----------------------------------");
        System.out.printf("Neto a Recibir: $ %.2f\n\n", this.calularSalarioNeto());
    }
}
