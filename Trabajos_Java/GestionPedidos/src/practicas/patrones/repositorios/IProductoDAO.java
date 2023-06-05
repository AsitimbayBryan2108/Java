package practicas.patrones.repositorios;


import java.util.List;

import practicas.patrones.dominio.Producto;

public interface IProductoDAO 
{
    
        public void insertar(Producto producto);
        public void actualizar(Producto producto);
        public Producto buscar(int codigo);
        public void eliminar(Producto codigo);
        public List<Producto> consultarProductos();
     
}