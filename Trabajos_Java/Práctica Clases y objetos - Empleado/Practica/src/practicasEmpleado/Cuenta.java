package practicasEmpleado;
public class Cuenta 

// La empresa Solutions S.A. requiere una aplicación para gestionar la información filiatoria y el sueldo
// de sus empleados. De cada empleado se necesita la siguiente información: código, cédula, nombres,
// apellidos y salario. Los empleados están enrolados, es decir que perciben un salario fijo mensual que
// es el salario mínimo vital, y se les descuenta la aportación al seguro (9.35% IESS). Adicional a su salario
// fijo recibe una comisión por las ventas que realice en el mes, el porcentaje de comisión de ventas es
// del 10 %. Realizar los métodos necesarios para implementar las siguientes operaciones:
// 1. Calcular el valor de la aportación del seguro.
// 2. Calcular el valor de la comisión en venta.
// 3. Calcular el salario neto a recibir del empleado.
// 4. Consultar el rol del empleado, debe presentar los datos filiatorios y el desglose del salario del
// empleado con el valor de la aportación del seguro de acuerdo a la siguiente salida:

{
    //static final double SUELDO= 400.00;


   private int codigo;
   private double aporteSeguro;
   private double comision; 
   private float ventas;
   private double sueldo;
   private double porcentajeComision;
   private double salarioNeto;
   
 
   private Empleado Empleados;
   private Empresa Empresas;


   public void setEmpresas(Empresa Empresas) 
   {
    this.Empresas = Empresas;
   }
   
   public void setEmpleados(Empleado Empleados) 
   {
      this.Empleados = Empleados;
   }


    public void aportacionSeguro(int SUELDO)
    {
         this.codigo = ((int)Math.random()*100);
         this.aporteSeguro=SUELDO*0.0935;
         this.sueldo=SUELDO; 
           
         
    }
   
    public void comisionVenta(int VENTAS)
    {
        this.porcentajeComision=10;
        this.comision=VENTAS*porcentajeComision/100;
        this.ventas=VENTAS;
    
    }


    public void salarioTotal(double sueldo)
    {
        this.salarioNeto=sueldo-aporteSeguro+comision; 
        
    }

    public void consultaRol()
    {
        System.out.println("\n ====================================================");

        System.out.printf("\t\t %s  \n",Empresas.getNombre());
        System.out.println("\t        CONSULTA DE ROL");
        System.out.print("\n ====================================================\n");


        System.out.printf("Codigo: %08d \tCedula: %s\n", codigo,Empleados.getcedula());
        System.out.printf("Nombre: %s \nApellido: %s \n", Empleados.getnombres(),Empleados.getapellido());
        System.out.printf("Salario:%s      \tAporte Seguro: %.2f\n",sueldo,aporteSeguro);
        System.out.printf("Ventas:%s\n",ventas);
        System.out.printf("Comision:%.2f    \tPorc.Comision:%s\n",comision,porcentajeComision);
        System.out.printf("Salario neto a Recibir:%.2f",salarioNeto);
        System.out.print("\n ====================================================");
    }
    
}
