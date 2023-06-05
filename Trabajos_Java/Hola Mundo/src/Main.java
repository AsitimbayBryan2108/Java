
public class Main {
	
	public static void aumentarVolumen(Television tv) {
        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();
	}
	
	public static void main(String[] args) {
        Television tv1= new Television(10);
        Television tv2= new Television(80,10);
        Television tv3= new Television(10);
        
        Television tv4 = new Television(100);
        tv4 =tv2;
        Television tv5 = tv4;
        
        tv4.encender();
        tv4.bajarVolumen();
        tv5.bajarVolumen();
        aumentarVolumen(tv5);
       
        System.out.println("tv1 volumen:" + tv1.getVolumen());
        System.out.println("tv2 volumen:" + tv2.getVolumen());
        System.out.println("tv3 volumen:" + tv3.getVolumen());
        System.out.println("tv4 volumen:" + tv4.getVolumen());
        System.out.println("tv5 volumen:" + tv5.getVolumen());
        
        Television.mensaje();
        System.out.println(Television.contador);
        
 //     System.out.println(tv4 ==tv2);
        System.out.println(tv4.equals(tv1));
        
 //       int volumen =10;
 //       int volumen1 =11;
 //       int volumen2 =volumen;
 //       volumen2 =100;
 //         System.out.println(volumen);
 //         System.out.println(volumen2);

    }

}


