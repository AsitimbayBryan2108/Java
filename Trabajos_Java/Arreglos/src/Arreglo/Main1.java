package Arreglo;

public class Main1 
{
	public static void main(String[] args) 
	{
		int[] valores = new int[5];
		valores[3]=10;
		valores[1]=7;
		
		for(int i=0;i<valores.length;i++) {
			System.out.println("["+i+"]:"+valores[i]);
		}
		
		int buscar = 11;
		int posicion = -1;
		
		for(int i=0;i<valores.length;i++){
			if(valores[i]==buscar) {
				posicion=i;
				break;
			}
		}
		if(posicion<0) {
			System.out.println("No se encontro el  valor"+buscar);
				
			}else{
				System.out.println("El elemento"+buscar+"se encontro en la posicion"+posicion);
			}
		}
		
	}


