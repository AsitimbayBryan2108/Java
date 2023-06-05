package Testeo;

import java.util.Scanner;

import Ejercicios.Ejercicio5;

// Crear la clase pruebaPersona que realice lo siguiente:
// 1. Ingresar por teclado el nombre, la edad, sexo, peso y altura.
// 2. Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por
// teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por
// defecto, para este último utiliza los métodos set para darle a los atributos un valor.
// 3. Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su
// peso ideal con un mensaje.
// 4. Indicar para cada objeto si es mayor de edad.
// 5. Por último, mostrar la información de cada objeto.
public class Test5 
{
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
                
            System.out.printf("Introduce el nombre:");
            String nombre = sc.next();
         
            System.out.printf("Introduce la edad:");
            int edad = sc.nextInt();
         
            System.out.println("Masculino[M] - Femenino[F]");
            System.out.printf("Introduce el sexo:");
            char sexo = sc.next().charAt(0);
            
                System.out.printf("Introduce el peso en Kg:");
                double peso = sc.nextDouble();
         
                System.out.printf("Introduce la altura");
                double altura = sc.nextDouble();
        
         
                Ejercicio5 persona1 = new Ejercicio5();
                Ejercicio5 persona2 = new Ejercicio5(nombre, edad, sexo);
                Ejercicio5 persona3 = new Ejercicio5(nombre, edad, sexo, peso, altura);
         
    
                persona1.setNombre("Laura");
                persona1.setEdad(30);
                persona1.setSexo('M');
                persona1.setPeso(60);
                persona1.setAltura(1.60);
         
                persona2.setPeso(90.5);
                persona2.setAltura(1.80);
        
                System.out.println("Persona1");
                MuestraMensajePeso(persona1);
                MuestraMayorDeEdad(persona1);
                System.out.println(persona1.toString());
         
                System.out.println("Persona2");
                MuestraMensajePeso(persona2);
                MuestraMayorDeEdad(persona2);
                System.out.println(persona2.toString());
         
                System.out.println("Persona3");
                MuestraMensajePeso(persona3);
                MuestraMayorDeEdad(persona3);
                System.out.println(persona3.toString());
        
                
                sc.close();
                    
            }
          
         
            public static void MuestraMensajePeso(Ejercicio5 p) {
                int IMC = p.calcularIMC();
                switch (IMC) {
                    case Ejercicio5.PESO_IDEAL:
                        System.out.println("La persona se encuentra en su peso ideal");
                        break;
                    case Ejercicio5.INFRAPESO:
                        System.out.println("La persona se encuentra por debajo de su peso ideal");
                        break;
                    case Ejercicio5.SOBREPESO:
                        System.out.println("La persona se encuentra por encima de su peso ideal");
                        break;
                }
            }
         
            public static void MuestraMayorDeEdad(Ejercicio5 p) {
         
                if (p.esMayorDeEdad()) {
                    System.out.println("La persona si es mayor de edad");
                } else {
                    System.out.println("La persona no es mayor de edad");
                }
            }
    
}
