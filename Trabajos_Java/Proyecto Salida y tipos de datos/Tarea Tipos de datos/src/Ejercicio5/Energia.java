package Ejercicio5;

public class Energia 
{
//todo Declaramos las constantes
static float KILOVATIO = 0.0945f;
static String EMPRESA = "FACTURA CONSUMO ENERGÍA ELÉCTRICA";
static String LINEA= "================================================";


public static void main (String[] args)
{

    //todo Declaracion de valores de ingreso

    String cedula="0945135445";
    String Cliente="Bryan Asitimbay";
    String kwk="0.0945";
    String bom="2%";
    String mun="2,5%";
    float bombero=0.2f;
    float municipio=0.25f;
    double lecturaAnterior=900;
    double lecturaActual=775;
    double consumo=lecturaAnterior-lecturaActual;
    double subtotal=consumo*KILOVATIO;
    double tasaBombero= subtotal*bombero;
    double tasaMunicipio= subtotal*municipio;
    double totalPagar=subtotal+tasaBombero+tasaMunicipio;

    //todo Muestra en la consola
    System.out.println("\t "+EMPRESA);
    System.out.println(LINEA);

    System.out.println("Cedula:" + cedula);
    System.out.println("Cliente:" + Cliente);
    System.out.println(LINEA);

    System.out.printf("LECTURA ANTERIOR:%.2f \t  LECTURA ACTUAL:%.2f \n ",lecturaAnterior,lecturaActual);
    System.out.printf("CONSUMO:%.2f \t          COSTO:\n ",consumo,kwk);
    System.out.println("SUBTOTAL:" + subtotal);
    System.out.printf("+TASA BOMBEROS:%.2f \t           TASA BOM.:%S \n ",tasaBombero,bom);
    System.out.printf("+TASA TASA MUNICIPAL:%.2f \t   TASA MUN.:%S \n ",tasaMunicipio,mun);
    
    System.out.printf("TOTAL A PAGAR: %.2f \n",totalPagar);
    System.out.println(LINEA);      
}
    
}
