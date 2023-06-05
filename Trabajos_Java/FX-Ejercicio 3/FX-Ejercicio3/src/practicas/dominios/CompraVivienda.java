package practicas.dominios;

import javax.xml.stream.util.EventReaderDelegate;

public class CompraVivienda 
{
    public static String compraVivienda(double costoVivienda){

        String entrada;        

            entrada = ""+(costoVivienda * 10)/100;
   
        return entrada;
    }
    public static String Saldo(double costoVivienda){

        String saldo;
        double entrada;        

            entrada = (costoVivienda * 10)/100;
            saldo = ""+(costoVivienda-entrada);
   
        return saldo;

    }
    public static String compraViviendaMeses(double costoVivienda){

        double entrada;
        String cuotaMensual;
        
            entrada = (costoVivienda * 10)/100;
            cuotaMensual = ""+(costoVivienda - entrada) / 12;

        return cuotaMensual;
    }
    
}
