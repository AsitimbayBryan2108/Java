
public class Televisor {
	private String codigo;
	private String descripcion;
	private double precio;
	private int cantidad;
	
	private boolean encendido=false;
	private int volumen;
	private int canal;
	
	public Televisor(String codigo, String descripcion, int cantidad,double precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public void setVolumen(int volumenParam) {
		volumen= volumenParam;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setCanal(int canalAum) {
		canal= canalAum;
	}
	public int getCanal() {
		return canal;
	}
	
	public boolean getencendido() {
		return encendido;
	}
	
	public Televisor() {
		volumen=5;
		canal=15;
	}
	public Televisor(int volumen) {
		this.volumen= volumen;
	
	}
	public Televisor(int volumen, int canal) {
		this.volumen= volumen;
		this.canal=canal;
	}
	public void apagar() {
		encendido=false;
	}
	public void encender() {
		encendido=true;
	}
	
	//0-100
	public void subirVolumen() {
		if(encendido&&volumen<100)
		volumen= volumen+ 1;
	}
	public void bajarVolumen() {
		if(encendido&&volumen>0)
		volumen=volumen-1;
	}
	public void aumentarCanal() {
		if(encendido&&canal<200)
		canal ++;
	}
	public void disminuirCanal() {
		if(encendido&&canal>0)
		canal --;
	}
}
