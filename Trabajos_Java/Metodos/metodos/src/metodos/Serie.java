package metodos;
import java.util.Scanner;

public class Serie 
{

    public static void main (String[] args)
    {
        Scanner ingreso=new Scanner(System.in);
        final int LIMITE =1;
        //System.out.print("Ingrese numero:");
        //numero = Integer.parseInt(ingreso.nextline());
    


        //!LLamada al metodo
        String serie = serieUlam(20);
        System.out.printf("Serie:%s \n",serie);

        String serie1 = serieUlam(75);
        System.out.printf("Serie:%s \n",serie1);

        String serie2 = serieUlam(9);
        System.out.printf("Serie:%s \n",serie2);

        String serie3 = serieUlam(96);
        System.out.printf("Serie:%s \n",serie3);

    }
        //todo modulizar -- Bloque con nombre
        //* Parametros
        //* retorno

        //!nombre --> serieUlam
        //!parametros-->

        //!Entrada      --- Proceso      ---Salidad
        //*numero      generacion del     secuencia
        //*            sgte numeros       1. cadena
        //*            minima expresion   2. arreglos

        public static String serieUlam(int numero)
        {
            String cadenaSerie = " " + numero;
            final int LIMITE=1;
            //todo aqui va el proceso

            while(numero > LIMITE)
            {
                if(numero %2==0)
                    numero =numero/2;
                else
                    numero = numero *3+1;
                
                cadenaSerie = cadenaSerie   + " "+ numero;
            }
           
            return cadenaSerie;

        }

        public static String serieFibonacci(int n) {
            return null;
        }

}



    

