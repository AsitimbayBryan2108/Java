package television;

public class main {
    public static void main(String[] args) {
        Television tv1= new Television();
        Television tv2= new Television();

        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();

        System.out.print("tv1 encendido:" + tv1.getEstaEncendido());
        System.out.print("tv1 volumen:" + tv1.getVolumen());
    } 


    
}
