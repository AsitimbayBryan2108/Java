package Arreglo;

public class Lista {
    private int [] valores;
    private int index = 0;
    private int num;

    public Lista (int num) {
        this.num = num;
        valores = new int [num];
    }

    public void agregar (int elemento) {
        if (index < valores.length) {
            valores [index] = elemento;
            index++;
        }
    }

    public int [] getValores() {
        return valores;
    }

    public void getValor(int posicion) {
        if(posicion <= this.num)
            System.out.println("En la posicion ["+ posicion +"] se encuentra el valor: "+valores[posicion]);
    }

    public boolean buscar (int elemento) {
        for(int i=0; i< this.num; i++) {
            if(valores[i] == elemento)
                System.out.println("El numero: "+ elemento +" se encuentra en la posicion: ["+ i +"]");
            else
                ;
        }
        return false;
    }

    public void ingresar(int posicion, int elemento) {
        //code validar que la posicion no sea mayor a length
        if (buscar(elemento) == false)
            valores[posicion] = elemento;
        System.out.println("El numero en la posicion: ["+ posicion +"] ha sido modificada por: "+ (valores[posicion]=elemento));
    }

}
