package practicas.patrones.repositorios;

import java.util.ArrayList;
import java.util.List;

import practicas.patrones.dominio.Producto;

public class ProductoListDao implements IProductoDAO
{
    List<Producto> productosLista = new ArrayList<>();

    public ProductoListDao()
    {
        productosLista.add(new Producto("Lavadora", 1, 300, 3, 336));
        productosLista.add(new Producto("Tostadora", 2, 30, 4, 33.6));
        productosLista.add(new Producto("Televisor", 3, 450, 6, 504));
    }

    @Override
    public void insertar(Producto producto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void actualizar(Producto producto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Producto buscar(int codigo) {
        for(Producto producto : productosLista)
        {
            if (producto.getCodigo() == codigo)
                return producto;
        }

        return null;
        // TODO Auto-generated method stub

    }

    @Override
    public void eliminar(Producto codigo) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Producto> consultarProductos() {
        // TODO Auto-generated method stub
        return productosLista;
    }

    



	

}
