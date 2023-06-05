package Ejercicios;
// Implementar la clase Persona que tenga lo siguiente:
// Los atributos son: nombre, edad, sexo (H hombre, M mujer), peso y altura. No se quiere acceder
// directamente a ellos. Crear los métodos set de cada atributo.
// Por defecto, todos los atributos serán valores por defecto según su tipo (0 números, cadena vacía
// para String, etc.). Sexo será H: hombre por defecto, usar una constante para ello.
// Se implantarán varios constructores:
//  Un constructor por defecto.
//  Un constructor con el nombre, edad y sexo, el resto por defecto.
//  Un constructor con todos los atributos como parámetro.

public class Ejercicio5 
{
    private final static char SEXO_DEF = 'M';
    public static final int INFRAPESO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;
 
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
 

    public Ejercicio5() 
    {
        this("", 0, SEXO_DEF, 0, 0);
    }
 

    public Ejercicio5(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }
 

    public Ejercicio5(String nombre, int edad, char sexo, double peso, double altura) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        comprobarSexo();
    }
 

    private void comprobarSexo() {
        if (sexo != 'M' && sexo != 'F') {
            this.sexo = SEXO_DEF;
        }
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
 
    public void setPeso(double peso) {
        this.peso = peso;
    }
 
    public void setAltura(double altura) {
        this.altura = altura;
    }
 
    public int calcularIMC() {
        //Calculamos el peso de la persona
        double pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_IDEAL;
        } else if (pesoActual < 20) {
            return INFRAPESO;
        } else {
            return SOBREPESO;
        }
    }
 
    
    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    public String toString() {
        String sexo;
        if (this.sexo == 'M') {
            sexo = "Masculino";
        } else {
            sexo = "Femenino";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "Peso: " + peso + " Kg\n"
                + "Altura: " + altura + " centimetros\n";
    }
}
