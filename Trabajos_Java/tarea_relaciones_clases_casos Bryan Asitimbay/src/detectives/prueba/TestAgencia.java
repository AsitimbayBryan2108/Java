package detectives.prueba;
import detectives.dominio.*;

public class TestAgencia {
    public static void main(String[] args) {
        Agente agente = new Agente("0968252615", "Bryan Anthony", "Asitimbay", 
        "0968252615", "TRex", "Av. 25 de julio", 2108);
        Casos caso = new Casos( "0941273332", 2130, 0704, 12/9/2022, 
        "Lavado de activos", "Abierto");


        agente.presentarDatosFiliatorios();
        caso.presentarDatosFiliatorios();
    }
    
}
