package Testeo;
// Crear la clase pruebaCuenta que realice lo siguiente:
// 1. Ingresar por teclado la cédula y el titular de la cuenta.
// 2. Crea 2 objetos de la clase Cuenta, el primer objeto obtendrá la cédula y el titular pedido por teclado
// menos la cantidad y el segundo objeto por defecto, para este último utilizar los métodos set para
// darle a los atributos un valor.
// 3. Para cada objeto, deberá invocar a los métodos ingresar y retirar, posterior a la llamada mostrar
// la cantidad.

import Ejercicios.Ejercicio4;

public class Test4 
{
    public static void main(String[] args) {
         
        Ejercicio4 cuenta = new Ejercicio4("Bryan Asitimbay",968252615,500);
        Ejercicio4 cuenta2 = new Ejercicio4("Daniel Rivadeneira",995848222, 600);
         

        cuenta.ingresar(500);
        cuenta.retirar(500);
        
        cuenta2.ingresar(400);
        cuenta2.retirar(100);
        
         

        System.out.println(cuenta); 
        System.out.println(cuenta2); 
         
    }
    
}
