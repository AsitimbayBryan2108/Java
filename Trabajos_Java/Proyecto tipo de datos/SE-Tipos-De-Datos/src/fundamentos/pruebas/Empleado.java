package fundamentos.pruebas;

import java.time.LocalDate;
import java.util.Scanner;

public class Empleado {

    private LocalDate fechaIngreso;
    public String cedula;
    private String nombres;
    private double salario;
    static Scanner ingreso;
    public static void main(String[] args) {
        ingreso = new Scanner(System.in);
        Empleado e = new Empleado(); 
        Empleado d;

        System.out.print("Ingrese la cedula: ");
        e.cedula = ingreso.nextLine();

        System.out.print("Ingrese los nombres: ");
        e.nombres = ingreso.nextLine();

        System.out.print("Ingrese el salario: ");
        e.salario = Float.parseFloat(ingreso.nextLine());
    
        e.fechaIngreso = LocalDate.now();

        System.out.println("Cedula: " + e.cedula);
        System.out.println("Nombres: " + e.nombres);
        System.out.println("Fecha: " + e.fechaIngreso);
        System.out.println("Salario: " + e.salario);

    }
    
}
