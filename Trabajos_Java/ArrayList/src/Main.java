import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[5];
		
		List miLista = new ArrayList();
		miLista.add(1);
		miLista.add("Hola");
		miLista.add(1.9);
		miLista.add(new Main());
		
		System.out.println(miLista.size());
		
		int i = 1;
		
		// System.out.println(miLista.get(i));
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		List<String> palabras = new ArrayList<String>();
		
		numeros.add(10);
		numeros.add(90);
		
		palabras.add("Hola");
		palabras.add("Mundo");
		
		System.out.println(palabras.get(0));
		
		List<Televisor> tvs = new ArrayList<Televisor>();
		Televisor tv1 = new Televisor(10);
		Televisor tv2 = new Televisor(40);
		
		tvs.add(tv1);
		tvs.add(tv2);
		
		System.out.println(tvs.size());
		
		tvs.get(0).encender();
		tvs.get(0).aumentarCanal();
		tvs.get(0).aumentarCanal();
		tvs.get(0).aumentarCanal();
		tvs.get(0).aumentarCanal();
		
		System.out.println(tv1.getencendido());
		System.out.println(tv1.getCanal());
		
	}

}
