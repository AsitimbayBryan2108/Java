package Arreglo;

public class Main2 {
    public static void main(String[] args) {
        //TODO auto-generated method stub
        Lista list1 = new Lista(5);
        Lista list2 = new Lista(3);
        

        list1.agregar(10);
        list1.agregar(1);
        list1.agregar(123);
        list1.agregar(3);
        list1.agregar(20);
        
        list2.agregar(2);
        list2.agregar(21);
        list2.agregar(3);
        list2.agregar(5);

        list1.agregar(76);
        
        //int valor =list1.getValor(2);
        //System.out.println(valor);
        
        //boolean result =list1.getValor(20);
        //System.out.println(result);
        
        list1.ingresar(2,110);
        int[] result= list1.getValores();

        for(int i=0; i<result.length; i++) {
            System.out.println("[" + i + "]: " +result[i]);
        }
    }
}
