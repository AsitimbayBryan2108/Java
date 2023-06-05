package Test;
import Clases.Monitor;
public class TestMonitor 
{
    public static void main(String[] args)
    {
            Monitor m1;

            m1= new Monitor();
            m1.setMarca("HP");
            m1.settamanio(17);
            m1.setColor("Gris");

            System.out.println("Objeto m1: "+m1);
            System.out.print("Presentando objeto 1: "+m1.getMarca());




    }
    
}
