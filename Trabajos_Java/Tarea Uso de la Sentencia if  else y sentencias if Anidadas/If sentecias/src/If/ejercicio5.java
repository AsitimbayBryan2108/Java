package If;
import java.util.Scanner;
public class ejercicio5
{

// El sistema de calificación americano (de Estados Unidos) se suele calcular de acuerdo al siguiente
// cuadro:
// Grado numérico Grado en letra
// Grado mayor o igual a 90 A
// Menor de 90 pero mayor o igual a 80 B
// Menor de 80 pero mayor o igual a 70 C
// Menor de 70 pero mayor o igual a 69 D
// Menor de 69 F
// Realizar un programa que muestre la representación de Grado en letra dado un grado numérico
// ingresado.
// {
    public static void main(String[] args) {
        int gradoNumerico;
        Scanner calificacion = new Scanner(System.in);
    
        System.out.print("Ingrese la calificacion: ");
        gradoNumerico = calificacion.nextInt();
    
        if(gradoNumerico >= 90)
            System.out.println("Su grado es A");
        else if (gradoNumerico<90 && gradoNumerico >= 80)
            System.out.println("Su grado es B");
        else if (gradoNumerico<80 && gradoNumerico >= 70)
            System.out.println("Su grado es C");
        else if (gradoNumerico<70 && gradoNumerico >= 69)
            System.out.println("Su grado es D");
        else
            System.out.println("Su grado es F");
        }
    
}
