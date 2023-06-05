package ug.practicas.generalizacion.dominio;

public class EmpleadoAdministrativo extends Empleado
{
    private double salario;

    public EmpleadoAdministrativo(int codigo, String cedula, String nombres, double salario)
    {
    //todo Se envoca al constructor de la clase base

        super(codigo, cedula, nombres);
        this.salario =salario;
    }

    protected double calcularSalarioNeto()
    {
        super.montoSalarioNeto=this.salario-super.calcularMontoAportacionSeguro(salario,PORCENTAJE_APORTACION_SEGURO);
        //-super.montoAportacion
        return montoSalarioNeto;
    }


    public void presentarDatosFiliatorios() 
    {
        super.presentarDatosFiliatorios();
        System.out.printf("\t%s\n","----------Datos Salario-------------");
        System.out.printf("Salario: %.2f\t\t Porc.Aportacion: %.4f\n",this.salario,PORCENTAJE_APORTACION_SEGURO);
        System.out.printf("Monto Aportacion:$ %.2f\n",super.calcularMontoAportacionSeguro(this.salario,PORCENTAJE_APORTACION_SEGURO));
        System.out.printf("\t%s\n","------------------------------------");
        
        System.out.printf("Salario Neto: %.2f",this.calcularSalarioNeto());
    }

    


    
    
}
