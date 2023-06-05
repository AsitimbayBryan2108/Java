package practicascuentas;

import java.time.LocalDate;

public class Cuenta {
    
    //! atributo de clase
   static final double SALDO_MINIMO = 60.00;

   //! atributos de instancia
   private int numero;
   private LocalDate fechaApertura;
   private double saldo;  
   private boolean estaAperturada = false; 
   
   //* Referecia a entidad Cliente*/
   private Cliente titular;
   private Banco banco;

   //todo Métodos de Acceso

   public void setBanco(Banco banco) 
   {
    this.banco = banco;
   }
   
   public void setTitular(Cliente titular) 
   {
      this.titular = titular;
   }

   //todo Metodos de negocio - comportamiento

   

    public void apertura(double monto)
   {
      if (monto >= SALDO_MINIMO)
      {
         //! Genera numero cuenta de forma aleatoria
         this.numero = ((int)Math.random() * 1000) + 1;
         this.fechaApertura = LocalDate.now();
         this.saldo = monto;
         this.estaAperturada = true;

         System.out.printf("Cuenta Aperturada N°: %08d saldo: $%.2f \n", numero, saldo);
      }
      else
         System.out.printf("el monto: $%.2f es inferior al Saldo Minimo: $%.2f \n",
                           monto, SALDO_MINIMO);
   }
   
    public void deposito(double monto)
   {
      if(this.estaAperturada)
      {
         this.saldo = saldo + monto;
         System.out.printf("<<depósito>> monto: $%.2f saldo actual: $%.2f \n", monto, saldo);
      }
      else
         System.out.print("<<Alerta>>  La cuenta no ha sido aperturada !!! \n");
   }

    public void retiro(double monto){
        if (this.estaAperturada)
        {
            this.saldo = saldo - monto;
            System.out.printf("\n\t \t <<Retiro>>\nMonto: $ %.2f Saldo actual: $%.2f", monto, saldo);
        }
        else
        {
            System.out.print("La cuenta no esta activa");
        }
    }

    public void consultaSaldo()
    {
        System.out.println("\n ====================================================");

        //* Navegabilidad entidad banco -- obtener nombre 
        System.out.printf("\t\t %s  \n",banco.getNombre());
        System.out.println("\t            CONSULTA DE SALDO");
        System.out.print("\n ====================================================\n");


        //*Navegabilidad a entidad cliente -- traer los nombres del cliente de la cuenta
        System.out.printf("Numero de Cuenta %08d\n", numero);
        System.out.printf("Cliente: %s \tCodigo: %s \n", titular.getNombres(),titular.getCodigo());
        System.out.printf("Fecha Apertura %s \tSaldo: %.2f\n",fechaApertura,saldo);

        //*Datos propios de la cuenta
        System.out.printf("Saldo actual: %.2f", saldo);
        System.out.print("\n ====================================================");
    }





}