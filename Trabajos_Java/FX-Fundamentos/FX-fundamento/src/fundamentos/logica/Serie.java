package fundamentos.logica;

public class Serie 
{
    public static String ulam (int numero)
    {
        String cadenaSerie=""+String.valueOf(numero);


        while (numero > 1 )
        {
            if(numero %2==0 )
                numero=numero/2;
            else
                numero=numero*3+1;
            cadenaSerie = cadenaSerie + " " + String.valueOf(numero);
        }
        return cadenaSerie;


    }
    
}
