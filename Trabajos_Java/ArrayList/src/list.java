import java.util.List;
import java.util.ArrayList;
public class list 
{
	public static void main(String[]args) 
	{
		int[]array = new int[5];
		List milista=new ArrayList();
		milista.add(1);
		milista.add("Hola");
		milista.add(1.9);
		milista.add(new list());
		
		System.out.println(milista.size());
		
		int i =1;
		//System.out.println(milista.get(i));
		
		List<Integer> numeros = new ArrayList<Integer>();
		List<String> palabras = new ArrayList<String>();
		List<List> mains = new ArrayList<List>();
		
		numeros.add(10);
		numeros.add(90);
		
		palabras.add("hola");
		palabras.add("Mundo");
		
		System.out.println(palabras.get(0));
		//double suma = (int)milista.get(0)+(double)milista.get(2)+(double)milista.get(1);
		//System.out.println(suma);
		
		int total=numeros.get(0) + numeros.get(1);
		System.out.println(total);
	}

}


















