
public class Main2 {

	public static void main(String[] args) {
		Tienda tienda1 = new Tienda();
		
		Televisor tv1 = new Televisor("001", "Tv LG", 2, 400);
		Televisor tv2 = new Televisor("002", "Tv samsung", 4, 300);
		Televisor tv3 = new Televisor("003", "Tv smart samsung", 2, 500);
		
		tienda1.agregarTv(tv1);
		tienda1.agregarTv(tv2);
		tienda1.agregarTv(tv3);
		
		String codigo = "003";
		
		Televisor result = tienda1.getTv(codigo);
		
		System.out.println("Antes de la venta");
		
		if(result!=null) {
			System.out.println(result.getDescripcion() + 
					", Cantidad: " + result.getCantidad() + 
					" Precio: " + result.getPrecio());
		} else {
			System.out.println("El televisor " + codigo + " no existe");
		}
				
		tienda1.vender(result, 2);
		
		System.out.println("Despues de la venta");
		
		result = tienda1.getTv(codigo);
		
		if(result!=null) {
			System.out.println(result.getDescripcion() + 
					", Cantidad: " + result.getCantidad() + 
					" Precio: " + result.getPrecio());
		} else {
			System.out.println("El televisor " + codigo + " no existe");
		}
		
		
	}

}

