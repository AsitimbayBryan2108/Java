package JBDC;

public class Producto_bd {
    private int codigo;
    private String nombre;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Producto_bd() {
    }

    public Producto_bd(String nombre, String descripcion, int cantidad, float precio) {
      this.nombre = nombre;
      this.descripcion = descripcion;
      this.cantidad = cantidad;
      this.precio = precio;
    }

    public int getCodigo() {
      return codigo;
    }

    public void setCodigo(int codigo) {
      this.codigo = codigo;
    }

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public String getDescripcion() {
      return descripcion;
    }

    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }

    public int getCantidad() {
      return cantidad;
    }

    public void setCantidad(int cantidad) {
      this.cantidad = cantidad;
    }

    public double getPrecio() {
      return precio;
    }

    public void setPrecio(double precio) {
      this.precio = precio;
    }
  }
