package Cuentas;

public class Main {
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta();
		
		cuenta1.deposito1();
		cuenta1.deposito1();
		cuenta1.deposito1();
		cuenta1.deposito1();
		cuenta1.deposito1();
		cuenta1.retiro1();
		cuenta1.retiro1();
		cuenta1.retiro1();
		
		
		
        System.out.println("saldo cuenta:" + cuenta1.getSaldo());
        System.out.println("saldo depositado:" + cuenta1.getDeposito());
        System.out.println("saldo retirado:" + cuenta1.getRetiro());
	}
	

}
