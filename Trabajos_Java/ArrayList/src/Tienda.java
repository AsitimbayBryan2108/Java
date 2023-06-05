import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private List<Televisor> tvs = new ArrayList<>();
	
	public void agregarTv(Televisor tv) {
		tvs.add(tv);
	}
	
	public void vender(Televisor tv, int cantidadVenta) {
		Televisor result = this.getTv(tv.getCodigo());
		
		if(result == null) {
			System.out.println("El televisor " + result.getCodigo() + " no existe");
			return;
		}
			
		int cantidadActual = result.getCantidad();
		
		if(cantidadVenta>cantidadActual) {
			System.out.println("El televisor " + 
					result.getCodigo() + 
					" no tiene la cantidad requerida");
			return;
		}
		
		result.setCantidad(result.getCantidad() - cantidadVenta);
	}
	
	public Televisor getTv(String codigo) {
		for(Televisor tv: tvs) {
			if(tv.getCodigo().equals(codigo))
				return tv;
		}
		return null;
	}
	
	public List<Televisor> getTvs() {
		return tvs;
	}
	
}
