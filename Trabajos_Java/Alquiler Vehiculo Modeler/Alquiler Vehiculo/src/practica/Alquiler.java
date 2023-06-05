package practica;

import java.util.PrimitiveIterator;

public class Alquiler 
{
    private final String LINEA ="===================================================";
    //#region Atributos de clase
    //!Atributos de clase
    private static final double IMPUESTO_VALOR_AGREGADO = 0.12;

    private static final double RECORRIDO_150 =150.00;
    private static final double RECORRIDO_500 =500.00;

    private static final double COSTO_RECORRIDO_BASE =25.00;
    private static final double COSTO_RECORRIDO_150_500 =5.00;
    private static final double COSTO_RECORRIDO_HAS_500 =3.50;;
    //#endregion

    //!Variables de instancias
    private double numero;
    private double recorrido;
    private double subtotal;
    private double montoiva;
    private double total;
 
    
    //!Enlaces con las otras entidades
    private Empresa miEmpresa;
    private Cliente miCliente;
    private Vehiculo miVehiculo;


    public Alquiler(double numero, Empresa miEmpresa, Cliente miCliente, Vehiculo miVehiculo) 
    {
        this.numero = numero;
        this.miEmpresa = miEmpresa;
        this.miCliente = miCliente;
        this.miVehiculo = miVehiculo;
    }


    public Alquiler(double numero, double recorrido, Empresa miEmpresa, Cliente miCliente, Vehiculo miVehiculo) {
        this.numero = numero;
        this.recorrido = recorrido;
        this.miEmpresa = miEmpresa;
        this.miCliente = miCliente;
        this.miVehiculo = miVehiculo;
    }







    public void presentarDatos()
    {
        System.out.printf("%s\n",LINEA);
        miEmpresa.presentacionDatos();
        System.out.printf("%s\n",LINEA);
        miCliente.presentarDatos();
        System.out.printf("%s\n",LINEA);
        miVehiculo.presentarDatos();

        System.out.printf("Recorrido: %.2f\n",this.recorrido);
        System.out.printf("Subtotal: %.2f\n",this.calcularSubtotal(recorrido));

    }

    
    //completar presentar impuestoValorAgregado
    //llamada para realizar calculo de subtotal
    //Calcular monto Iva
    //Calcular total
    private double calcularSubtotal(double kilometrajeActual)
    {
        //? Reglas de Negocio
        if(kilometrajeActual<=RECORRIDO_150)
        subtotal=COSTO_RECORRIDO_BASE;
        else if(kilometrajeActual<RECORRIDO_500)
        subtotal=COSTO_RECORRIDO_BASE+
                  (kilometrajeActual-RECORRIDO_150)*COSTO_RECORRIDO_150_500;
        else
            subtotal=COSTO_RECORRIDO_BASE+
                     (RECORRIDO_500-RECORRIDO_150)*COSTO_RECORRIDO_150_500+
                     (kilometrajeActual-RECORRIDO_500)*COSTO_RECORRIDO_HAS_500;
            
        



        return subtotal;
    }
}




