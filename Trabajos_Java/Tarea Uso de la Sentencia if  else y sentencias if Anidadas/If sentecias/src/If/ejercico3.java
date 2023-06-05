package If;
import java.util.Scanner;
public class ejercico3 
// En una fábrica de computadoras se planea ofrecer a los clientes un descuento que dependerá del
// número de computadoras que compre. Si las computadoras son menos de cinco se les dará un 10% de
// descuento sobre el total de la compra; si el número de computadoras es mayor o igual a cinco, pero
// menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un 40% de descuento. El
// precio de cada computadora es de $800.
{
    public static void main(String[] args) 
    {

        int precioComputadora = 800;
        int totalComputadoras;
        String descuento;
        double valorPagar;
    
        Scanner cantidadComputadoras = new Scanner(System.in);
    
        System.out.print("Cuantas computadoras va a comprar: ");
                totalComputadoras =cantidadComputadoras.nextInt();

                if (totalComputadoras < 5){
                    descuento = "10%";
                    valorPagar = (precioComputadora * totalComputadoras) * 0.1;}
                else if (totalComputadoras >= 5 && totalComputadoras <10){
                    descuento = "20%";
                    valorPagar = (precioComputadora * totalComputadoras) * 0.2;}
                else{
                    descuento = "40%";
                    valorPagar = (precioComputadora * totalComputadoras) * 0.4;
                    }
                
                System.out.println("El descuento es: "+descuento);
                System.out.println("El precio a pagar de su compra mas el de descuento es de: " +valorPagar);
    }
        
    
}
