package ug.practicas.generalizacion.dominio;

public abstract class Empleado {
    
    protected final static double PORCENTAJE_APORTACION_SEGURO = 0.0935;

    protected int codigo;
    protected double montoAportacion, montoSalarioNeto;
    protected String cedula, nombres, apellidos;
    protected boolean seguro;

    public Empleado(int codigo, String cedula, String nombres, boolean seguro) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombres = nombres;
        this.seguro = seguro;
    }

    public void presentarRol(){
        System.out.printf("\t\t%s\n", "Datos del Empleado");
        verificarEnrolamiento(seguro);
        System.out.printf("Codigo: %s\n", this.codigo);
        System.out.printf("Cedula: %s\t\t Nombre: %s\n", this.cedula, this.nombres);
    }

    protected abstract double calularSalarioNeto();

    protected double calcularMontoAportacionSeguro(double salarioBase, double porcentajeAportacio) {
        montoAportacion = salarioBase * porcentajeAportacio;
        return montoAportacion;
    }

    protected void verificarEnrolamiento(boolean seguro){

        if (seguro){

            System.out.println("El empleado se encuentra enrolado");
        }
        else{

            System.out.println("El empleado no se encuentra enrolado");
        }


    }
}
