package Cuentas;

public class Cuenta {
	private double saldo=0;
	private double deposito = 10;
	private double retiro = 0;
	
	
	public double getSaldo() {
		return saldo;
	}
	
	
	public double getDeposito() {
		return deposito;
		
	}
	
	public double getRetiro() {
		return retiro;
		
	}
			
	public void deposito1(){
		if(deposito >=0 )
	    saldo++;
	    deposito++;	
	}

	public void retiro1(){
		if(retiro >=1 )
	    saldo--;
	    retiro++;	
	}

}
